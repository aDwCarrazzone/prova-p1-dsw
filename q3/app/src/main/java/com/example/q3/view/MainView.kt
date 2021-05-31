package com.example.q3.view


import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.q3.controller.DocumentBook
import com.example.q3.controller.DocumentEmail
import org.w3c.dom.Document
import java.util.*

@RequiresApi(Build.VERSION_CODES.O)
fun main(args: Array<String>) {
    val input: Scanner = Scanner(System.`in`)
    var opt: String = "."


    while (opt != "sair") {
        println("Entre com (Livro)")
        println("ou")
        println("Entre com (Email)")

        val document = input.nextLine().trim().lowercase()
        if  (document == "Livro")
            DocumentBook(document)
        else if (document == "Email")
            DocumentEmail(document)
        else
            println("Opção invalida")

        println("Entre com (sair)")
        opt = input.nextLine().trim().lowercase()
    }
}