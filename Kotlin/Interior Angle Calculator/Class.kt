package com.example.nesnetabanliprogramlama

class Triangle {
    fun calculate(edge:Int){
        var result = (edge - 2) * 180
        var oneAngle = result / edge

        println("Result:\n" +
                "$edge sided polygon" +
                "\nOne interior angle = $oneAngle" +
                "\nTotal interior angle = $result")
    }
}
