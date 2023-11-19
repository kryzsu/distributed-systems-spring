# hitchhikers application configured centrally (Eureka)

# Extend existing git configuration

### create and add to git the global properties
```shell
echo "instance-id=1" > hitchhikers.properties
echo "answer-id=52" >> hitchhikers.properties
echo "server.port=9100" >> hitchhikers.properties
git add -A .
git commit -m "Add hitchhikers.properties"
```

# testing first app
```shell
curl http://localhost:9000/ultimate-response
```

```shell
mvn package
```

```shell
mvn spring-boot:run
```

hitchhikers