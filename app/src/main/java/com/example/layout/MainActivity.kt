package com.example.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {  //onCreate는 앱 최초실행됬을때 수행.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // xml 화면 뷰를 연결한다.

        //여기서 쓰려고 아까 xml창에서 id 지정해준것.
        btn_getText.setOnClickListener { // 에딧 텍스트에 입력되어있는 값을 가지고와서 텍스트뷰에 뿌려준다. 눌렀을때 밑에꺼 동작
           var resultText = et_id.text.toString() // et_id 텍스트에있는 값들을 string(문자로) 변환해주세요, 후에 받을 변수 선언해 주기
            tv_result.setText(resultText) //tv_result라는 텍스트안에 resulText라는 것을 넣을거다



        }






    }
}