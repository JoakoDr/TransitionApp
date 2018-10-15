package com.example.joaco.transitiontarea.Clases

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.joaco.transitiontarea.R
import kotlinx.android.synthetic.main.activity_log_in.*
import kotlinx.android.synthetic.main.formdata.*

class formdata : Activity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.formdata)

    }
    fun onLoginAction1(view: View) {
        Toast.makeText(this, "on login pressed", Toast.LENGTH_SHORT).show()
        val intent1 = Intent(this, personaldata::class.java)
        intent1.putExtra("email",getIntent().getExtras().getString("email"))
        intent1.putExtra("name",nombre.text.toString())
        intent1.putExtra("surname", apellido.text.toString())
        intent1.putExtra("surname2", apellido2.text.toString())
        intent1.putExtra("birthday", fecha.text.toString())
        intent1.putExtra("address", editaddress.text.toString())
        intent1.putExtra("postal", editpostalcode.text.toString())
        intent1.putExtra("city", editcity.text.toString())
        intent1.putExtra("typephone", seccion_spinner.toString())
        intent1.putExtra("phone", editphone.text.toString())
        startActivity(intent1)

    }
}