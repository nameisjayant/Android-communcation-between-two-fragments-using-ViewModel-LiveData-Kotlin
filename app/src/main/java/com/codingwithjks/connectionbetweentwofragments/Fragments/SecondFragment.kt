package com.codingwithjks.connectionbetweentwofragments.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.codingwithjks.connectionbetweentwofragments.ViewModel.DataViewModel
import com.codingwithjks.connectionbetweentwofragments.R


class SecondFragment : Fragment() {
    private lateinit var dataViewModel:DataViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_second, container, false)
        dataViewModel=ViewModelProvider(requireActivity())[DataViewModel::class.java]
        val data:TextView=view.findViewById(R.id.data)
        dataViewModel.data.observe(this, Observer {
            data.text=it.toString()
        })
        return view
    }

}