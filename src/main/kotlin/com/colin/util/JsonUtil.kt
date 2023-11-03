package com.colin.util

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

/**
 *<p>this class</P>
 *
 * @author gomes
 * @date 2023/11/2 14:34
 */
object JsonUtil {

    private val objectMapper: ObjectMapper = jacksonObjectMapper()

    fun getJsonString(obj: Any?): String {
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj)
    }

    fun <T> readValue(content: String, clazz: Class<T>): T {
        return objectMapper.readValue(content, clazz)
    }

    fun <T> readValue(content: String, valueTypeRef: TypeReference<T>): T {
        return objectMapper.readValue(content, valueTypeRef)
    }


}

