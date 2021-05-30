package com.unicep.dswdm.prova01.questao02.composition
import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

// Compostition é uma adição ao aggregation, onde um objeto é dependente de um outro e quando o dono morre ele não pode mais ser acessado.

class Composition {
    class Person {
        private var name: String
        private var birthDate   = LocalDate.of(1997, 08, 15) // Minha data, aceito presentes. xD
        private var books: java.util.ArrayList<Book> = arrayOf()

        public fun getName(): String {
            return this.name
        }

        public fun setName(name: String) {
            this.name = name
        }

        public fun isBirthday(): Boolean {
            val today = LocalDate.now()
            return this.birthDate = today
        }

        public fun addBook(book: Book){
            this.books.add(book)
        }

        public fun getBooks(): java.util.ArrayList<Book> {
            return this.books
        }

        public fun printPerson() {
            println(
                "Nome: "+ getName()
            )
        }

        public fun printBooks() {
            println(
                "Livros: "+ getBooks()
            )
        }
    }

    class Book {
        private var title: String
        private var authors: java.util.ArrayList<String> = arrayOf()
        private var proprietor: Person

        public fun getTitle(): String {
            return this.title
        }

        public fun setTitle(title: String) {
            this.title = title
        }

        public fun getAuthors(): java.util.ArrayList<String> {
            return this.authors
        }

        public fun addAuthor(author: String) {
                this.authors.add(author)
        }

        public fun getProprietor(): Person {
            return this.proprietor
        }

        public fun setProprietor(proprietor: Person) {
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
        reader1.addBook(1)

        val book2: Composition.Book = Composition.Book()
        book2.setProprietor(reader2)
        book2.setTitle("Ulysses")
        book2.addAuthor("James Joyce")
        reader2.addBook(2)

        val book3: Composition.Book = Composition.Book()
        book3.setProprietor(reader2)
        book3.setTitle("Don Quixote")
        book3.addAuthor("Miguel de Cervantes")
        reader2.addBook(3)

        val book4: Composition.Book = Composition.Book()
        book4.setProprietor(reader3)
        book4.setTitle("One Hundred Years of Soliture")
        book4.addAuthor("Gabriel Garcia Marquez")
        reader3.addBook(4)

        val book5: Composition.Book = Composition.Book()
        book5.setProprietor(reader3)
        book5.setTitle("The Great Gatsby")
        book5.addAuthor("F. Scott Fitzgerald")
        reader3.addBook(5)

        val book6: Composition.Book = Composition.Book()
        book6.setProprietor(reader3)
        book6.setTitle("Moby Dick")
        book6.addAuthor("Herman Melville")
        reader3.addBook(6)

        val book7: Composition.Book = Composition.Book()
        book7.setProprietor(reader4)
        book7.setTitle("War and Peace")
        book7.addAuthor("Leo Tolstoy")
        reader4.addBook(7)

        val book8: Composition.Book = Composition.Book()
        book8.setProprietor(reader4)
        book8.setTitle("Hamlet")
        book8.addAuthor("William Shakespeare")
        reader4.addBook(8)

        val book9: Composition.Book = Composition.Book()
        book9.setProprietor(reader4)
        book9.setTitle("The Odyssey")
        book9.addAuthor("Homer")
        reader4.addBook(9)

        val book10: Composition.Book = Composition.Book()
        book10.setProprietor(reader4)
        book10.setTitle("Madame Bovary")
        book10.addAuthor("Gustave Flaubert")
        reader4.addBook(10)
    }
}