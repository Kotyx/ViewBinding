package com.example.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.viewbinding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val boton1= findViewById<Button>(R.id.b1)

        boton1.setOnClickListener {
            Toast.makeText(this@MainActivity, "He pulsado el boton 1 HURRAAAAA",Toast.LENGTH_LONG).show()
        }

        b2.setOnClickListener {
            Toast.makeText(this@MainActivity, "He pulsado el boton 2 HURRAAAAAY",Toast.LENGTH_LONG).show()
        }

        binding.b3.setOnClickListener {
            Toast.makeText(this@MainActivity, "He pulsado el boton 3 YEEEEEEEHAAAAAA",Toast.LENGTH_LONG).show()
        }

    }
}