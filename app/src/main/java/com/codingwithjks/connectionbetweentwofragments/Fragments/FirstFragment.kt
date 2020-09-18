package com.codingwithjks.connectionbetweentwofragments.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import com.codingwithjks.connectionbetweentwofragments.ViewModel.DataViewModel
import com.codingwithjks.connectionbetweentwofragments.R


class FirstFragment : Fragment() {
    private lateinit var dataViewModel: DataViewModel
    private var count=0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_first, container, false)
        dataViewModel=ViewModelProvider(requireActivity())[DataViewModel::class.java]
        val click:Button=view.findViewById(R.id.click)
        click.setOnClickListener {
            count++
            dataViewModel.setData(count)
        }
        return view
    }

}