package com.example.q3.controller

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.q3.model.BookModel
import com.example.q3.model.EmailModel
import java.time.LocalDate

@RequiresApi(Build.VERSION_CODES.O)
fun DocumentBook(document: String){

    //Books
    val book1: BookModel = BookModel()
    book1.addAuthor("Leo Tolstoy")
    book1.setTitle("War and Peace")
    book1.setDate(LocalDate.of(1867,1,1))

    val book2: BookModel = BookModel()
    book1.addAuthor("William Shakespeare")
    book1.setTitle("Hamlet")
    book1.setDate(LocalDate.of(1603,1,1))

    val book3: BookModel = BookModel()
    book1.addAuthor("Homer")
    book1.setTitle("The Odyssey")
    book1.setDate(LocalDate.of(1614,1,1))

    val book4: BookModel = BookModel()
    book1.addAuthor("Gustave Flaubert")
    book1.setTitle("Madame Bovary")
    book1.setDate(LocalDate.of(1856,12,15))

    val books: ArrayList<BookModel> = arrayListOf()
    books.add(book1)
    books.add(book2)
    books.add(book3)
    books.add(book4)

    println("Livros:")
    for (book in books) {
        println("Livro: ${book.getTitle()}")
        println("Autor: ${book.getAuthors()}")
        println("Lançamento: ${book.getDate()}")
    }
}

@RequiresApi(Build.VERSION_CODES.O)
fun DocumentEmail(document: String) {
    // E-mails
    val email1: EmailModel = EmailModel()
    email1.addAuthor("biblio@gmail.com")
    email1.addTo("Courtney@gmail.com")
    email1.addTo("Ebrain@hotmail.com")
    email1.addTo("enrico@ig.com")
    email1.addTo("prefeit@rc.sp.gov.com")
    email1.setDate(LocalDate.of(2021,5,30))
    email1.setSubject("Novos livros chegaram.")

    val email2: EmailModel = EmailModel()
    email2.addAuthor("biblio@gmail.com")
    email2.addTo("Courtney@gmail.com")
    email2.addTo("Ebrain@hotmail.com")
    email2.addTo("enrico@ig.com")
    email2.addTo("prefeit@rc.sp.gov.com")
    email2.setDate(LocalDate.of(2021,5,31))
    email2.setSubject("As trocas de livros antigos pelos novos já estão em vigor.")

    val emails: ArrayList<EmailModel> = arrayListOf()
    emails.add(email1)
    emails.add(email2)

    println("E-mails")
    for (email in emails) {
        println("Assunto: ${email.getSubject()}")
        println("Data: ${email.getDate()}")
        println("De: ${email.getAuthors()}")
        println("Para: ${email.getTo()}")
    }
}