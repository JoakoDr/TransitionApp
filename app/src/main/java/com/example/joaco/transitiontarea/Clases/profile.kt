package com.example.joaco.transitiontarea.Clases

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import com.example.joaco.transitiontarea.R
import kotlinx.android.synthetic.main.profile.*

class profile : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)
        nameViewP.setText(getIntent().getExtras().getString("name"))
        surnameViewP.setText(getIntent().getExtras().getString("surname"))
        surname2ViewP.setText(getIntent().getExtras().getString("surname2"))
        ageView.setText(getIntent().getExtras().getString("birthday"))
        descView.setText(getIntent().getExtras().getString("interesPerso"))
        addressView.setText(getIntent().getExtras().getString("address"))
        postalView.setText(getIntent().getExtras().getString("postal"))
        cityView.setText(getIntent().getExtras().getString("city"))
        phoneView.setText(getIntent().getExtras().getString("phone"))
        typeView.setText(getIntent().getExtras().getString("typephone"))
        emailView.setText(getIntent().getExtras().getString("email"))
        hobby1View.setText(getIntent().getExtras().getString("Golf"))
        hobby2View.setText("Soccer")
        genderViewP.setText(getIntent().getExtras().getString("gender"))

//        imageView2.setImageResource(getIntent().getExtras().getInt("image"))


    }
}