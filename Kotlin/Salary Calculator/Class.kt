package com.example.nesnetabanliprogramlama

class Salary {

    fun calculate(day:Int, dayHour:Int = 8, hW:Int = 10, shift:Int = 20){
        // hW : hourly wage | default is $10
        // dayHour : working hour in a day | default is $20

        var dayToHour = day * dayHour

        if (dayToHour > 160){
            val shiftHour = dayToHour - 160
            val dayNoShift = dayToHour - shiftHour
            val normalSalary = dayNoShift * 10
            val shiftSalary = shiftHour * 20
            val total = normalSalary + shiftSalary

            println("Result:\n" +
                    "Your total day: $day\n" +
                    "Your total hour: $dayToHour\n" +
                    "Your total shift hour: $shiftHour\n" +
                    "Your normal salary : $normalSalary\n" +
                    "Your shift salary: $shiftSalary\n" +
                    "Total salary: $total\n")

        }
        else{
            val normalSalary = dayToHour * 10
            println("Result:\n" +
                    "Your total day: $day\n" +
                    "Your total hour: $dayToHour\n" +
                    "Your total shift hour: 0\n" +
                    "Your normal salary : $normalSalary\n" +
                    "Your shift salary: 0\n" +
                    "Total salary: $normalSalary\n")
        }


    }
}
