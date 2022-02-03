package uz.pdp.bounceanimationkotlin

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        val button = findViewById<Button>(R.id.button)
        val imageView = findViewById<ImageView>(R.id.image)

        button.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext,R.anim.bounce)
            imageView.startAnimation(animation)
        }
    }
}