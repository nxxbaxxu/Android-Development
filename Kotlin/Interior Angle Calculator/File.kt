package com.example.nesnetabanliprogramlama

import java.util.*

fun main(){
    val input = Scanner(System.`in`)
    val classData = Triangle()

    println("Interior Angle Calculator")

    println("Enter number of edges: ")
    val edge = input.nextInt()

    classData.calculate(edge)
}
