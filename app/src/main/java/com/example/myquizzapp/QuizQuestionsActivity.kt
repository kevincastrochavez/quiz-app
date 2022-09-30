package com.example.myquizzapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract.Constants
import android.util.Log
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class QuizQuestionsActivity : AppCompatActivity() {
    private var progressBar: ProgressBar? = null
    private var tvProgress: TextView? = null;
    private var tVQuestion: TextView? = null;
    private var ivImage: ImageView? = null;

    private var tvOptionOne: TextView? = null;
    private var tvOptiontwo: TextView? = null;
    private var tvOptionThree: TextView? = null;
    private var tvOptionFour: TextView? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions2)

        progressBar = findViewById(R.id.progressBar)
        tvProgress = findViewById(R.id.tv_progress)
        tVQuestion = findViewById(R.id.tv_question)
        ivImage = findViewById(R.id.iv_image)
        tvOptionOne = findViewById(R.id.tv_option_one)
        tvOptiontwo = findViewById(R.id.tv_option_two)
        tvOptionThree = findViewById(R.id.tv_option_three)
        tvOptionOne = findViewById(R.id.tv_option_four)

        val questionsList = Costants.getQuestions()
        Log.i("QuestionsList size is", "${questionsList.size}")


        var currentPosition = 1
        val question : Question = questionsList[currentPosition - 1]
        ivImage?.setImageResource(question.image)
        progressBar?.progress = currentPosition
        tvProgress?.text = "$currentPosition/${progressBar?.max}"
        tVQuestion?.text = question.question
        tvOptionOne?.text = question.optionOne
        tvOptiontwo?.text = question.optionTwo
        tvOptionThree?.text = question.optionThree
        tvOptionFour?.text = question.optionFour
    }
}