package com.example.demo_kotlin_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_a.view.*


class FragmentA : Fragment() {

    lateinit var communicator: Communicator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_a, container, false)
        communicator = activity as Communicator
        view.btn_fragment1.setOnClickListener {
            communicator.passDataCom(view.ed_fragment1.text.toString())
        }
        return view
    }

}