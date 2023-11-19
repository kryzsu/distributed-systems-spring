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

## get articles
```shell
curl -X GET http://localhost:12121/find-all-big-book 
```