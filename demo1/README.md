# Steps

1. cd into project
```shell
cd demo1
```

2. Build `.class` files
```shell
javac org/gradledemo/demo1/**/*.java
```

3. Build executable `jar`
```shell
jar cf demo1.jar org/gradledemo/demo1/**/*.class
```

4. Run executable
```shell
java -cp demo1.jar org.gradledemo.demo1.Demo
```
