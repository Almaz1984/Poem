package com.almaz.poem_cpc5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val MY_TAG="MyTag"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(MY_TAG, "Ты видел деву на скале")
    }

}