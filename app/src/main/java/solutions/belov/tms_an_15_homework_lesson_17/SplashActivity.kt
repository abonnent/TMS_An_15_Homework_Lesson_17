package solutions.belov.tms_an_15_homework_lesson_17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class SplashActivity : AppCompatActivity() {
    private var btn: AppCompatButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        btn = findViewById(R.id.splash_button)
        btn?.setOnClickListener {
            startActivity(Intent(this, OnBoarding1Activity::class.java))
        }
    }
}