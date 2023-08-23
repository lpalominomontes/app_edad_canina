package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.myapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //forma antigua de llamar a la vista
        /*setContentView(R.layout.activity_main)*/

        /*val ageEdit = binding.ageEdit
        val resultText = binding.resultText
        val button = binding.button*/

        //forma antigua de llamar a los id
        /*val ageEdit = findViewById<EditText>(R.id.age_edit)
        val resultText = findViewById<TextView>(R.id.result_text)
        val button = findViewById<Button>(R.id.button)*/

        //crear interactiones en log cat
        /*Log.v("MainActivity", "Activity created verbose")
        Log.d("MainActivity", "Activity created debug")
        Log.i("MainActivity", "Activity created info")
        Log.w("MainActivity", "Activity created warning")
        Log.e("MainActivity", "Activity created error")*/

        binding.button.setOnClickListener {
            val ageString = binding.ageEdit.text.toString()
            if (ageString.isNotEmpty()) {
                val ageInt = ageString.toInt()
                val result = ageInt * 7
                binding.resultText.text = getString(R.string.result_text, result)
            } else {
                Log.d("MainActivity", "Age string is empty")
                Toast.makeText(this, R.string.you_must_insert_your_age, Toast.LENGTH_SHORT).show()
            }
        }
    }
}