package com.example.dav4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = intent.extras?.getString("NAME","")
        val lastName = intent.extras?.getString("LastName","")

        finishButton.setOnClickListener {

            val ageText: String = editTextAge.text.trim().toString()

            if (ageText.isEmpty()) {
                Toast.makeText(this, "Empty", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            var age : Int = ageText.toInt()

            val intent = Intent(this, FinishActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("LastName",lastName)
            intent.putExtra("AGE", age)
            finish()
            startActivity(intent)
        }

    }


}