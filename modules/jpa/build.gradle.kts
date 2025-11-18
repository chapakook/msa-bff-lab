plugins {
    id("org.jetbrains.kotlin.plugin.jpa")
    `java-test-fixtures`
}

dependencies {
    api("org.springframework.boot:spring-boot-starter-data-jpa")
    api("com.querydsl:querydsl-jpa::jakarta")
    runtimeOnly("com.mysql:mysql-connector-j")
    testImplementation("org.testcontainers:mysql")
    testFixturesImplementation("org.springframework.boot:spring-boot-starter-data-jpa")
    testFixturesImplementation("org.testcontainers:mysql")
}
