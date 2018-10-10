package com.example.joaco.transitiontarea
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class logIn : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
    }

    fun onLoginAction(view: View) {
        Toast.makeText(this, "on login pressed", Toast.LENGTH_SHORT).show()
        val intent = Intent(this@logIn, formdata::class.java)
        startActivity(intent)
    }
}
