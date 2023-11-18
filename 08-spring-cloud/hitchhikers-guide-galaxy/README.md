# testing first app
```shell
curl http://localhost:9000/ultimate-response
```

```shell
open http://localhost:9000/ultimate-response
```

### start first instance
```shell
mvn spring-boot:run
```

### start another instance
```shell
export SERVER_PORT=9001
mvn spring-boot:run
```