package com.zukira.pnp_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ManajemenInformatikaActivity : AppCompatActivity() {
        private lateinit var btn_back1 : Button

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContentView(R.layout.activity_manajemen_informatika)

            btn_back1 = findViewById(R.id.btn_back1)

            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }

            btn_back1.setOnClickListener(){
                val intent = Intent(this@ManajemenInformatikaActivity, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }