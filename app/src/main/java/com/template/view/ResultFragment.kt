package com.template.view

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.template.R
import com.template.databinding.FragmentResultBinding
import ru.skillbranch.testnaeblana.MAIN
import ru.skillbranch.testnaeblana.falseAnswerSize
import ru.skillbranch.testnaeblana.trueAnswerSize


class ResultFragment : Fragment() {

    lateinit var binding: FragmentResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentResultBinding.inflate(layoutInflater)
        if(trueAnswerSize<=5){
            binding.IVsmail.setImageResource(R.drawable.crying)
        }
        binding.TVcountTrue.text = "$trueAnswerSize"
        binding.TVcountCansil.text = " $falseAnswerSize"
        binding.BmainMenu.setOnClickListener {
            trueAnswerSize = 0
            falseAnswerSize = 0
            MAIN.navController.navigate(R.id.action_resultFragment_to_startFragment)
        }
        binding.TVplayMarket.setOnClickListener {

            try {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + MAIN)));
            } catch (E: Exception) {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://play.google.com/store/apps/details?id=" + MAIN)
                    )
                )
            }
        }
        binding.Breplays.setOnClickListener{
            trueAnswerSize = 0
            falseAnswerSize = 0
            MAIN.navController.navigate(R.id.action_resultFragment_to_qestionFragment)
        }
    }

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            return binding.root

        }
    }
