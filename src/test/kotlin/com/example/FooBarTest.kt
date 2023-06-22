package com.example

import com.ninjasquad.springmockk.MockkBean
import io.mockk.every
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
@ExtendWith(MockKBeanExtension::class)
class FooBarTest(
	@Autowired val foo: Foo,
	@MockkBean val bar: Bar,
) {
	@Test
	fun `return foobaz instead foobar`() {
		every { bar.call() } returns "baz"

		val result = foo.call()

		assert(result == "foobaz")
	}
}
