package com.zukira.pnp_app

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.zukira.pnp_app.adapter.GalleryAdapter

class GalleryActivity : AppCompatActivity() {
    private val images = arrayOf(
        R.drawable.pmbti,
        R.drawable.pmbakuntansi,
        R.drawable.pkm,
        R.drawable.wisuda,
        R.drawable.pmbpnp,
        R.drawable.trakindoalbert,
        R.drawable.pmbelektro,
        R.drawable.pmbmesin,
        R.drawable.pmban,
        R.drawable.pmbbi,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        // Set up the GridView for photos
        val gridView = findViewById<GridView>(R.id.gridView)
        val adapter = GalleryAdapter(this, images)
        gridView.adapter = adapter

        // Set up onClickListener for grid items
        gridView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, HeaderDetailGallery::class.java)
            intent.putExtra("imageResId", images[position]) // Pass the selected image ID to detail activity
            startActivity(intent)
        }
    }

}