plugins {
    id("java")
    id("application")
}

group = "org.gradledemo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Types: https://www.baeldung.com/gradle-dependency-management
    implementation("org.apache.commons:commons-math3:3.6.1")
}

// Fat Jar config. Reference: https://gist.github.com/trevorwhitney/935cede21ec51879e97610f80aedcfc6
// tasks.jar {
//     manifest {
//         attributes["Main-Class"] = "com.gradledemo.demo3.Demo"
//     }
//     configurations["compileClasspath"].forEach { file: File ->
//         from(zipTree(file.absoluteFile))
//     }
//     duplicatesStrategy = DuplicatesStrategy.INCLUDE
// }
