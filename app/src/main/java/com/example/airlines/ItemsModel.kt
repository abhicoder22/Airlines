package com.example.airlines

import java.util.ArrayList


data class ItemsModel(
    val name:String, val seatAvailable: Int,
    val luggageAmount: Int,
    val flightNumber: String,
    val departureTime:String, val reachTime:String,
    val travelTime:String,
    val earningPoints: Double
)

fun getMyItemList(): ArrayList<ItemsModel> {
    val itemList = ArrayList<ItemsModel>()

    itemList.add(ItemsModel("Saudi Arabian Airlines", 9, 0,"SV-511(T)","18:30","23:55","5h 25m",78.9))
    itemList.add(ItemsModel("Nile Air", 9, 30,"NP-162(T)","19:30","23:55","15h 25m",83.3))
    itemList.add(ItemsModel("Kuwait Airways", 10, 15,"SV-511(T)","18:30","23:55","5h 25m",78.9))
    itemList.add(ItemsModel("Qatar Airlines", 15, 30,"SU-511(T)","20:30","22:55","8h 25m",89.9))
    itemList.add(ItemsModel("Airindia Airlines", 9, 10,"ST-512(T)","12:30","23:55","17h 25m",74.9))

    return itemList
}


