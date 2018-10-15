package com.example.joaco.transitiontarea

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.view.View
import android.view.View.OnClickListener
import android.widget.CheckBox

class personaldata : Activity() {

    internal var button: Button? = null

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.personaldata)

        addButtonListener()

    }

    fun addButtonListener() {

        button = findViewById(R.id.imagebutton) as Button
        button!!.setOnClickListener { Toast.makeText(this@personaldata, "Image Changed!", Toast.LENGTH_SHORT).show() }
    }
    fun onCheckboxClicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked

            when (view.id) {
                R.id.checkbox_hobbie1 -> {
                    if (checked) {
                        // Love golf
                    } else {
                        // Remove the meat
                    }
                }
                R.id.checkbox_hobbie2 -> {
                    if (checked) {
                        // Cheese me
                    } else {
                        // I'm lactose intolerant
                    }
                }
                R.id.checkbox_hobbie3 -> {
                    if (checked) {
                        // Cheese me
                    } else {
                        // I'm lactose intolerant
                    }
                }
                // TODO: Veggie sandwich
            }
        }
    }
}