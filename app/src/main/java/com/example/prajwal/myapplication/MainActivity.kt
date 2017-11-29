package com.example.prajwal.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var valueString: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textMine.text = "Maile change gareko ho yo"

//        btnMine.setOnClickListener{
//            startActivity(Intent(this, MyActivity::class.java))
//        }

        val dataList = ArrayList<Data>()

        val data = Data("asdf", "asdf")
        dataList.add(data)
        val data2 = Data("asdfdd", "123")
        dataList.add(data2)

        val apiModel = ApiModel(dataList, "asdf", " asdf")

        Log.i("StatusXais", apiModel.status)

        apiModel.status = "asdf"
    }

    private fun sum(a: Int, b: Int): Int {
        return a + b
    }

    private fun sumOne(a: Int, b: Int) = a + b
}
