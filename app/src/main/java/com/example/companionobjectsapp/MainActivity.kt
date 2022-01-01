package com.example.companionobjectsapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.SwitchCompat
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {

    private lateinit var day_night_switch: SwitchCompat
    private lateinit var bg: ConstraintLayout
    private lateinit var tvWorld: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        day_night_switch = findViewById(R.id.day_night_switch)
        bg = findViewById(R.id.bg)
        tvWorld = findViewById(R.id.tvWorld)

        day_night_switch.setOnCheckedChangeListener { buttonView, isChecked ->

            if (isChecked) {
                val ComBackground = CompObject(this)
                bg.setBackgroundResource(R.drawable.nightba)
                tvWorld.setText("Good Night, \n No more Coffee its Time to sleep")
                tvWorld.setTextColor(Color.parseColor("#FF000000"));

            } else {
                val ComBackground = CompObject(this)
                bg.setBackgroundResource(R.drawable.daymor)
                tvWorld.setText("Good Morning, Drink some coffee")
                tvWorld.setTextColor(Color.parseColor("#FFEB3B"));
            }
        }
    }
}