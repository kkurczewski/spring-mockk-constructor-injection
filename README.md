# Constructor binding for [SpringMockk](https://github.com/Ninja-Squad/springmockk) and Junit5 extension

Enables Mockk + Spring testing without `lateinit var`.

Example:

```kotlin
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
```

## Instruction

Fetch springmockk with implemented change ([3265cfb](https://github.com/Ninja-Squad/springmockk/commit/3265cfb87e5bc1dcced070eff783e648a75582f8)) and build artifact locally:
```
cd ~/projects/springmockk/
./gradlew test publishToMavenLocal -x sign
```

Build gradle for current project:
```
./gradlew clean build
```