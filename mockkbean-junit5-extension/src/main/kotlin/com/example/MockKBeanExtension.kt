package com.example

import com.ninjasquad.springmockk.MockkBean
import com.ninjasquad.springmockk.SpykBean
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.api.extension.ParameterContext
import org.junit.jupiter.api.extension.ParameterResolver
import org.springframework.test.context.junit.jupiter.SpringExtension

class MockKBeanExtension : ParameterResolver {
    override fun supportsParameter(
        parameterContext: ParameterContext,
        extensionContext: ExtensionContext,
    ) = setOf(MockkBean::class.java, SpykBean::class.java).any { parameterContext.isAnnotated(it) }

    override fun resolveParameter(
        parameterContext: ParameterContext,
        extensionContext: ExtensionContext,
    ): Any? = SpringExtension
        .getApplicationContext(extensionContext)
        .getBean(parameterContext.parameter.type)
}
