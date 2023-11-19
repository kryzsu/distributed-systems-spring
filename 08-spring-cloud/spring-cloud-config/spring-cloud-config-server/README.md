# Spring Configuration server

## create the git repository storing the properties files

According to config server properties:
`spring.cloud.config.server.git.uri= file://${user.home}/config-repo`

We have to manage the central properties files in the
`config-repo` in home.

### create git repository
```shell
cd $HOME
mkdir config-repo
cd config-repo
git init .
```

### create and add to git the global properties
```shell
echo info.foo: bar > application.properties
git add -A .
git commit -m "Add application.properties"
```

### start first instance
```shell
mvn spring-boot:run
```


### open in browser
```shell
open http://localhost:8888/foo/development
```

### get from command line
```shell
curl http://localhost:8888/foo/development/master
```