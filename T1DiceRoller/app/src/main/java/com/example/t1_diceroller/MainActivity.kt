package com.example.t1_diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollButton)

        rollButton.setOnClickListener {

            val dice = Dice(6)
            val diceRoll = dice.roll()
            val resultTextView: TextView = findViewById(R.id.textView)
            resultTextView.text = diceRoll.toString()


            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show();
        };
    }


}