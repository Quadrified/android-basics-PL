package com.quadrified.firstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        /**
         * Extract EXTRA data from Intent passed by ActivityMain
         */
        val name = intent.getStringExtra("EXTRA_NAME")
        val age = intent.getIntExtra("EXTRA_AGE", 18)
        val country = intent.getStringExtra("EXTRA_COUNTRY")

//        findViewById<TextView>(R.id.tvPerson).text =
//            "${name} is ${age} years old and is from $country"

        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person
        findViewById<TextView>(R.id.tvPerson).text = person.toString()

        findViewById<Button>(R.id.btnGoBack).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.btnNextActivity).setOnClickListener {
            Intent(this, ThirdActivity::class.java).also {
                startActivity(it)
            }
        }

    }

}