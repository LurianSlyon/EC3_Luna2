package com.lurian.ec3_luna.modal

data class Emojis(
    val name: String,
    val category: String, // Corregir el tipo de dato a String
    val group: String,
    val htmlCode: List<String>,
    val unicode: List<String>
)

