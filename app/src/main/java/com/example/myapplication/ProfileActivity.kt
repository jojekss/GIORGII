package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.auth.FirebaseAuth

class ProfileActivity : AppCompatActivity() {

    private lateinit var buttonLogout : Button
    private lateinit var buttonPasswordChange : Button
    private lateinit var buttonstart : Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        init()

        registrationListeners()


    }

    private fun init(){
        buttonLogout = findViewById(R.id.buttonLogout)
        buttonPasswordChange = findViewById(R.id.buttonPasswordChange)
        buttonstart = findViewById(R.id.buttonstart)
    }

    private fun registrationListeners(){
        buttonLogout.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            startActivity(Intent(this, LoginActivity::class.java))

        }

        buttonstart.setOnClickListener(){
            startActivity(Intent(this, Navbar::class.java))
            finish()
        }



    }

}