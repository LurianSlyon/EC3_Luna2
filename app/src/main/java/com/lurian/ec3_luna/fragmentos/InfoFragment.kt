package com.lurian.ec3_luna.fragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lurian.ec3_luna.R
import com.lurian.ec3_luna.databinding.FragmentInfoBinding

class InfoFragment : Fragment() {

    private lateinit var binding: FragmentInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentInfoBinding.inflate(inflater,container,false)
        return binding.root
    }
}