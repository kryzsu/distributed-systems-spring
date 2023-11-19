# article web CRUD application in memory


check the endpoint

## run the application
```shell
mvn spring-boot:run
```

```shell
open http://localhost:8080/v3/api-docs 
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
curl -X PUT http://localhost:8080/article \
   -H 'Content-Type: application/json' \
   -H 'Accept: application/json' \
   -d '{"id": 1, "author": "author2-m", "title": "title2", "pages": 123}'
```

## delete the second entity
```shell
curl -X DELETE http://localhost:8080/article/2
```

## get articles
```shell
curl -X GET http://localhost:8080/article 
```

if there is any json response then

http://localhost:8080/swagger-ui/index.html

replace the "https://petstore.swagger.io/v2/swagger.json" with 
the "http://localhost:8080/v3/api-docs" before the explore button

https://stackoverflow.blog/2020/03/02/best-practices-for-rest-api-design/

CRUD

* GET /articles/
* POST /articles/
* PUT /articles/:id
* DELETE /articles/:id