package com.example.homeworkclicker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var CounterTable: TextView
    private var Counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CounterTable = findViewById(R.id.Counter_Text)
    }

    fun countUpOne(view : View){
        Counter++
        CounterTable.text = Counter.toString()
    }

    fun ToSecondActivity (view: View) {
        val randomIntent = Intent(this, SecondActivity::class.java)
        randomIntent.putExtra(SecondActivity.Count, Counter)
        startActivity(randomIntent)
    }

}