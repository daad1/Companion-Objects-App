package com.example.companionobjectsapp

import android.content.Context
import android.view.View
import android.widget.Toast

class CompObject(private val context: Context) {

    companion object {
         val dayMorining = R.drawable.daymor
         val night = R.drawable.nightba
    }

    fun set(layout: View, dayNight: String) {
        when (dayNight){
            "day" -> {
                layout.setBackgroundResource(dayMorining)
            }
            "night" -> {
                layout.setBackgroundResource(night)
            }
            else -> {
                Toast.makeText(context, "Please Click on Switch to Go Night", Toast.LENGTH_SHORT).show()
            }
        }
    }
}