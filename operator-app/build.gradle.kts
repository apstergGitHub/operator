plugins {
    application
    id("org.springframework.boot") version "2.3.1.RELEASE"
}

application {
    mainClassName = "com.roger.operator.Launcher"
}

tasks {
    bootJar {
        mainClassName = "com.roger.operator.Launcher"
    }
}

dependencies {
    implementation("com.expediagroup:graphql-kotlin-spring-server:3.3.0")
}