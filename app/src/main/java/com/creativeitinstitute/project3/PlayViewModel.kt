package com.creativeitinstitute.project3

import android.util.Log
import androidx.lifecycle.ViewModel

class PlayViewModel :ViewModel() {
   private val quizList = LocalDataSource.questions


   private var currentIndex = 0
   private var score = 0

    fun getCurrentQuestion(): Quiz{

        return quizList[currentIndex]

    }
    fun getNextQuestion():Quiz? {

        currentIndex++

        return if (currentIndex < quizList.size){
            quizList[currentIndex]
        }else{
            null
        }

    }
    fun checkAnswer(selectedIndex:Int){
        val currentQuiz = quizList[currentIndex]

        if(selectedIndex == currentQuiz.correctAnswerIndex){
            score +=2
        }else{
            score--
        }
        Log.d("TAG", "checkAnswer: $score")
        Log.d("TAG", "checkAnswer: $selectedIndex")
        Log.d("TAG", "checkAnswer: ${currentQuiz.correctAnswerIndex}")


    }
    fun getScore(): Int{
        return score


    }

}