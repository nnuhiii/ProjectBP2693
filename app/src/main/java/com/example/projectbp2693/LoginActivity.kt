package com.example.projectbp2693

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //instance
        val buttonLogin:Button = findViewById(R.id.btnlogin)
        val txtUsername:EditText=findViewById(R.id.editTextUsername)
        val txtPassword:EditText=findViewById(R.id.editTextPassword)
        val logModel = LoginModel()
        //even btn login di klik
        buttonLogin.setOnClickListener {

            //input
            logModel.username = txtUsername.text.toString()
            logModel.password = txtPassword.text.toString()
            //validasi login
            if(logModel.loginCek() == true) {

                //cal home activity
                val intentHome = Intent(this, HomeActivity2::class.java)
                startActivity(intentHome)
            }
            else {
                Toast.makeText(this, "Username/Password salah", Toast.LENGTH_SHORT).show()
            }

        }
    }
}