package com.example.q3.model

class EmailModel : DocumentModel() {
    private var subject: String = ""
    private var to: ArrayList<String> = arrayListOf()

    fun getSubject(): String {
        return this.subject
    }

    fun setSubject(subject: String) {
        this.subject = subject
    }

    fun getTo(): ArrayList<String> {
        return this.to
    }

    fun addTo(to: String){
        this.to.add(to)
    }

}