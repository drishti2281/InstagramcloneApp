package com.example.instagramcloneapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.instagramcloneapp.databinding.ActivityCreateStoryBinding


class CreateStoryActivity : AppCompatActivity() {
lateinit var binding: ActivityCreateStoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding= ActivityCreateStoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}