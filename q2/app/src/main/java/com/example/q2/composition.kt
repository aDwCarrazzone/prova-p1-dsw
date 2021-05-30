package com.unicep.dswdm.prova01.questao02.composition
import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

// Compostition é uma adição ao aggregation, onde um objeto é dependente de um outro e quando o dono morre ele não pode mais ser acessado.

class Composition {
    class Person {
        private lateinit var name: String
        @RequiresApi(Build.VERSION_CODES.O)
        private var birthDate   = LocalDate.of(1997, 8, 15) // Minha data, aceito presentes. xD
        private var books: ArrayList<Book> = arrayListOf()

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
                "Nome: ${name}"
            )
        }

        fun printBooks() {
            println(
                "Livros: ${books}"
            )
        }
    }

    class Book {
        private lateinit var title: String
        private var authors: java.util.ArrayList<String> = arrayListOf()
        private lateinit var proprietor: Person

        fun getTitle(): String {
            return this.title
        }

        fun setTitle(title: String) {
            this.title = title
        }

        fun getAuthors(): java.util.ArrayList<String> {
            return this.authors
        }

        fun addAuthor(author: String) {
                this.authors.add(author)
        }

        fun getProprietor(): Person {
            return this.proprietor
        }

        fun setProprietor(proprietor: Person) {
            this.proprietor = proprietor
        }
    }

    fun main(args: Array<String>) {
        // Leitores:
        val reader1: Composition.Person = Composition.Person()
        reader1.setName("Naira Melia Rapp")

        val reader2: Composition.Person = Composition.Person()
        reader2.setName("Paisley Duncan Plaskett")

        val reader3: Composition.Person = Composition.Person()
        reader3.setName("Karlijn Tom Bowman")

        val reader4: Composition.Person = Composition.Person()
        reader4.setName("Caitrìona Prudenzio Vandale")

        // Livros:
        val book1: Composition.Book = Composition.Book()
        book1.setProprietor(reader1)
        book1.setTitle("In Search Of Lost Time")
        book1.addAuthor("Marcel Proust")
        reader1.addBook(book1)

        val book2: Composition.Book = Composition.Book()
        book2.setProprietor(reader2)
        book2.setTitle("Ulysses")
        book2.addAuthor("James Joyce")
        reader2.addBook(book2)

        val book3: Composition.Book = Composition.Book()
        book3.setProprietor(reader2)
        book3.setTitle("Don Quixote")
        book3.addAuthor("Miguel de Cervantes")
        reader2.addBook(book3)

        val book4: Composition.Book = Composition.Book()
        book4.setProprietor(reader3)
        book4.setTitle("One Hundred Years of Soliture")
        book4.addAuthor("Gabriel Garcia Marquez")
        reader3.addBook(book4)

        val book5: Composition.Book = Composition.Book()
        book5.setProprietor(reader3)
        book5.setTitle("The Great Gatsby")
        book5.addAuthor("F. Scott Fitzgerald")
        reader3.addBook(book5)

        val book6: Composition.Book = Composition.Book()
        book6.setProprietor(reader3)
        book6.setTitle("Moby Dick")
        book6.addAuthor("Herman Melville")
        reader3.addBook(book6)

        val book7: Composition.Book = Composition.Book()
        book7.setProprietor(reader4)
        book7.setTitle("War and Peace")
        book7.addAuthor("Leo Tolstoy")
        reader4.addBook(book7)

        val book8: Composition.Book = Composition.Book()
        book8.setProprietor(reader4)
        book8.setTitle("Hamlet")
        book8.addAuthor("William Shakespeare")
        reader4.addBook(book8)

        val book9: Composition.Book = Composition.Book()
        book9.setProprietor(reader4)
        book9.setTitle("The Odyssey")
        book9.addAuthor("Homer")
        reader4.addBook(book9)

        val book10: Composition.Book = Composition.Book()
        book10.setProprietor(reader4)
        book10.setTitle("Madame Bovary")
        book10.addAuthor("Gustave Flaubert")
        reader4.addBook(book10)
    }
}