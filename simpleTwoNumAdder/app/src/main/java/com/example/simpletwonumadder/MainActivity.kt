package com.example.simpletwonumadder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

//import kotlinx.android.synthetic.main_activity.*

class MainActivity : AppCompatActivity() {
    var btnAdd : Button? = null
    var etVar1 : EditText? = null
    var etVar2 : EditText? = null
    var tvResult : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd = findViewById(R.id.btnAdd)
        etVar1 = findViewById(R.id.etVar1)
        etVar2 = findViewById(R.id.etVar2)
        tvResult = findViewById(R.id.tvResult)

        btnAdd?.setOnClickListener(View.OnClickListener {
            var result = etVar1?.text.toString().toInt() + etVar2?.text.toString().toInt();
            tvResult?.text = result.toString()
        });

    }
}