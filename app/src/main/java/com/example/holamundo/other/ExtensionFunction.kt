package com.example.holamundo.other

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.example.holamundo.R
import com.google.android.material.snackbar.Snackbar

import com.squareup.picasso.Picasso


fun Int.isNatural() = this >= 0

fun Activity.toast(message: CharSequence, duration: Int = Toast.LENGTH_LONG) = Toast.makeText(this, message, duration).show()

fun Activity.toast(resourceId: Int, duration: Int = Toast.LENGTH_SHORT) = Toast.makeText(this, resourceId, duration).show()

//  android:id="@+id/container" se debe colocar en antivity .xml segun la variable
fun Activity.snackBar(message: CharSequence, view: View? = findViewById(R.id.container),

                      //
                      duration: Int = Snackbar.LENGTH_INDEFINITE, action: String? = null,
                      actionEvt: (v: View) -> Unit = {}) {

    if (view != null) {
        val snackBar = Snackbar.make(view!!, message, duration)
        if (!action.isNullOrEmpty()) {
            snackBar.setAction(action, actionEvt)
        }
        snackBar.show()
    }

}

fun ViewGroup.inflate(layoutId: Int) = LayoutInflater.from(context).inflate(layoutId, this, false)!!

fun ImageView.loadByURL(url: String) = Picasso.get().load(url).into(this)

inline fun <reified T : Activity>Activity.goToActivity(noinline init: Intent.() -> Unit = {}) {
    val intent = Intent(this, T::class.java)
    intent.init()
    startActivity(intent)
}

fun Activity.goToActivityResult(action: String, requestCode: Int, init: Intent.() -> Unit = {}) {
    val intent = Intent(action)
    intent.init()
    startActivityForResult(intent, requestCode)
}