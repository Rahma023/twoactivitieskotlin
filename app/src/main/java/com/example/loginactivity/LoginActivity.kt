package com.example.loginactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    lateinit var emailLbl:TextInputEditText
    lateinit var idpassword:TextInputEditText
    lateinit var buttonbtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setView()
        click()
    }

    fun setView(){
        emailLbl=findViewById(R.id.emailLbl)
        idpassword=findViewById(R.id.idpassword)
        buttonbtn=findViewById(R.id.buttonbtn)
    }
    fun click(){
        buttonbtn.setOnClickListener {
            val Login=Intent(baseContext,SignUpActivity::class.java)
            startActivity(Login)
        }
    }
}