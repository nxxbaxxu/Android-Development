package com.example.nesnetabanliprogramlama

class Internet {
    fun calculate(internet:Int, internetPrice: Int = 100, limitPrice:Int = 4){
        // Our internet limit is 50GB and price is $100
        // If you exceed the limit you have to pay 1GB for $4

        if (internet > 50){
            var exceedOfInternet = internet - 50
            var exceedPrice = exceedOfInternet * 4
            var total = internetPrice + (exceedOfInternet * limitPrice)

            println("Result:\n" +
                    "Default package is 50GB / $100\n" +
                    "The internet that you spend: $internet GB\n" +
                    "Remaining quota: 0\n" +
                    "Internet quota exceed: $exceedOfInternet GB\n" +
                    "Internet exceed price: $$exceedPrice\n" +
                    "Total price: $$total")
        }
        else{
            var quota = 50
            var remain = 50 - internet

            println("Result:\n" +
                    "Default package is 50GB / $100\n" +
                    "The internet that you spend: $internet GB\n" +
                    "Remaining quota: $remain GB\n" +
                    "Internet quota exceed: $0\n" +
                    "Internet exceed price: $0\n" +
                    "Total price: $100")
        }


    }
}
