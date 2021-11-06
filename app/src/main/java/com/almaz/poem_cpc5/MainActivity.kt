package com.almaz.poem_cpc5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.content.PackageManagerCompat
import kotlin.collections.List as List
import kotlin.collections.mutableListOf as mutableListOf
import androidx.core.content.PackageManagerCompat.LOG_TAG
import androidx.core.content.PackageManagerCompat.LOG_TAG

private const val MY_TAG="MyTag"
class MainActivity : AppCompatActivity() {
    private val poem: MutableList<String> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(MY_TAG, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(MY_TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MY_TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(MY_TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(MY_TAG, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(MY_TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MY_TAG, "onDestroy")
    }


 //   override fun onSaveInstanceState(outState: Bundle) {
  //      super.onSaveInstanceState(outState)
  //      Log.d(MY_TAG, "onSaveInstanceState")
  //  }

   // override fun onRestoreInstanceState(savedInstanceState: Bundle) {
  //      super.onRestoreInstanceState(savedInstanceState)
  //     Log.d(MY_TAG, "onRestoreInstanceState")
  //  }

  //  private fun sendLog(i:Int): Unit{
  //      Log.d(MY_TAG, poem[i*2])
  //      Log.d(MY_TAG, poem[i*2+1])
  //  }

}