package com.example.t5_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.t5_fragment.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_blank, container, false)

        /**
         * instead of returning the fragment itself, we will return the Data Binding of this fragment
         * FragmentBlankBinding is auto generate
         */
        val binding = DataBindingUtil.inflate<FragmentBlankBinding>(
            inflater,
            R.layout.fragment_blank,
            container,
            false
        )
        return binding.root
    }

}