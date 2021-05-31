package com.example.q3.model

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

abstract class DocumentModel {
    private var authors: ArrayList<String> = arrayListOf()
    @RequiresApi(Build.VERSION_CODES.O)
    private var date: LocalDate = LocalDate.now()

    fun getAuthors(): ArrayList<String> {
        return this.authors
    }

    fun addAuthor(author: String){
        this.authors.add(author)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun getDate(): LocalDate {
        return this.date
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun setDate(date: LocalDate) {
        this.date = date
    }
}