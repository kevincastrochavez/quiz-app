package com.example.myquizzapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract.Constants
import android.util.Log

class QuizQuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions2)

        val questionsList = Costants.getQuestions()
        Log.i("QuestionsList size is", "${questionsList.size}")
    }
}