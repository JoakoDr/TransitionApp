package com.example.joaco.transitiontarea.Clases
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.joaco.transitiontarea.R
import com.example.joaco.transitiontarea.User.User
import kotlinx.android.synthetic.main.activity_log_in.*

class logIn : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
    }

    fun onLoginAction(view: View) {
        if(editText3.text.toString() == "" && editText4.text.toString() == "") {
            Toast.makeText(this, "BOTH EMPTY", Toast.LENGTH_SHORT).show()

        }
        else if(editText3.text.toString() == "")
        {
            Toast.makeText(this, "Empty User", Toast.LENGTH_SHORT).show()
        }
        else if (editText4.text.toString() == "")
        {
            Toast.makeText(this, "Empty Pass", Toast.LENGTH_SHORT).show()
        }
        else
        {
            Toast.makeText(this, "Log OK", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@logIn, formdata::class.java)
            intent.putExtra("email",editText3.text.toString())
            startActivity(intent)
        }
    }
}
