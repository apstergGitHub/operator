plugins {
    application
    id("org.springframework.boot") version "2.2.5.RELEASE"
    id("com.github.johnrengelman.shadow") version "6.0.0"
}

application {
    mainClassName = "service.operator.Launcher"
}

tasks {
    withType(com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar::class.java) {
        fun getArchiveBaseName() = project.objects.property(String::class.java).set("operator-fat")
    }
}

dependencies {
    implementation("com.expediagroup:graphql-kotlin-spring-server:3.3.0")
}