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
    implementation("io.ktor:ktor-server-core:$ktorVersion")
    implementation("io.ktor:ktor-server-tomcat:$ktorVersion")
    implementation("io.ktor:ktor-server-servlet:$ktorVersion")
}


tasks.war {
    archiveFileName.set("ROOT.war")
}
