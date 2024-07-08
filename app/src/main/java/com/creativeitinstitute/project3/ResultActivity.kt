package com.creativeitinstitute.project3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.creativeitinstitute.project3.databinding.ActivityPlayBinding
import com.creativeitinstitute.project3.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var score = intent.getIntExtra("score", 0)
        binding.scoreTV.text = "Score : $score"
    }
}