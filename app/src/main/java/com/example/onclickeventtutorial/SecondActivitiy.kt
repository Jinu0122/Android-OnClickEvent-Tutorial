package com.example.onclickeventtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_second_activitiy.*

class SecondActivitiy : AppCompatActivity() {

    companion object{
        const val TAG: String = "로그"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_activitiy)

        if(intent.hasExtra("msg") )
        {
            text_view.text=intent.getStringExtra("msg")
        }

    }

    fun onBackButtonClicked(view: View){
        Log.d(TAG,"SecondActivitiy - onBackButtonClicked() called")
        finish()
    }

}