package com.example.dav4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val name = intent.extras?.getString("NAME","")

        buttonLast.setOnClickListener {

            val lastName: String = editTextLast.text.trim().toString()

            if (lastName.isEmpty()) {
                Toast.makeText(this, "Empty!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("LastName", lastName)
            finish()
            startActivity(intent)

        }

    }

}