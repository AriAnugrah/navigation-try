package com.enigma.trynavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonItemMenu = findViewById<MaterialButton>(R.id.btnList)
        buttonItemMenu.setOnClickListener{
            findNavController(R.id.nav_host_fragment).navigate(R.id.action_global_listItemFragment)
        }

        val buttonViewListMenu = findViewById<MaterialButton>(R.id.btn_to_other)
        buttonViewListMenu.setOnClickListener{
            findNavController(R.id.nav_host_fragment).navigate(R.id.action_global_otherFragment)
        }

        val buttonToListHistory = findViewById<MaterialButton>(R.id.btn_to_history)
        buttonToListHistory.setOnClickListener{
            findNavController(R.id.nav_host_fragment).navigate(R.id.action_global_historyFragment)
        }


    }
}