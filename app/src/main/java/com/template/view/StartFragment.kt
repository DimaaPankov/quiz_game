package com.template.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.template.R
import com.template.databinding.FragmentStartBinding
import ru.skillbranch.testnaeblana.MAIN



class StartFragment : Fragment(){
lateinit var binding: FragmentStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentStartBinding.inflate(layoutInflater)
        binding.Bplay.setOnClickListener {

            MAIN.navController.navigate(R.id.action_startFragment_to_qestionFragment)

        }

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
        }

}