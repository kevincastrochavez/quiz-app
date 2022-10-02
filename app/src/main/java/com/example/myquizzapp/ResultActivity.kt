package com.example.myquizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName : TextView = findViewById(R.id.tv_name)
        val tvScore : TextView = findViewById(R.id.tv_score)
        val btnFinish : Button = findViewById(R.id.btn_finish)

//        Grabbed info from user and questions
        tvName.text = intent.getStringExtra(Costants.USER_NAME)
        val totalQuestions = intent.getIntExtra(Costants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Costants.CORRECT_ANSWERS, 0)

//        Display dynamic message based on the user name and how many questions
//        were answered correctly
        tvScore.text = "Your score is $correctAnswers out of $totalQuestions"

        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}