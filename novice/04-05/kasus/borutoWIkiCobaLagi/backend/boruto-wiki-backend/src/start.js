import {MongoClient, ObjectId} from 'mongodb'
import express from 'express'
import bodyParser from 'body-parser'
import {graphqlExpress, graphiqlExpress} from 'graphql-server-express'
import {makeExecutableSchema} from 'graphql-tools'
import cors from 'cors'
import {prepare} from "../util/index"


const app = express()

app.use(cors())

const homePath = '/graphiql'
const URL = 'http://localhost'
const PORT = 8082
const MONGO_URL = 'mongodb://localhost:27017/BorutoWiki'



export const start = async () => {
  try {
    const db = await MongoClient.connect(MONGO_URL)

    const Characters = db.collection('Characters')    

    const typeDefs = [`
      type Query {
        character(_id: String): Character
        characters: [Character] 
        getCharacterByName(Name: String!): [Character]
        getCharactersByGender(Gender: String!): [Character]
      }

      type Character {
        _id: String
        Name: String
        Gender: String      
        Family: String      
        Affiliation: String      
      }            
      schema {
        query: Query        
      }
    `];

    const resolvers = {
      Query: {
        character: async (root, {_id}) => {
          return prepare(await Characters.findOne(ObjectId(_id)))
        },
        characters: async () => {
          return (await Characters.find({}).toArray()).map(prepare)
        },        
        getCharacterByName: async (root,{Name}) => {                    
          return(await Characters.find({Name}).toArray()).map(prepare)
        },
        getCharactersByGender: async (root,{Gender}) => {
          return(await Characters.find({Gender}).toArray()).map(prepare)
        }        
      },
      // Character: {
      //   comments: async ({_id}) => {
      //     return (await Comments.find({postId: _id}).toArray()).map(prepare)
      //   }
      // },      
      // Mutation: {
      //   createPost: async (root, args, context, info) => {
      //     const res = await Posts.insertOne(args)
      //     return prepare(res.ops[0])  // https://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#~insertOneWriteOpResult
      //   },
      //   createComment: async (root, args) => {
      //     const res = await Comments.insert(args)
      //     return prepare(await Comments.findOne({_id: res.insertedIds[1]}))
      //   },
      // },
    }

    const schema = makeExecutableSchema({
      typeDefs,
      resolvers
    })


    app.use('/graphql', bodyParser.json(), graphqlExpress({schema}))


    app.use(homePath, graphiqlExpress({
      endpointURL: '/graphql'
    }))

    app.listen(PORT, () => {
      console.log(`Visit ${URL}:${PORT}${homePath}`)
    })

  } catch (e) {
    console.log(e)
  }

}
