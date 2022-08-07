# Steps

1. cd into project
```shell
cd demo2
```

2. [Build Logger jar in a new terminal](../logger/README.md)

3. Copy Logger jar
```shell
cp ../logger/logger.jar logger.jar
```

5. Build `.class` files
```shell
javac -cp ./logger.jar org/gradledemo/demo2/**/*.java
```

3. Build executable `jar`
```shell
jar cf demo2.jar org/gradledemo/demo2/**/*.class
```

4. Run executable
```shell
java -cp logger.jar:demo2.jar org.gradledemo.demo2.Demo
```
