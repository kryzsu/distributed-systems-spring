# docker

## using existing docker image

pulling the image from the official dockerhub repository

```shell
docker pull mysql/mysql-server:latest
```

checking the image locally

```shell
docker images
```

start the server in detached mode

```
docker run --name=mysql -d mysql/mysql-server
```

checking the running docker container
```
docker ps
```

```
docker logs mysql
```

find the line `GENERATED ROOT PASSWORD:` and copy that into the clipboard

Try the password and mysql connection in the running docker image.

```
sudo docker exec -it mysql bash
```

You will get a new command prompt.

Try to login using the prevoiusly copied password (from clipboard)

```
mysql -uroot -p
```



Dockerfile (openjdk:11-jdk can be)

```dockerfile
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
```
