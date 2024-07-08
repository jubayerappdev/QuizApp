package com.creativeitinstitute.project3

data class Quiz(val question:String,
                val options: List<String>,
                val correctAnswerIndex :Int) {
}