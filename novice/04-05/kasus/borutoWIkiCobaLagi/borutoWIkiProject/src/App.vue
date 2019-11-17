<template>
  <div id="app">
    <img src="./assets/boruto-title.png">
    <router-view/>
    <hr>
    <h3>All Characters</h3>

    <ul>
      <li v-for="value in res1" v-bind:key="value">
        {{value.Name}}
      </li>
    </ul>

    <button @click="getAllCharacters">Get All Characters</button>
    <hr> 

    <h3>Get Character Info by Name</h3>
  Name: <input v-model="example2.name" placeholder="Input name ... ">
  <div>
    <ul>
      <li>Name : {{res2[0].Name}}</li>      
      <li>Gender : {{res2[0].Gender}}</li>  
      <li>Family : {{res2[0].Family}}</li>          
      <li>Affiliation : {{res2[0].Affiliation}}</li>          
    </ul>
  </div>
  <button @click="getCharacterByName">Get Character</button>
  <hr>

    <h3>Get Characters by Gender</h3>
     <input type="radio" id="male" value="Male" v-model="example3.gender">
    <label for="male">Male</label>
    <br>
    <input type="radio" id="female" value="Female" v-model="example3.gender">
    <label for="female">Female</label>
    <br>  

  <ul>
      <li v-for="value in res3" v-bind:key="value">
        {{value.Name}}
      </li>
    </ul>
  
  <button @click="getCharactersByGender">Get Character</button>
  <hr>
  <br>
  <br>
  <br>
  <h2>This project is built for Praxis Academy study purpose by Aditya Forest Resananta</h2>
  <li>
        <a
          href="https://www.instagram.com/adityaforest/"
          target="_blank"
        >
          My Instagram Account
        </a>
  </li>
  <br>
  <li>
        <a
          href="https://github.com/AResananta"
          target="_blank"
        >
          My Github Account
        </a>
  </li>
  <br>
  <br>
  <br>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'App',
        
  data () {
    
    return {
      example1: '',
      example2: { name :''},
      example3: { gender: ''},

      res1: '',
      res2: [{Name : '' , Gender : '' , Family : '' , Affiliation : ''}],
      res3: ''   
               
    }
  },

  methods: {
    async getAllCharacters () {
      try {
        const res = await axios.post(
          'http://localhost:8082/graphql', {
          query: '{ characters {Name} }'
        })
        this.res1 = res.data.data.characters
        // for(var i=0;a<res1.length;i++)
        // {
        //   this.res1 = this.res1 + res.data.data.characters[i].Name + ", "
        // }                      

      } catch (e) {
        console.log('err', e)
      }
    },

    async getCharacterByName () {
      const res = await axios.post(
        'http://localhost:8082/graphql', {
        query: `
          query GetCharacterByName($Name: String!) {
            getCharacterByName(Name: $Name) {
              Name
              Gender
              Family
              Affiliation
            }
          }`,
          variables: {
            "Name": this.example2.name
          }
      })
      this.res2 = res.data.data.getCharacterByName
    },

    async getCharactersByGender () {
      const res = await axios.post(
        'http://localhost:8082/graphql', {
        query: `
          query GetCharactersByGender($Gender: String!) {
            getCharactersByGender(Gender: $Gender) {
              Name              
            }
          }`,
          variables: {
            "Gender": this.example3.gender
          }
      })
      this.res3 = res.data.data.getCharactersByGender
    }

  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
