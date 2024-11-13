package orc.zdertis420.playlistmaker

import android.os.Bundle
import android.os.PersistableBundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SearchActivity : AppCompatActivity()/*, View.OnClickListener*/ {

//    private lateinit var backToMain: ImageButton
//    private lateinit var searchLine: EditText
//    private lateinit var cancel: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_search)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.search_activity)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        bind()
//        showCancelButton()

    }

//    private fun bind() {
//        backToMain = findViewById(R.id.back_to_main)
//        searchLine = findViewById(R.id.search_line)
//        cancel = findViewById(R.id.cancel_button)

//        backToMain.setOnClickListener(this@SearchActivity)
//        searchLine.setOnClickListener(this@SearchActivity)
//        cancel.setOnClickListener(this@SearchActivity)

//        searchLine.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
//
//            }
//
//            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
//                showCancelButton()
//            }
//
//            override fun afterTextChanged(s: Editable?) {
//
//            }
//        })
//    }
//
//    private fun showCancelButton() {
//        if (searchLine.text.isNotEmpty()) {
//            cancel.alpha = 0.35F
//        } else {
//            cancel.alpha = 0F
//        }
//    }
//
//    override fun onClick(v: View?) {
//        when (v?.id) {
//            R.id.back_to_main -> finish()
//
////            R.id.cancel_button -> searchLine.text.clear()
//        }
//    }
//
//    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
//        super.onSaveInstanceState(outState, outPersistentState)
//        outState.putString("User input", searchLine.text.toString())
//    }
//
//    override fun onRestoreInstanceState(
//        savedInstanceState: Bundle?,
//        persistentState: PersistableBundle?
//    ) {
//        super.onRestoreInstanceState(savedInstanceState, persistentState)
//        searchLine.setText(savedInstanceState?.getString("User input"))
//    }
}