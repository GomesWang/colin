package com.colin.config

import com.fasterxml.jackson.core.util.DefaultIndenter
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter
import com.fasterxml.jackson.databind.SerializationFeature
import io.ktor.serialization.jackson.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*


/**
 *<p>this class</P>
 *
 * @author gomes
 * @date 2023/11/2 14:46
 */

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        jackson {
            configure(SerializationFeature.INDENT_OUTPUT, false)
            setDefaultPrettyPrinter(DefaultPrettyPrinter().apply {
                indentArraysWith(DefaultPrettyPrinter.FixedSpaceIndenter.instance)
                indentObjectsWith(DefaultIndenter("  ", "\n"))
            })
            // support java.time.* types，此处会报错，官方文档给出的配置如果需要自行查阅
          // registerModule(JavaTimeModule())
        }
    }
}