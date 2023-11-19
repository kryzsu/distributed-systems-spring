# openfeign application

It is a client of `spring-cloud-config-cleint`
which has the following endpoint
```
@GetMapping("/")
public String main() {
return "actual value:" + env.getProperty("info.foo");
}
```

## package the application
```shell
mvn package
```

## run the application
```shell
mvn spring-boot:run
```