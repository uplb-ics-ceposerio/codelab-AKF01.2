package com.ceposerio.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}

//        val countUpButton : Button = findViewById(R.id.countup_button)
//        countUpButton.setOnClickListener { countUp() }
    }

    private fun rollDice(){
//        Toast.makeText(this,"button clicked", Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random()
        val diceImage : ImageView = findViewById(R.id.dice_image)
        val drawableResource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }

//    private fun countUp(){
//        val resultText: TextView = findViewById(R.id.result_text)
//        val resultValue = resultText.text.toString()
//
//        try {
//            val newResultValue = resultValue.toInt() + 1
//            if (newResultValue <= 6) {
//                resultText.text = newResultValue.toString()
//            }
//        }catch (nfe : NumberFormatException){
//            resultText.text = "1"
//        }
//
//
//    }
}
