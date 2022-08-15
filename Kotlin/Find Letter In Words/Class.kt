package com.example.nesnetabanliprogramlama

class Harf {
    fun bul(kelime:String, harf1:Char){
        var sonuc = 0

        for (i in kelime){
            if (i == harf1){
                sonuc = sonuc + 1
            }
        }

        println("$kelime kelimesinde $harf1 harfi $sonuc kere geciyor.")
    }

}
