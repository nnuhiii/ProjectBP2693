package com.example.projectbp2693

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //instance
        val buttonLogin:Button = findViewById(R.id.btnlogin)
        //even btn login di klik
        buttonLogin.setOnClickListener {
            //cal home activity
            val intentHome = Intent(this, HomeActivity2::class.java)
            startActivity(intentHome)
        }
    }
}