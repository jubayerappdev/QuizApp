package com.creativeitinstitute.project3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.creativeitinstitute.project3.databinding.ActivityPlayBinding

class PlayActivity : AppCompatActivity() {

//    var currentIndex = 0

    private val viewModel : PlayViewModel by viewModels()
   private lateinit var binding: ActivityPlayBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showCurrentQuestion()

//        val quiz = LocalDataSource.questions[currentIndex]

//        binding.questionTV.text = quiz.question
//        binding.option1.text = quiz.options[0]
//        binding.option2.text = quiz.options[1]
//        binding.option3.text = quiz.options[2]
//        binding.option4.text = quiz.options[3]

        binding.nextBtn.setOnClickListener {

            val selectedIndex = binding.quizGroup.indexOfChild(findViewById(binding.quizGroup.checkedRadioButtonId))

            if (selectedIndex != -1){
                viewModel.checkAnswer(selectedIndex)
                setNextQuestion()
            }else{
                Toast.makeText(this,"Please select an option", Toast.LENGTH_LONG).show()
            }

//            setNextQuestion()

        }



    }

    private fun showCurrentQuestion(){
        val currentQuestion = viewModel.getCurrentQuestion()
        binding.questionTV.text = currentQuestion.question
        binding.option1.text = currentQuestion.options[0]
        binding.option2.text = currentQuestion.options[1]
        binding.option3.text = currentQuestion.options[2]
        binding.option4.text = currentQuestion.options[3]
        binding.quizGroup.clearCheck()

    }


    private fun setNextQuestion() {

        val nextQuestion = viewModel.getNextQuestion()

        if (nextQuestion != null){
            showCurrentQuestion()
        }else{
            val resultIntent = Intent(this@PlayActivity,ResultActivity::class.java)
            resultIntent.putExtra("score",viewModel.getScore())
            startActivity(resultIntent)

        }

//        currentIndex++

//        val quiz = LocalDataSource.questions[currentIndex]
//
//        binding.questionTV.text = quiz.question
//        binding.option1.text = quiz.options[0]
//        binding.option2.text = quiz.options[1]
//        binding.option3.text = quiz.options[2]
//        binding.option4.text = quiz.options[3]
    }
}