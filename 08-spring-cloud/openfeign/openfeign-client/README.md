# openfeign application

It is a client of `spring-cloud-config-cleint`
which has the following endpoint

## package the application
```shell
mvn package
```

## run the application
```shell
mvn spring-boot:run
```
check the properties file
`spring.cloud.openfeign.client.config.articles.url=http://localhost:8080`

## get articles
```shell
curl -X GET http://localhost:12121/find-all-big-book 
```