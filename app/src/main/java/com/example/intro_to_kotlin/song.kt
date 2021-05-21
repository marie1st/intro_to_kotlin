package com.example.intro_to_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
fun main() {
    var Artist: String = "All4One"
    var Year_Released: Int = 1996
    var Genre: String = "R&B"
    var Duration: Double = 4.55
    var SongName: String = "I can love you like that"
    var Rank: Int = 1
    var isHit: Boolean = Rank is Int
    var price: Float = 1.99f
    var currency: Char = '$'
/*
    Log.d("Artist", Artist)
    Log.d("Year Release", Year_Released.toString())
    Log.d("Genre",Genre )
    Log.d("Duration of the song", Duration.toString())
    Log.d("Title", SongName)
    Log.d("Rank", Rank.toString())
    Log.d("is a hit", isHit.toString())
    Log.d("price per single", price.toString())
    Log.d("Currency", currency.toString())

 */
    print("Artist: ")
    println(Artist)
    print("Year Release: ")
    println(Year_Released.toString())
    print("Genre: ")
    println(Genre)
    println("Duration of the song: $Duration min.")
    print("Title: ")
    println(SongName)
    print("Rank: #")
    println(Rank.toString())
    print("$SongName is a hit, ")
    println(isHit.toString())
    print("It is sold at the price of ")
    print(currency.toString())
    print(price.toString())
    print(" per single")
}