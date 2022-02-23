import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.gretty") version "3.0.6"
    kotlin("jvm") version "1.6.10"
    war
}

gretty {
    servletContainer = "tomcat9"
    contextPath = "/"
}


repositories {
    mavenCentral()
}


val ktorVersion = "1.6.7"
dependencies {
    implementation("ch.qos.logback:logback-classic:1.2.10")

    implementation("io.ktor:ktor-server-core:$ktorVersion")
    implementation("io.ktor:ktor-server-tomcat:$ktorVersion")
    implementation("io.ktor:ktor-server-servlet:$ktorVersion")
}



tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.war {
    archiveFileName.set("${project.name}.war")
}
