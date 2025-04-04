package com.example.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    private lateinit var mainBinding: ActivityMainBinding
    private var number: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)

        enableEdgeToEdge()

        mainBinding.textViewResult.text = "0"

        mainBinding.btnZero.setOnClickListener { onNumberClicked("0") }
        mainBinding.btnOne.setOnClickListener { onNumberClicked("1") }
        mainBinding.btnTwo.setOnClickListener { onNumberClicked("2") }
        mainBinding.btnThree.setOnClickListener { onNumberClicked("3") }
        mainBinding.btnFour.setOnClickListener { onNumberClicked("4") }
        mainBinding.btnFive.setOnClickListener { onNumberClicked("5") }
        mainBinding.btnSix.setOnClickListener { onNumberClicked("6") }
        mainBinding.btnSeven.setOnClickListener { onNumberClicked("7") }
        mainBinding.btnEight.setOnClickListener { onNumberClicked("8") }
        mainBinding.btnNine.setOnClickListener { onNumberClicked("9") }

// Optional Clear Button
        mainBinding.btnClear.setOnClickListener {
            number = ""
            mainBinding.textViewResult.text = "0"
        }


    }

    private fun onNumberClicked(clickedNumber: String) {
        number += clickedNumber
        mainBinding.textViewResult.text = number
    }
}
