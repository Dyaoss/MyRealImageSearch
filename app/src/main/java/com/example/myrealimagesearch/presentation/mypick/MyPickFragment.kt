package com.example.myrealimagesearch.presentation.mypick

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myrealimagesearch.R
import com.example.myrealimagesearch.databinding.FragmentMyPickBinding

class MyPickFragment : Fragment() {
    private lateinit var _binding: FragmentMyPickBinding
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_pick, container, false)
    }

}