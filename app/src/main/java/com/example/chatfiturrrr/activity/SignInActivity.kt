package com.example.chatfiturrrr.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.chatfiturrrr.R
import com.example.chatfiturrrr.database.DatabaseHelper
import com.example.chatfiturrrr.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    private lateinit var databaseHelper: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        databaseHelper = DatabaseHelper(this)

        binding.btnSignIn.setOnClickListener{
            val signupUsername = binding.etName.text.toString()
            val signupEmail = binding.etEmail.text.toString()
            val signupPassword = binding.etPassword.text.toString()
            signInDatabase(signupUsername,signupEmail, signupPassword)
        }
        binding.tvCreateNewAccount.setOnClickListener{
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun signInDatabase(username: String, email: String, password: String){
        val userExist = databaseHelper.readUser(username, email, password)
        if (userExist){
            Toast.makeText(this, "Sign In Succesfull", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }else{
            Toast.makeText(this, "Sign In Failed", Toast.LENGTH_SHORT).show()
        }
    }
}