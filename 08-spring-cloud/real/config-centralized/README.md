# hitchhikers application configured centrally (Eureka)

# Extend the existing git configuration

### create and add the `hitchhikers.properties` to git the global properties
```shell
echo "instance-id=1" > hitchhikers.properties
echo "answer-id=52" >> hitchhikers.properties
echo "server.port=9100" >> hitchhikers.properties
git add -A .
git commit -m "Add hitchhikers.properties"
```

## run the application
```shell
mvn spring-boot:run
```

## testing first app
```shell
open http://localhost:9000/oraculum/ultimate-response
```