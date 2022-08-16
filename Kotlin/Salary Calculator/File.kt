package com.example.nesnetabanliprogramlama

import java.util.*

fun main(){
    val input = Scanner(System.`in`)
    val classData = Salary()

    println("Please enter your total work days: ")
    var day = input.nextInt()

    classData.calculate(day)
}
