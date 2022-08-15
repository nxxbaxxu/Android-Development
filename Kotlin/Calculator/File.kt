package com.example.deneme2

import java.util.*

fun main(){
    val girdi = Scanner(System.`in`)
    println("Asagidan secim yapmak icin sayi giriniz:\nToplama(1)\nCikarma(2)\nCarpma(3)\nBolme(4)")
    val secim = girdi.nextInt()

    println("1. sayiyi giriniz: ")
    val sayi1 = girdi.nextInt()
    println("2. sayiyi giriniz: ")
    val sayi2 = girdi.nextInt()

    when(secim){
        1 -> {
            println("Toplama Islemi")
            println("$sayi1 + $sayi2 = ${sayi1 + sayi2}")
        }
        2 -> {
            println("Cikarma Islemi")
            println("$sayi1 - $sayi2 = ${sayi1 - sayi2}")
        }
        3 -> {
            println("Carpma Islemi")
            println("$sayi1 * $sayi2 = ${sayi1 * sayi2}")
        }
        4 -> {
            println("Bolme Islemi")
            println("$sayi1 / $sayi2 = ${sayi1 / sayi2}")
        }
        else -> println("Listeden bir sayi giriniz")
    }
}
