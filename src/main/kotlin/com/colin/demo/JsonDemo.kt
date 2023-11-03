package com.colin.demo

import com.colin.util.JsonUtil
import com.fasterxml.jackson.core.type.TypeReference
import generator.domain.data.Moon

/**
 *<p>this class</P>
 *
 * @author gomes
 * @date 2023/11/2 14:26
 */



fun main() {
    val listOf = listOf("a", "b", "c")
    val jsonString = JsonUtil.getJsonString(listOf)
    val typeReference = object : TypeReference<List<String>>() {}
    val readValue = JsonUtil.readValue(jsonString, typeReference)
    println(readValue)

    val moon = Moon("moon",36,"earth");

    val cityString = JsonUtil.getJsonString(moon)
    val value = JsonUtil.readValue(cityString, Moon::class.java)
    println(value)

}

fun getUserList(){

}
