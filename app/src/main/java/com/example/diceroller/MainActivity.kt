package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rollButton: Button = findViewById(R.id.button2)

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        val dice = Dice(6)
        val diceRollFirst = dice.roll()
        var diceRollSecond = dice.roll()
        val resultTextViewFirst: TextView = findViewById(R.id.textView)
        var resultTextViewSecond : TextView = findViewById(R.id.textView1)
        resultTextViewFirst.text = diceRollFirst.toString()
        resultTextViewSecond.text = diceRollSecond.toString()
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}