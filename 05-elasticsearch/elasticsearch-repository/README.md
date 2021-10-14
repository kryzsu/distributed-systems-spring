```shell
docker pull docker.elastic.co/elasticsearch/elasticsearch:7.15.0
```

```shell
docker run -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" docker.elastic.co/elasticsearch/elasticsearch:7.15.0
```