package com.example.q3.model

class BookModel : DocumentModel() {
    private var title; String = ""

    fun getTitle():String {
        return this.title
    }
    fun setTitle(title: String){
        this.title = title
    }
}