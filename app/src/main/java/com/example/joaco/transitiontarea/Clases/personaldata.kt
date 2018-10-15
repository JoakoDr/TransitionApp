package com.example.joaco.transitiontarea.Clases

import android.app.Activity
import android.os.Bundle
import android.view.View
import com.example.joaco.transitiontarea.R
import android.content.Intent
import android.net.Uri
import android.provider.MediaStore
import android.widget.*


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
}