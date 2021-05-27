package com.example.q1

import android.os.Bundle
import androidx.activity.viewModels
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class ListView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
        val viewModel: ListController by viewModels()

        viewModel.generateListValues()
    }
}