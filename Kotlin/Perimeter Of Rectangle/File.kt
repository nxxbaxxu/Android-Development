package com.example.nesnetabanliprogramlama

import java.util.*

fun main(){
    var input = Scanner(System.`in`)
    var hesap = Dikdortgen()

    println("Dikdortgen Cevre Hesaplama")

    println("A kenari giriniz: ")
    var a = input.nextInt()

    println("B kenari giriniz: ")
    var b = input.nextInt()


    var sonuc = hesap.cevre(a, b)
}
