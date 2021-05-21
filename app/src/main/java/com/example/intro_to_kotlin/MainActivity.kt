package com.example.intro_to_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("test", "new")
/*
        // variables_texts (import android.util.Log)
        // val/var name: type
        // name = value
        // Ints, Floats, Doubles, Booleans, Chars, Strings

        var todaysDate: Int = 21
        todaysDate = 22
        val daysInMarch: Int = 31

        var bankBalance: Float = 500.50f
        val itemCost: Double = 100.99

        var isDoorOpen: Boolean = true

        val spaceCharacter: Char = ' '

        val firstname: String = "Mariebouquin"

        //OPerations
        // assignment: = !
        //arithmetic: + - * / % += -= *= /=
        //conditional: > >= < <= != == is

        val isDoorClosed: Boolean = !isDoorOpen

        val tomorrowsDate: Int = todaysDate + 1
        // bankBalance = bankBalance - 5.5f
        bankBalance -= 5.5f

        val modTodaysDate = todaysDate % 5

        val isNameString: Boolean = firstName is String

        val fullName: String = firstName + "S."

        val isGreater: Boolean = firstName > "S."

        modTodaysDate.toString()

        val stringTodaysDate: String = todaysDAte.toString()

        //Nullables
        var lastName: String? = "S."   //nullable
        lastName?.length   //nullable
        lastname!!.length  //definitely not null
        //val lengthy: Int? = lastName.length  //nullable
        val lengthy: Int = lastName!!.length  //definitely not null
*/






    }
}