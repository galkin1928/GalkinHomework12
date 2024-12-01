package com.example.galkinhomework_12

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform