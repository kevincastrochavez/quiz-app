package com.example.myquizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract.Constants
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_start : Button = findViewById(R.id.btn_start)
        val et_name : EditText = findViewById(R.id.et_name)
//        Event listener to fire after you entered your name anc clicked Start
        btn_start.setOnClickListener {
            if (et_name.text.isEmpty()) {
//                In case user didn't enter name
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show()
            } else {
//                Redirects you
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Costants.USER_NAME, et_name.text.toString())
                startActivity(intent)
//                Finishes the current activity
                finish()
            }
        }
    }
}