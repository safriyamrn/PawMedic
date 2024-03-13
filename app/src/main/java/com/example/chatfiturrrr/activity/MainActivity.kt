package com.example.chatfiturrrr.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.chatfiturrrr.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private  lateinit var  binding: ActivityMainBinding
//    private lateinit var  databaseHelper: DatabaseHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageSignOut.setOnClickListener{
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
            finish()
        }
    binding.fabNew.setOnClickListener{
        val intent = Intent(this, UserActivity::class.java)
        startActivity(intent)
    }



    }
}