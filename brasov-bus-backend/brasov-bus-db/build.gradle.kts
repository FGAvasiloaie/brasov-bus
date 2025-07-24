plugins {
    java
}

dependencies {
    implementation("com.h2database:h2")
    implementation("org.liquibase:liquibase-core")
}

repositories {
    mavenCentral()
}
