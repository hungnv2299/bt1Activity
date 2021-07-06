package com.hung.myapplication

import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast
import timber.log.Timber

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bt = findViewById<Button>(R.id.dialog).setOnClickListener(this)

        Timber.d("OnCreate")
    }

    override fun onClick(v: View?) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Androidly Alert")
        builder.setMessage("We have a message")

        builder.setPositiveButton(android.R.string.yes) { dialog, which ->
            Toast.makeText(
                applicationContext,
                android.R.string.yes, Toast.LENGTH_SHORT
            ).show()
        }

        builder.setNegativeButton(android.R.string.no) { dialog, which ->
            Toast.makeText(
                applicationContext,
                android.R.string.no, Toast.LENGTH_SHORT
            ).show()
        }

        builder.setNeutralButton("Maybe") { dialog, which ->
            Toast.makeText(
                applicationContext,
                "Maybe", Toast.LENGTH_SHORT
            ).show()
        }
        builder.show()
        onPause()
    }

    override fun onStart() {
        super.onStart()
        Timber.d("OnStart")
    }

    override fun onResume() {
        super.onResume()
        Timber.d("OnResume")
    }

    override fun onPause() {
        super.onPause()
        Timber.d("OnPause")
    }

    override fun onStop() {
        super.onStop()
        Timber.d("OnStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.d("OnDestroy")
    }


}