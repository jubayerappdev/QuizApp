package com.creativeitinstitute.project3

object LocalDataSource {

    val questions = mutableListOf<Quiz>(
        Quiz("What is the capital of BD?",
            listOf("Dhaka","Noakhali","Bogra","Barishal"),
            0
            ),
                Quiz("What is the Industrial capital of BD?",
        listOf("Dhaka","Chittagong","Bogra","Barishal"),
        1
    ),
        Quiz(
            "What is the capital of France?",
            listOf( "Berlin", "London","Paris", "Rome"),
            2
        ),
        Quiz(
            "Who painted the Mona Lisa?",
            listOf( "Vincent van Gogh","Leonardo da Vinci", "Pablo Picasso", "Michelangelo"),
            1
        ),
        Quiz(
            "What is the largest planet in our solar system?",
            listOf( "Saturn", "Mars", "Earth","Jupiter"),
            3
        ),
        Quiz(
            "Which animal is known as the 'king of the jungle'?",
            listOf( "Tiger", "Elephant","Lion", "Giraffe"),
            2
        ),
        Quiz(
            "What is the chemical symbol for water?",
            listOf("H2O", "CO2", "O2", "NaCl"),
            0
        ),
        Quiz(
            "Who is the author of 'To Kill a Mockingbird'?",
            listOf( "William Shakespeare", "J.K. Rowling","Harper Lee", "George Orwell"),
            2
        ),
        Quiz(
            "What is the tallest mountain in the world?",
            listOf("Mount Everest", "K2", "Kangchenjunga", "Lhotse"),
            0
        ),
        Quiz(
            "Which country is known as the 'Land of the Rising Sun'?",
            listOf("China","Japan",  "Korea", "Vietnam"),
            1
        ),
        Quiz(
            "Who is the first person to step on the moon?",
            listOf( "Buzz Aldrin", "Yuri Gagarin","Neil Armstrong", "Michael Collins"),
            2
        ),
        Quiz(
            "What is the largest ocean on Earth?",
            listOf( "Atlantic Ocean", "Indian Ocean", "Arctic Ocean","Pacific Ocean"),
            3
        )



    )





}