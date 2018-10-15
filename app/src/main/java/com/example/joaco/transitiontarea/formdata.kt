package com.example.joaco.transitiontarea

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast

class formdata : Activity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.formdata)

    }
    fun onLoginAction1(view: View) {
        Toast.makeText(this, "on login pressed", Toast.LENGTH_SHORT).show()
        val intent1 = Intent(this@formdata, personaldata::class.java)
        setContentView(R.layout.personaldata)
        startActivity(intent1)

    }
}