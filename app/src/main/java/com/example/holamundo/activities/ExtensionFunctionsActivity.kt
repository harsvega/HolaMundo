package com.example.holamundo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.holamundo.MainActivity
import com.example.holamundo.R
import com.example.holamundo.other.goToActivity
import com.example.holamundo.other.loadByURL
import com.example.holamundo.other.snackBar
import com.example.holamundo.other.toast
import kotlinx.android.synthetic.main.activity_extension_functions.*


class ExtensionFunctionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extension_functions)

        buttonToast.setOnClickListener { toast("I love extension functions!") }
        buttonSnackBar.setOnClickListener { snackBar("I love extension functions!", action = "Undo") {

            toast("Undo!!")

        } }
        buttonLoadByUrl.setOnClickListener { imageViewLoadedByUrl.loadByURL("https://udemy-images.udemy.com/course/480x270/1325930_f5f6_3.jpg") }
        buttonGoToActivity.setOnClickListener { goToActivity<MainActivity>() }
    }
}