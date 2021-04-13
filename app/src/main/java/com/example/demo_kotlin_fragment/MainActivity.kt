package com.example.demo_kotlin_fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), Communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fragmentA = FragmentA()
        supportFragmentManager.beginTransaction().replace(R.id.fragment, fragmentA).commit()

    }

    override fun passDataCom(editTextInput: String) {
        val bundle = Bundle()
        bundle.putString("key", editTextInput)
        val fragmentB = FragmentB()
        fragmentB.arguments = bundle
        supportFragmentManager.beginTransaction().replace(R.id.fragment, fragmentB).commit()

    }


}