package com.myShopPal.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatRadioButton

class MSPRadioButton(context: Context, attrs: AttributeSet) : AppCompatRadioButton(context, attrs) {
    /**
     * The init block runs every time the class is instantiated.
     */
    init {
        // Call the function to apply the font to the components.
        this.applyFont()
    }

    private fun applyFont() {
        val typeface: Typeface =
            Typeface.createFromAsset(context.assets, "Montserrat-Bold.ttf")
        setTypeface(typeface)
    }
}