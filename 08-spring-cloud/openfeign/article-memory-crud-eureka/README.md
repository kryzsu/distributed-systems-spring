# article web CRUD application in memory


check the endpoint

## run the application
```shell
mvn spring-boot:run
```

run another instance
```shell
export SERVER_PORT=8081
mvn spring-boot:run
```

## insert new article
### id:1
```shell
curl -X POST http://localhost:8080/article \
   -H 'Content-Type: application/json' \
   -H 'Accept: application/json' \
   -d '{"id": 1, "author": "author", "title": "title", "pages": 123}'
```
### id:2
```shell
curl -X POST http://localhost:8080/article \
   -H 'Content-Type: application/json' \
   -H 'Accept: application/json' \
   -d '{"id": 2, "author": "author2", "title": "title2", "pages": 123}'
```

## replace the first entity
```shell
curl -X PUT http://localhost:8080/article/ \
   -H 'Content-Type: application/json' \
   -H 'Accept: application/json' \
   -d '{"id": 1, "author": "author2-m", "title": "title2", "pages": 90}'
```

## delete the second entity
```shell
curl -X DELETE http://localhost:8080/article/2
```

## get articles
```shell
curl -X GET http://localhost:8080/article 
```

* GET /articles/
* POST /articles/
* PUT /articles/:id
* DELETE /articles/:id