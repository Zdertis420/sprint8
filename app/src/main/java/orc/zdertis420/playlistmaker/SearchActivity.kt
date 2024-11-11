package orc.zdertis420.playlistmaker

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SearchActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var backToMain: ImageButton
    private lateinit var searchLine: EditText
    private lateinit var cancel: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_search)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        backToMain = findViewById(R.id.back_to_main)
        searchLine = findViewById(R.id.search_line)
        cancel = findViewById(R.id.cancel_button)

        backToMain.setOnClickListener(this@SearchActivity)



    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.back_to_main -> finish()
        }
    }
}