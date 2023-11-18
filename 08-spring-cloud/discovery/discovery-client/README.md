ask the actual application details by REST API call

```shell
http://localhost:8080/
```

ask all applications from REST
```shell
http://localhost:8080/all
```

check the server 
```shell
curl http://localhost:8761/
```
run first application
```shell
unset SERVER_PORT
mvn spring-boot:run
```

run another instance
```shell
export SERVER_PORT=8092
mvn spring-boot:run
```