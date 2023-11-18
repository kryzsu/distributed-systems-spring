
When the client starts it send http GET request to config server like this
```
GET /foo/default HTTP/1.1
Accept: application/vnd.spring-cloud.config-server.v2+json
```

Examine the client side log. You can find something similar to this:
```
o.s.b.context.config.ConfigDataLoader    : Fetching config from server at : http://localhost:8888
o.s.b.context.config.ConfigDataLoader    : Located environment: name=foo, profiles=[default], label=null, version=e48dea902313e52570a790f58b3eee4a06bada75, state=null
```

Additional resources
https://docs.spring.io/spring-boot/docs/1.0.0.RC5/reference/html/boot-features-external-config.html
https://stackoverflow.com/questions/30528255/how-to-access-a-value-defined-in-the-application-properties-file-in-spring-boot

```shell
curl http://localhost:8082/
```