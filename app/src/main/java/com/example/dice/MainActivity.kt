package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOne.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice()
    {
        val dice = Dice(numSides =  6)
        val sides = dice.diceRoll()
        val dR = when(dice.diceRoll())
        {
            1-> R.drawable.perspective_dice_six_faces_one
            2-> R.drawable.perspective_dice_six_faces_two
            3-> R.drawable.perspective_dice_six_faces_three
            4-> R.drawable.perspective_dice_six_faces_four
            5-> R.drawable.perspective_dice_six_faces_five
            else -> R.drawable.dice_six
        }
        binding.imageview.setImageResource(dR)
    }
}
class Dice(private val numSides : Int)
{
    fun diceRoll() : Int
    {
        return (1..numSides).random()

    }
}
