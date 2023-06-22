val springMockkVersion = "4.0.2-SNAPSHOT"

dependencies {
	implementation("org.junit.jupiter:junit-jupiter-api")
	implementation("org.springframework:spring-test")
	implementation("org.springframework:spring-context")
	api("com.ninja-squad:springmockk:${springMockkVersion}")
}
