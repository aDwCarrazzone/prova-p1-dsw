package com.unicep.dswdm.prova01.questao02.association
import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

// Association é onde um objeto pode guardar outro objeto em um local.

class Association {
    class Person {
        private lateinit var name: String
        @RequiresApi(Build.VERSION_CODES.O)
        private var birthDate   = LocalDate.of(1997, 8,15) // Minha data, aceito presentes. xD
        private var books: java.util.ArrayList<Book> = arrayListOf()

        fun getName(): String {
            return this.name
        }

        fun setName(name: String) {
            this.name = name
        }

        @RequiresApi(Build.VERSION_CODES.O)
        fun isBirthday(): Boolean {
            val today = LocalDate.now()
            return this.birthDate == today
        }

        fun addBook(book: Book){
            this.books.add(book)
        }

        fun getBooks(): java.util.ArrayList<Book> {
            return this.books
        }

        fun printPerson() {
            println(
                "Nome: {$name}"
            )
        }

        fun printBooks() {
            println(
                "Livros: {$books}"
            )
        }
    }

    class Book {
        private lateinit var title: String
        private var authors: java.util.ArrayList<String> = arrayListOf()

        fun getTitle(): String {
            return this.title
        }

        public fun setTitle(title: String) {
            this.title = title
        }

        fun getAuthors(): java.util.ArrayList<String> {
            return this.authors
        }

        fun addAuthor(author: String) {
            this.authors.add(author)
        }
    }

    fun main(args: Array<String>) {
        // Livros:
        val book1: Association.Book = Association.Book()
        book1.setTitle("In Search Of Lost Time")
        book1.addAuthor("Marcel Proust")

        val book2: Association.Book = Association.Book()
        book2.setTitle("Ulysses")
        book2.addAuthor("James Joyce")

        val book3: Association.Book = Association.Book()
        book3.setTitle("Don Quixote")
        book3.addAuthor("Miguel de Cervantes")

        val book4: Association.Book = Association.Book()
        book4.setTitle("One Hundred Years of Soliture")
        book4.addAuthor("Gabriel Garcia Marquez")

        val book5: Association.Book = Association.Book()
        book5.setTitle("The Great Gatsby")
        book5.addAuthor("F. Scott Fitzgerald")

        val book6: Association.Book = Association.Book()
        book6.setTitle("Moby Dick")
        book6.addAuthor("Herman Melville")

        val book7: Association.Book = Association.Book()
        book7.setTitle("War and Peace")
        book7.addAuthor("Leo Tolstoy")

        val book8: Association.Book = Association.Book()
        book8.setTitle("Hamlet")
        book8.addAuthor("William Shakespeare")

        val book9: Association.Book = Association.Book()
        book9.setTitle("The Odyssey")
        book9.addAuthor("Homer")

        val book10: Association.Book = Association.Book()
        book10.setTitle("Madame Bovary")
        book10.addAuthor("Gustave Flaubert")

        // Leitores:
        val reader1: Association.Person = Association.Person()
        reader1.setName("Naira Melia Rapp")
        reader1.addBook(book1)
        reader1.printPerson()
        reader1.printBooks()

        val reader2: Association.Person = Association.Person()
        reader2.setName("Paisley Duncan Plaskett")
        reader2.addBook(book2)
        reader2.addBook(book3)
        reader2.printPerson()
        reader2.printBooks()

        val reader3: Association.Person = Association.Person()
        reader3.setName("Karlijn Tom Bowman")
        reader3.addBook(book4)
        reader3.addBook(book5)
        reader3.addBook(book6)
        reader3.printPerson()
        reader3.printBooks()

        val reader4: Association.Person = Association.Person()
        reader4.setName("Caitrìona Prudenzio Vandale")
        reader4.addBook(book7)
        reader4.addBook(book8)
        reader4.addBook(book9)
        reader4.addBook(book10)
        reader4.printPerson()
        reader4.printBooks()
    }
}