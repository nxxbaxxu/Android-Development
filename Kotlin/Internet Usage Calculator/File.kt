package com.example.nesnetabanliprogramlama

import java.net.Inet4Address
import java.util.*

fun main(){
    var input = Scanner(System.`in`)
    var classData = Internet()

    println("Please enter your internet usege: ")
    var internet = input.nextInt()

    classData.calculate(internet)
}
