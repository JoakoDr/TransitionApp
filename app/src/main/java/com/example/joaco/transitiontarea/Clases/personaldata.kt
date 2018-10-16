package com.example.joaco.transitiontarea.Clases

import android.app.Activity
import android.os.Bundle
import android.view.View
import com.example.joaco.transitiontarea.R
import android.content.Intent
import android.net.Uri
import android.provider.MediaStore
import android.widget.*
import com.example.joaco.transitiontarea.User.User
import kotlinx.android.synthetic.main.formdata.*
import kotlinx.android.synthetic.main.personaldata.*
import android.widget.TextView
import com.example.joaco.transitiontarea.R.string.surname2
import kotlinx.android.synthetic.main.profile.*


class personaldata : Activity() {

    internal var button: Button? = null
    var photoGallery: ImageView? = null
    var imageUrl: Uri? = null
    var objUser: User? = null



    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.personaldata)

        photoGallery = findViewById(R.id.imagebutton) as ImageView

        photoGallery!!.setOnClickListener {
            openGallery()
        }


    }

    fun onRadioButtonClicked(view: View) {
        // Is the button now checked?
        val checked = (view as RadioButton).isChecked

        // Check which radio button was clicked
        when (view.getId()) {
            R.id.radio_pirates -> if (checked)
                Toast.makeText(this, "¡Has pulsado Male!", Toast.LENGTH_SHORT).show()

            R.id.radio_ninjas -> if (checked)
                Toast.makeText(this, "¡Has pulsado Female!", Toast.LENGTH_SHORT).show()
        }// Males are the bests
        // femalessss
    }

    fun onCheckboxClicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked

            when (view.id) {
                R.id.checkbox_hobbie1 -> {
                    if (checked) {
                        // Love golf
                        checkbox_hobbie1.text.toString()

                    } else {
                        // Remove
                    }
                }
                R.id.checkbox_hobbie2 -> {
                    if (checked) {
                        // Love soccer
                        checkbox_hobbie2.text.toString()
                    } else {
                        // ermove
                    }
                }
                R.id.checkbox_hobbie3 -> {
                    if (checked) {
                        // lol
                        checkbox_hobbie3.text.toString()
                    } else {
                        //
                    }
                }
                // TODO: Veggie sandwich
            }
        }
    }

    private fun openGallery() {
        val gallery = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
        startActivityForResult(gallery, 1)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent) {
        if (resultCode == Activity.RESULT_OK && requestCode == 1) {
            imageUrl = data.data
            photoGallery!!.setImageURI(imageUrl)
        }
    }
    fun onLoginAction1(view: View) {
        Toast.makeText(this, "next", Toast.LENGTH_SHORT).show()
        val intent1 = Intent(this, profile::class.java)
        intent1.putExtra("email",getIntent().getExtras().getString("email"))
        intent1.putExtra("name",getIntent().getExtras().getString("name"))
        intent1.putExtra("surname", getIntent().getExtras().getString("surname"))
        intent1.putExtra("surname2", getIntent().getExtras().getString("surname2"))
        intent1.putExtra("birthday", getIntent().getExtras().getString("birthday"))
        intent1.putExtra("address", getIntent().getExtras().getString("address"))
        intent1.putExtra("postal", getIntent().getExtras().getString("postal"))
        intent1.putExtra("city", getIntent().getExtras().getString("city"))
        intent1.putExtra("typephone", getIntent().getExtras().getString("typephone"))
        intent1.putExtra("phone", getIntent().getExtras().getString("phone"))
        intent1.putExtra("image", imagebutton.id)
        intent1.putExtra("interesPerso", intperson.text.toString())
        intent1.putExtra("Golf", checkbox_hobbie1.text.toString())
        intent1.putExtra("radio_pirates", radio_pirates.text.toString())
        intent1.putExtra("radio_ninjas", radio_ninjas.text.toString())
        intent1.putExtra("gender", genderViewP.text.toString())
        startActivity(intent1)

    }
    fun onLoginAction2(view: View) {
        Toast.makeText(this, "back", Toast.LENGTH_SHORT).show()
        val intent1 = Intent(this, formdata::class.java)
        startActivity(intent1)

    }
}