package com.kinlabs.kineticandroidstarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.kin.kinetic.Keypair

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val keypair = Keypair.random()
        Log.d("TEST", keypair.publicKey)
    }
}