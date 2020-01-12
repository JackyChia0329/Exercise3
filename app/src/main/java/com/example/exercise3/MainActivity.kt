package com.example.exercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonCalculate.setOnClickListener {
            var duit = 0
            val a = radioGroupGender.checkedRadioButtonId
            var man:Boolean? = null
            var smoker:Boolean? = null
            val select = spinnerAge.selectedItem.toString()

            if(a%2==0){ man=true
            }else{ man=false }

            if(checkBoxSmoker.isChecked){ smoker=true
            }else{ smoker=false }

                        when (select) {
                            "Less than 17" -> {
                                duit += 60
                            }
                            "17 to 25" ->{
                                if(man==true&&smoker==true){
                                    duit += 220
                                }else if(man==true&&smoker==false){
                                    duit+=120
                                }else if(man==false&&smoker==true){
                                    duit+=170
                                }else{
                                    duit+=70
                                }
                            }
                            "26 to 30"->{
                                if(man==true&&smoker==true){
                                    duit += 340
                                }else if(man==true&&smoker==false){
                                    duit +=190
                                }else if(man==false&&smoker==true){
                                    duit +=240
                                }else{
                                    duit+=90
                                }
                            }
                            "31 to 40"-> {
                                if(man==true&&smoker==true){
                                    duit += 470
                                }else if(man==true&&smoker==false){
                                    duit +=270
                                }else if(man==false&&smoker==true){
                                    duit+320
                                }else{
                                    duit+=120
                                }
                            }
                            "41 to 55"-> {
                                if(man==true&&smoker==true){
                                    duit += 600
                                }else if(man==true&&smoker==false){
                                    duit+=350
                                }else if(man==false&&smoker==true){
                                    duit+=400
                                }else{
                                    duit+=150
                                }
                            }
                            else->   {
                                if(man==true&&smoker==true){
                                    duit += 650
                                }else if(man==true&&smoker==false){
                                    duit+=350
                                }else if(man==false&&smoker==true){
                                    duit+=450
                                }else{
                                    duit+=150
                                }
                            }
                    }

            textViewPremium.setText("total = RM"+duit)


        }
        buttonReset.setOnClickListener{
//            duit=0
            spinnerAge.setSelection(0)
            radioButtonMale.isChecked = true
            radioButtonFemale.isChecked = false
            checkBoxSmoker.isChecked=false
            textViewPremium.setText("")


        }}}




