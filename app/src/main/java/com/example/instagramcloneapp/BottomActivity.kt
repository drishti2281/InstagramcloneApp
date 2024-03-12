package com.example.instagramcloneapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.instagramcloneapp.databinding.ActivityBottomBinding
import com.example.instagramcloneapp.databinding.ActivityMainBinding

class BottomActivity : AppCompatActivity() {
    lateinit var binding: ActivityBottomBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBottomBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}