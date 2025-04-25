package vcmsa.ci.flashcardsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import vcmsa.ci.flashcardsapp.ui.theme.FlashcardsAppTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}