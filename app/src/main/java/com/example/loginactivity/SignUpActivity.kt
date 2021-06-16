package com.example.loginactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.textfield.TextInputEditText

class SignUpActivity : AppCompatActivity() {
    lateinit var etname:TextInputEditText
    lateinit var spingender:Spinner
    lateinit var etEmail:TextInputEditText
    lateinit var etPhone:TextInputEditText
    lateinit var etPassword:TextInputEditText
    lateinit var btnbutton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        setView()
        click()
    }
    fun setView(){
        etname=findViewById(R.id.etname)
        spingender=findViewById(R.id.spingender)
        etEmail=findViewById(R.id.etEmail)
        etPhone=findViewById(R.id.etPhone)
        etPassword=findViewById(R.id.etPassword)
        btnbutton=findViewById(R.id.btnbutton)
        var genders= arrayOf("Select Gender","Female","Male")
        var genderAdapter=ArrayAdapter(baseContext,android.R.layout.simple_spinner_item,genders)
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spingender.adapter=genderAdapter

    }
    fun click(){
        btnbutton.setOnClickListener {
            val Previous=Intent(baseContext,MainActivity::class.java)
            startActivity(Previous)

        }

    }
}