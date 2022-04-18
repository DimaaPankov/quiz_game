package com.template.viewModel.qestionViewModel


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.template.R
import com.template.entities.entities



class questionModel(): ViewModel() {
    var indexAswers  = 0



    var index = 0
    val data = listOf(
        entities(R.string.something_qestion1, R.string.something_answer1, false),
        entities(R.string.something_qestion1, R.string.something_answer2, true),
        entities(R.string.something_qestion1, R.string.something_answer3, false),

        entities(R.string.something_qestion2, R.string.something_answer4, false),
        entities(R.string.something_qestion2, R.string.something_answer5, false),
        entities(R.string.something_qestion2, R.string.something_answer6, true),

        entities(R.string.something_qestion3, R.string.something_answer7, false),
        entities(R.string.something_qestion3, R.string.something_answer8, true),
        entities(R.string.something_qestion3, R.string.something_answer9, false),

        entities(R.string.something_qestion4, R.string.something_answer10, true),
        entities(R.string.something_qestion4, R.string.something_answer11, false),
        entities(R.string.something_qestion4, R.string.something_answer12, false),

        entities(R.string.something_qestion5, R.string.something_answer13, false),
        entities(R.string.something_qestion5, R.string.something_answer14, false),
        entities(R.string.something_qestion5, R.string.something_answer15, true),


        entities(R.string.something_qestion6, R.string.something_answer16, true),
        entities(R.string.something_qestion6, R.string.something_answer17, false),
        entities(R.string.something_qestion6, R.string.something_answer18, false),


        entities(R.string.something_qestion7, R.string.something_answer19, false),
        entities(R.string.something_qestion7, R.string.something_answer20, false),
        entities(R.string.something_qestion7, R.string.something_answer21, true),


        entities(R.string.something_qestion8, R.string.something_answer22, false),
        entities(R.string.something_qestion8, R.string.something_answer23, true),
        entities(R.string.something_qestion8, R.string.something_answer24, false),

        entities(R.string.something_qestion9, R.string.something_answer25, false),
        entities(R.string.something_qestion9, R.string.something_answer26, true),
        entities(R.string.something_qestion9, R.string.something_answer27, false),

        entities(R.string.something_qestion10, R.string.something_answer28, false),
        entities(R.string.something_qestion10, R.string.something_answer29, false),
        entities(R.string.something_qestion10, R.string.something_answer30, true),


        )


    fun Data(): entities {
        return data[index]

    }

    fun DataTextbutton(i: Int): entities {
        if (index < 30) {
            return data[index + i]
        } else {
            index = 0
            return data[i]
        }
    }

    fun moveData() {
        if (index < data.size - 1) {
            index = index + 3

        }
    }
    val batton1 =
        listOf<Boolean>(false, false, false, true, false, true, false, false, false, false)
    val batton2 =
        listOf<Boolean>(true, false, true, false, false, false, false, true, true, false)
    val batton3 =
        listOf<Boolean>(false, true, false, false, true, false, true, false, false, true)

    fun getBoolenAnswers(i:Int):Boolean {
        when (i) {
            0 -> {
                return batton1[indexAswers]
            }
            1 -> {
                return batton2[indexAswers]
            }
            else -> {
                return batton3[indexAswers]

            }
        }
    }}



