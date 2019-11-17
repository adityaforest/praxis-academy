Backend di folder boruto-wiki-backend
-------------------------------------
Database pake mongoDB (localhost 127.0.0.1 8080), ngambilnya pake graphQL (localhost 127.0.0.1 8082 /graphql), tidak pake micronaut-java karena error terus , jadi pake js :(

Frontend di folder boruto-wiki-frontend
---------------------------------------
Frontend pake vueJS (localhost 127.0.0.1 8081)
main code ada di App.vue (saya gabung semua disitu karena masih bingung kalo pisah2 :( ) , di App.vue saya access backend dengan cara post dari axios ke graphql (localhost 127.0.0.1 8082 /graphql) sesuai query / schema / resolver di backend (file start.js) , response/result dari axios sudah berbentuk javascript object jadi tinggal di pake / di tampilin di template app.vue nya

Belum ada Insert / Update database , baru ngambil aja (schema graphql baru ada Query , Mutation masih bingung ):(