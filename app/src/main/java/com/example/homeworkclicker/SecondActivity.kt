package com.example.homeworkclicker

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var RandomNumber: TextView
    private lateinit var background: View

    companion object {
        const val Count = "count"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        RandomNumber = findViewById(R.id.RandomNumber)
        showRandomNumber()

    }

    fun showRandomNumber() {
        val count = intent.getIntExtra(Count, 0)
        val random = (0..count).random()
        RandomNumber.text = random.toString()
        background = findViewById(R.id.backGround)
        val color = Color.argb(255, (0..255).random(), (0..255).random(), (0..255).random())
        background.setBackgroundColor(color)
    }
}