package solutions.belov.tms_an_15_homework_lesson_17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class OnBoarding1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding1)

        val btn = findViewById<AppCompatButton>(R.id.on_boargind1_button)
        btn.setOnClickListener {
            startActivity(Intent(this, OnBoarding2Activity::class.java))
        }
    }
}