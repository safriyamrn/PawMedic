package com.example.chatfiturrrr.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.chatfiturrrr.R
import com.example.chatfiturrrr.adapter.UserAdapter
import com.example.chatfiturrrr.database.DatabaseHelper
import com.example.chatfiturrrr.databinding.ActivityUserBinding
import com.example.chatfiturrrr.model.User

class UserActivity : AppCompatActivity(  ) {
//    private lateinit var recyclerView: RecyclerView
//    private var list = mutableListOf(User)
    private lateinit var  binding: ActivityUserBinding
//    private lateinit var adapter: UserAdapter
//    private lateinit var databaseHelper: DatabaseHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

//        recyclerView =  findViewById(R.id.usersRecyclerView)
//
//        databaseHelper = DatabaseHelper(applicationContext)
//        adapter = UserAdapter(list)
//
//        recyclerView.adapter = adapter
//        recyclerView.layoutManager = LinearLayoutManager(applicationContext, RecyclerView.VERTICAL, false)
//        recyclerView.addItemDecoration((DividerItemDecoration(applicationContext, RecyclerView.VERTICAL)))


        binding.imageBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}