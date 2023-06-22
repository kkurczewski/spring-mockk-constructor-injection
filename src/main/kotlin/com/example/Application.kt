package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

@SpringBootApplication
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}

@Component
class Foo(private val bar: Bar) {
	fun call() = "foo${bar.call()}"
}

@Component
class Bar {
	fun call() = "bar"
}
