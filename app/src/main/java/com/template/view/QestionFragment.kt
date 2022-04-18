package com.template.view.qestionFrafment

import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import com.template.R
import com.template.databinding.FragmentQestionBinding
import ru.skillbranch.testnaeblana.*

import com.template.viewModel.qestionViewModel.questionModel

class qestionFragment : Fragment() {
    lateinit var binding: FragmentQestionBinding
    lateinit var quizViewModel: questionModel
    var actionFragment = false
    val trueAnswer = mutableListOf<String>()





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
           setView()
        setClickListner()
    }

    private fun setClickListner(){

        binding.Banswer1.setOnClickListener {
            clickAnswerBuatton1()
        }

        binding.Banswer2.setOnClickListener {
            clickAnswerBuatton2()
        }
        binding.Banswer3.setOnClickListener {
            clickAnswerBuatton3()
        }
    }

    private fun setView(){
        quizViewModel = ViewModelProvider(this).get(questionModel::class.java)
        binding = FragmentQestionBinding.inflate(layoutInflater)
        binding.TVqestions.setText(quizViewModel.Data().textResId)
        binding.Banswer1.setText(quizViewModel.DataTextbutton(0).answerTextResId)
        binding.Banswer2.setText(quizViewModel.DataTextbutton(1).answerTextResId)
        binding.Banswer3.setText(quizViewModel.DataTextbutton(2).answerTextResId)

        for(i in quizViewModel.data){
            if(i.answer){
                trueAnswer.add(getString(i.answerTextResId))
            }
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root


    }

    private fun clickAnswerBuatton1() {
        quizViewModel.moveData()
        binding.Banswer1.setText(quizViewModel.DataTextbutton(0).answerTextResId)
        binding.Banswer2.setText(quizViewModel.DataTextbutton(1).answerTextResId)
        binding.Banswer3.setText(quizViewModel.DataTextbutton(2).answerTextResId)
        binding.TVqestions.setText(quizViewModel.Data().textResId)

        if (quizViewModel.getBoolenAnswers(0)) {
            quizViewModel.indexAswers++
            trueAnswerSize++
            binding.imageViewIcon.isVisible = false
            binding.Banswer1.isVisible = false
            binding.Banswer2.isVisible = false
            binding.Banswer3.isVisible = false
            binding.view.isVisible = false
            binding.background.setBackgroundColor(resources.getColor(R.color.teal_200))
            binding.TVqestions.isVisible = false
            binding.textViewTRUE.isVisible = true

        } else {
            quizViewModel.indexAswers++
            falseAnswerSize++
            binding.imageViewIcon.isVisible = false
            binding.Banswer1.isVisible = false
            binding.Banswer2.isVisible = false
            binding.Banswer3.isVisible = false
            binding.view.isVisible = false
            binding.background.setBackgroundColor(resources.getColor(R.color.purple_200))
            binding.TVqestions.isVisible = false
            if(quizViewModel.index == 0){
                binding.TVtrueAnswer.text = trueAnswer.get(9)
            }else {
                binding.TVtrueAnswer.text = trueAnswer.get((quizViewModel.index - 3) / 3)
            }
            Log.d("llllll",((quizViewModel.index-3)/3).toString())
            binding.TVtrueAnswer.isVisible = true
            binding.textViewFALSE.isVisible = true


    }

        finish(1000L)

}
    private fun clickAnswerBuatton2() {
        quizViewModel.moveData()
        binding.Banswer1.setText(quizViewModel.DataTextbutton(0).answerTextResId)
        binding.Banswer2.setText(quizViewModel.DataTextbutton(1).answerTextResId)
        binding.Banswer3.setText(quizViewModel.DataTextbutton(2).answerTextResId)
        binding.TVqestions.setText(quizViewModel.Data().textResId)

        if (quizViewModel.getBoolenAnswers(1)) {
            quizViewModel.indexAswers++
            trueAnswerSize++
            binding.imageViewIcon.isVisible = false
            binding.Banswer1.isVisible = false
            binding.Banswer2.isVisible = false
            binding.Banswer3.isVisible = false
            binding.view.isVisible = false
            binding.background.setBackgroundColor(resources.getColor(R.color.teal_200))
            binding.TVqestions.isVisible = false
            binding.textViewTRUE.isVisible = true

        } else {
            quizViewModel.indexAswers++
            falseAnswerSize++
            binding.imageViewIcon.isVisible = false
            binding.Banswer1.isVisible = false
            binding.Banswer2.isVisible = false
            binding.Banswer3.isVisible = false
            binding.view.isVisible = false
            binding.background.setBackgroundColor(resources.getColor(R.color.purple_200))
            binding.TVqestions.isVisible = false
            binding.textViewFALSE.isVisible = true
            if(quizViewModel.index == 0){
                binding.TVtrueAnswer.text = trueAnswer.get(9)
            }else {
                binding.TVtrueAnswer.text = trueAnswer.get((quizViewModel.index - 3) / 3)
            }
            binding.TVtrueAnswer.isVisible = true

        }

        finish(1000L)

    }

    private fun clickAnswerBuatton3() {
        quizViewModel.moveData()
        binding.Banswer1.setText(quizViewModel.DataTextbutton(0).answerTextResId)
        binding.Banswer2.setText(quizViewModel.DataTextbutton(1).answerTextResId)
        binding.Banswer3.setText(quizViewModel.DataTextbutton(2).answerTextResId)
        binding.TVqestions.setText(quizViewModel.Data().textResId)

        if (quizViewModel.getBoolenAnswers(2)) {
            quizViewModel.indexAswers++
            trueAnswerSize++
            binding.imageViewIcon.isVisible = false
            binding.Banswer1.isVisible = false
            binding.Banswer2.isVisible = false
            binding.Banswer3.isVisible = false
            binding.view.isVisible = false
            binding.textViewTRUE.isVisible = true
            binding.TVqestions.isVisible = false
            binding.background.setBackgroundColor(resources.getColor(R.color.teal_200))

        } else {
            quizViewModel.indexAswers++
            falseAnswerSize++
            binding.imageViewIcon.isVisible = false
            binding.Banswer1.isVisible = false
            binding.Banswer2.isVisible = false
            binding.Banswer3.isVisible = false
            binding.view.isVisible = false
            binding.textViewFALSE.isVisible = true
            binding.background.setBackgroundColor(resources.getColor(R.color.purple_200))
            binding.TVqestions.isVisible = false
            if(quizViewModel.index == 0){
                binding.TVtrueAnswer.text = trueAnswer.get(9)
            }else {
                binding.TVtrueAnswer.text = trueAnswer.get((quizViewModel.index - 3) / 3)
            }
            binding.TVtrueAnswer.isVisible = true


        }

        finish(1000L)

    }



    private fun finish( sec:Long ){

        object : CountDownTimer(sec, 1000) {
            override fun onTick(millisUntilFinished: Long) {}

            override fun onFinish() {

                if(actionFragment) {
                    MAIN.navController.navigate(R.id.action_qestionFragment_to_resultFragment)
                }
                if(quizViewModel.index >=27) {
                    actionFragment = true
                }

                binding.Banswer1.isVisible = true
                binding.Banswer2.isVisible = true
                binding.Banswer3.isVisible = true
                binding.imageViewIcon.isVisible = true
                binding.view.isVisible = true
                binding.background.setBackgroundColor(resources.getColor(R.color.white))
                binding.TVqestions.isVisible =  true
                binding.background.setBackgroundColor(resources.getColor(R.color.LIGHT_PRIMARY_COLOR))

                binding.textViewTRUE.isVisible = false
                binding.textViewFALSE.isVisible = false
                binding.TVtrueAnswer.isVisible = false

            }
        }.start()
    }
    }
