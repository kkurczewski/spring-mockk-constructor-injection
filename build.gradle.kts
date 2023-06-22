plugins {
	id("org.springframework.boot") version "3.1.0"
	id("org.jetbrains.kotlin.jvm") version "1.8.21"
	id("org.jetbrains.kotlin.plugin.spring") version "1.8.21"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

allprojects {
	apply(plugin = "org.jetbrains.kotlin.jvm")

	repositories {
		mavenCentral()
		mavenLocal()
	}

	kotlin {
		jvmToolchain(17)
	}

	tasks.test {
		useJUnitPlatform()
	}

	dependencies {
		implementation(platform("org.springframework.boot:spring-boot-dependencies:3.1.0"))
	}
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")

	testImplementation(project(":mockkbean-junit5-extension"))
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}