package com.example.memo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private var listView: ListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ListViewを実装
        val test = arrayOf(
            "Max","Min"
        )

        this.listView = findViewById(R.id.listView)

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, test)
        listView!!.adapter = adapter
    }
}