
When the client starts it send http GET request to config server like this
```shell
GET /foo/default HTTP/1.1
Accept: application/vnd.spring-cloud.config-server.v2+json
```

Examine the client side log. You can find something similar to this:
```shell
o.s.b.context.config.ConfigDataLoader    : Fetching config from server at : http://localhost:8888
o.s.b.context.config.ConfigDataLoader    : Located environment: name=foo, profiles=[default], label=null, version=e48dea902313e52570a790f58b3eee4a06bada75, state=null
```
