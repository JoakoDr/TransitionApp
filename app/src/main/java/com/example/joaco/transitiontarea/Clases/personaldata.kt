package com.example.joaco.transitiontarea.Clases

import android.app.Activity
import android.os.Bundle
import android.view.View
import com.example.joaco.transitiontarea.R
import android.content.Intent
import android.net.Uri
import android.provider.MediaStore
import android.widget.*
import kotlinx.android.synthetic.main.formdata.*
import kotlinx.android.synthetic.main.personaldata.*


class personaldata : Activity() {

    internal var button: Button? = null
    var photoGallery: ImageView? = null
    var imageUrl: Uri? = null

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.personaldata)

        photoGallery = findViewById(R.id.imagebutton) as ImageView

        photoGallery!!.setOnClickListener {
            openGallery()
        }


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
        startActivity(intent1)

    }
    fun onLoginAction2(view: View) {
        Toast.makeText(this, "next", Toast.LENGTH_SHORT).show()
        val intent1 = Intent(this, formdata::class.java)
        startActivity(intent1)

    }
}