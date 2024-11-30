package orc.zdertis420.playlistmaker

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val search = findViewById<Button>(R.id.search)
        val mediaLibrary = findViewById<Button>(R.id.media_library)
        val settings = findViewById<Button>(R.id.settings)

        search.setOnClickListener(this@MainActivity)
        mediaLibrary.setOnClickListener(this@MainActivity)
        settings.setOnClickListener(this@MainActivity)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.search -> startActivity(Intent(this, SearchActivity::class.java))
            R.id.media_library -> startActivity(Intent(this, MediaLibraryActivity::class.java))
            R.id.settings -> startActivity(Intent(this, SettingsActivity::class.java))
        }
    }
}