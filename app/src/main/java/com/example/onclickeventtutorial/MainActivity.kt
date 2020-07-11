package com.example.onclickeventtutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.accessibility.AccessibilityNodeInfo
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second_activitiy.*

class MainActivity : AppCompatActivity() {

    companion object{
        const val TAG: String = "로그"
    }

    var number : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add_number_btn.setOnClickListener {
            number = number + 1
            Log.d(TAG,"MainActivity - add_number_btn 클릭 / number : ${number} ")
            number_text.text = number.toString()
        }

        //로그인 버튼 뷰에 클릭 리스너를 설정 하였다.
        next_btn.setOnClickListener(View.OnClickListener {
            onLoginButtonClikcked()


        })
    }


    fun onLoginButtonClikcked(){
        Log.d(TAG,"MainActivity - 다음으로 가는 버튼이 클릭 되었다.")

        val intent = Intent(this, SecondActivitiy::class.java)
        intent.putExtra("msg", number_text.text.toString())
        startActivity(intent)
    }
}