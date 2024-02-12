package com.example.myapplication.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.myapplication.Adapters.CategoryAdapter
import com.example.myapplication.R
import com.example.myapplication.Services.DataService

class MainActivity : AppCompatActivity() {
    lateinit var adapter : CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val categoryListView = findViewById<ListView>(R.id.categoryListView)

        adapter= CategoryAdapter(this,DataService.categories)

        categoryListView.adapter=adapter
    }
}