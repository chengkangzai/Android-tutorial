package com.myShopPal.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.myShopPal.R
import kotlinx.android.synthetic.main.activity_forget_password.*

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)

        this.setupActionBar()
    }

    /**
     * Set up action Bar
     */
    private fun setupActionBar() {

        setSupportActionBar(toolbar_forgot_password_activity)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_white_color_back_24dp)
        }

        toolbar_forgot_password_activity.setNavigationOnClickListener { onBackPressed() }
    }
}