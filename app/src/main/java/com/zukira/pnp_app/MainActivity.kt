package com.zukira.pnp_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnMi : Button
    private lateinit var btnTK :Button
    private lateinit var btnGalery :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnMi = findViewById(R.id.btn_informatika)
        btnTK = findViewById(R.id.btn_komputer)
        btnGalery = findViewById(R.id.btn_galeri)



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnMi.setOnClickListener(){
            val intent = Intent(this@MainActivity, ManajemenInformatikaActivity::class.java)
            startActivity(intent)
        }

        btnTK.setOnClickListener(){
            val intent = Intent(this@MainActivity, TeknikKomputerActivity::class.java)
            startActivity(intent)
        }

        btnGalery.setOnClickListener(){
            val intent = Intent(this@MainActivity, GalleryActivity::class.java)
            startActivity(intent)
        }
    }
}