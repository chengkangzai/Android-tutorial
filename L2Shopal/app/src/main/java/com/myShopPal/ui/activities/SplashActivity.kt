package com.myShopPal.ui.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.myShopPal.R

@Suppress("DEPRECATION")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        /**
         * Make splash activity full screen !
         */
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )


        /**
         * Force the software to sleep! Equivalent to
         */
        Handler(Looper.getMainLooper()).postDelayed(
            {
                startActivity(Intent(this@SplashActivity, LoginActivity::class.java));
                finish()
            },
            3000
        )

        /**
         * Not the cleanest solution to change typeface!
         * Replace by utils.
         */
//        val typeface: Typeface = Typeface.createFromAsset(assets, "Montserrat-Bold.ttf")
//        findViewById<TextView>(R.id.tv_app_name).typeface = typeface;
    }
}