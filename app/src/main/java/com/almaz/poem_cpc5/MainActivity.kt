package com.almaz.poem_cpc5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.collections.List as List
import kotlin.collections.mutableListOf as mutableListOf

private const val MY_TAG="MyTag"
class MainActivity : AppCompatActivity() {
    private val poem: MutableList<String> = mutableListOf()
    private var i=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        poem.add("Ты видел деву на скале")
        poem.add("В одежде белой над волнами")
        poem.add("Когда, бушуя в бурной мгле,")
        poem.add("Играло море с берегами,")
        poem.add("Когда луч молний озарял")
        poem.add("Ее всечасно блеском алым")
        poem.add("И ветер бился и летал")
        poem.add("С ее летучим покрывалом?")
        poem.add("Прекрасно море в бурной мгле")
        poem.add("И небо в блесках без лазури;")
        poem.add("Но верь мне: дева на скале")
        poem.add("Прекрасней волн, небес и бури.")
        sendLog()
    }

    override fun onStart() {
        super.onStart()
        sendLog()
    }

    override fun onResume() {
        super.onResume()
        sendLog()
    }

    override fun onPause() {
        super.onPause()
        sendLog()
    }

    override fun onStop() {
        super.onStop()
        sendLog()
    }

    override fun onRestart() {
        super.onRestart()
        sendLog()
    }

    fun sendLog(){
        Log.d(MY_TAG, poem[i])
        Log.d(MY_TAG, poem[i+1])
        i += 2
    }

}