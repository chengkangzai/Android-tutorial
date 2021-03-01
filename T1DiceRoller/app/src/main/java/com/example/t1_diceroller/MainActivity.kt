package com.example.t1_diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollButton)

        rollButton.setOnClickListener {
            rollDice();
        };
    }

    private fun rollDice() {
        val diceRoll = Dice(6).roll();
        val resultImageView: ImageView = findViewById(R.id.imageView)

        val drawableResource = when (diceRoll.toString()) {
            "1" -> R.drawable.dice_1
            "2" -> R.drawable.dice_2
            "3" -> R.drawable.dice_3
            "4" -> R.drawable.dice_4
            "5" -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        resultImageView.setImageResource(drawableResource)

        Toast.makeText(this, "Dice Rolled! It is $diceRoll", Toast.LENGTH_SHORT)
            .show()
    }


}