package solutions.belov.tms_an_15_homework_lesson_17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class RegistrationActivity : AppCompatActivity() {
    private var btn: AppCompatButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        btn = findViewById(R.id.registration_button)
        btn?.setOnClickListener {
            startActivity(Intent(this, SplashActivity::class.java))
        }
    }
}