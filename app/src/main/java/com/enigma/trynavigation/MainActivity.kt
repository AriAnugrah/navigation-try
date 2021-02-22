package com.enigma.trynavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val buttonItemMenu = findViewById<MaterialButton>(R.id.btnAdd)
//        buttonItemMenu.setOnClickListener{
//            findNavController(R.id.nav_host_fragment).navigate(R.id.ac)
//        }
    }
}