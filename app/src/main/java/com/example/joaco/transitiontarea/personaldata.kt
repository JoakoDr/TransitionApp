package com.example.joaco.transitiontarea

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.view.View
import android.view.View.OnClickListener

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
}