plugins {
	java
	id("org.springframework.boot") version "3.3.4"
	id("io.spring.dependency-management") version "1.1.4"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
description = "final project for WebProg"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(23)
	}
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	// Spring Boot Starters
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-security")
	implementation("org.springframework.boot:spring-boot-starter-validation")

	// Database
	runtimeOnly("com.mysql:mysql-connector-j")

	// Development Tools
	developmentOnly("org.springframework.boot:spring-boot-devtools")

	// Lombok
	compileOnly("org.projectlombok:lombok")
	annotationProcessor("org.projectlombok:lombok")

	// Validation
	implementation("jakarta.validation:jakarta.validation-api")

	// JWT
	implementation("io.jsonwebtoken:jjwt-api:0.11.5")
	runtimeOnly("io.jsonwebtoken:jjwt-impl:0.11.5")
	runtimeOnly("io.jsonwebtoken:jjwt-jackson:0.11.5")

	// Testing
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.security:spring-security-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.named<org.springframework.boot.gradle.tasks.bundling.BootJar>("bootJar") {
	exclude("org/projectlombok/lombok/**")
}