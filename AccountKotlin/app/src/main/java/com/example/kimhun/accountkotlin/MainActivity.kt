package com.example.kimhun.accountkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val account = arrayOf("123-456-7890", "111-111-1111","123-234-1234")
        val listView : ListView = findViewById(R.id.account_list) as ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, account)
        listView.setAdapter(adapter)

    }
}
