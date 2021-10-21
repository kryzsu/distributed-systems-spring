
create the git repository storing the properties files

adding the global properties
```shell
cd $HOME
mkdir config-repo
cd config-repo
git init .
echo info.foo: bar > application.properties
git add -A .
git commit -m "Add application.properties"
```

testing
```shell
http://localhost:8888/foo/development
```