package com.example.holamundo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.holamundo.R
import kotlinx.android.synthetic.main.activity_kotlin_android_extensions.*

class KotlinAndroidExtensionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_android_extensions)
// forma de hacer con java
        val btn = findViewById<Button>(R.id.buttonById)
        btn.setOnClickListener { Toast.makeText(this, "Click By ID!", Toast.LENGTH_SHORT).show() }
// forma de hacer lo con kotlin sin tener que usar findviewByid
        buttonByKAT.setOnClickListener { Toast.makeText(this, "Click By KAT!", Toast.LENGTH_SHORT).show() }
    }
}