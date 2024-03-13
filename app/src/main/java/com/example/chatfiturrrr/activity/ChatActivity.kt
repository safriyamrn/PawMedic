//package com.example.chatfiturrrr.activity
//
//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import com.example.chatfitur.R
//import com.example.chatfitur.databinding.ActivityChatBinding
//
//class ChatActivity : AppCompatActivity() {
//    private lateinit var binding: ActivityChatBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityChatBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        setListeners()
//    }
//
//    private fun setListeners() {
//        binding.textName.setOnClickListener {
//            startActivity(Intent(applicationContext, UsersActivity::class.java))
//        }
//
//        }
//}