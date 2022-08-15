package com.example.nesnetabanliprogramlama

import java.util.*

fun main(){
    var input = Scanner(System.`in`)
    var o4 =  Harf()

    println("Kelime giriniz: ")
    var kelime = input.next()

    println("Harf giriniz: ")
    var harf1 = input.next().single()

    var sonuc = o4.bul(kelime, harf1)
}
