plugins {
    id("java")
}

group = "org.gradledemo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {}

tasks.register("hello") {
    doLast() {
        print("Hello ")
    }
}

tasks.register("world") {
    dependsOn("hello")
    doLast() {
        println("World!")
    }
}

tasks.register("world2") {
    dependsOn("hello", "world")
    doLast() {
        println("from World 2!")
    }
}
