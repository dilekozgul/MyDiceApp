package com.dilekozgul.mydiceapp

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.statusBarColor = ContextCompat.getColor(this, R.color.statusBarColor)
        supportActionBar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#FF005622")))
        window.navigationBarColor = ContextCompat.getColor(this, R.color.navigationBarColor)

        btnRolltheDice.setOnClickListener {

            imgDice1.setImageResource(rollTheDice())
            imgDice2.setImageResource(rollTheDice())

        }
    }

    fun rollTheDice(): Int {
        val diceVal = (1..6).random()

        when (diceVal) {

            1 -> return R.drawable.dice1
            2 -> return R.drawable.dice2
            3 -> return R.drawable.dice3
            4 -> return R.drawable.dice4
            5 -> return R.drawable.dice5
            6 -> return R.drawable.dice6
            else -> return R.drawable.dice6

        }
    }

}







