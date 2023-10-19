package com.driuft.androidkotlindebugging.ui

import android.graphics.Color
import java.util.Random


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R

class FavoriteNumber : AppCompatActivity() {

    private val favoriteNumber: TextView get() = findViewById(R.id.favorite_number)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite_number)


        val number: Int = 22
        favoriteNumber.text = "$number"
        favoriteNumber.text = "Todays lucky number is $number !"
    }

}
