package com.unicep.dswdm.prova01.questao02.dependency

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

// Dependancy é onde um objeto de uma classe pode usar um objeto de outra classe no código de um método.

class Dependancy {
    class Person {
        private var name: String
        private var birthDate   = LocalDate.of(1997, 08, 15) // Minha data, aceito presentes. xD

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

        public fun read(book: Book){
            val read: java.util.ArrayList<String> = arrayOf()

            read.add("In Search of Lost Time")
            read.add("Ulysses")
            read.add("One Hundred Years of Solitude")
            read.add("Moby Dick")
            read.add("Hamlet")

            return read.contains(book.getTitle())
        }

    }

    class Book {
        private var title: String
        private var authors: java.util.ArrayList<String> = arrayOf()

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

    }

    fun main(args: Array<String>) {

        // Livros:
        val book1: Dependancy.Book = Dependancy.Book()
        book1.setTitle("In Search Of Lost Time")
        book1.addAuthor("Marcel Proust")

        val book2: Dependancy.Book = Dependancy.Book()
        book2.setTitle("Ulysses")
        book2.addAuthor("James Joyce")

        val book3: Dependancy.Book = Dependancy.Book()
        book3.setTitle("Don Quixote")
        book3.addAuthor("Miguel de Cervantes")

        val book4: Dependancy.Book = Dependancy.Book()
        book4.setTitle("One Hundred Years of Soliture")
        book4.addAuthor("Gabriel Garcia Marquez")

        val book5: Dependancy.Book = Dependancy.Book()
        book5.setTitle("The Great Gatsby")
        book5.addAuthor("F. Scott Fitzgerald")

        val book6: Dependancy.Book = Dependancy.Book()
        book6.setTitle("Moby Dick")
        book6.addAuthor("Herman Melville")

        val book7: Dependancy.Book = Dependancy.Book()
        book7.setTitle("War and Peace")
        book7.addAuthor("Leo Tolstoy")

        val book8: Dependancy.Book = Dependancy.Book()
        book8.setTitle("Hamlet")
        book8.addAuthor("William Shakespeare")

        val book9: Dependancy.Book = Dependancy.Book()
        book9.setTitle("The Odyssey")
        book9.addAuthor("Homer")

        val book10: Dependancy.Book = Dependancy.Book()
        book10.setTitle("Madame Bovary")
        book10.addAuthor("Gustave Flaubert")

        // Leitor:
        val reader: Dependancy.Person = Dependancy.Person()
        reader.setName("Naira Melia Rapp")

        //O leitor leu?
        println("O leitor ${reader.getName()} leu ou não o livro ${book1.getTitle()}? ${reader.read(book1)}")
        println("O leitor ${reader.getName()} leu ou não o livro ${book2.getTitle()}? ${reader.read(book2)}")
        println("O leitor ${reader.getName()} leu ou não o livro ${book3.getTitle()}? ${reader.read(book3)}")
        println("O leitor ${reader.getName()} leu ou não o livro ${book4.getTitle()}? ${reader.read(book4)}")
        println("O leitor ${reader.getName()} leu ou não o livro ${book5.getTitle()}? ${reader.read(book5)}")
        println("O leitor ${reader.getName()} leu ou não o livro ${book6.getTitle()}? ${reader.read(book6)}")
        println("O leitor ${reader.getName()} leu ou não o livro ${book7.getTitle()}? ${reader.read(book7)}")
        println("O leitor ${reader.getName()} leu ou não o livro ${book8.getTitle()}? ${reader.read(book8)}")
        println("O leitor ${reader.getName()} leu ou não o livro ${book9.getTitle()}? ${reader.read(book9)}")
        println("O leitor ${reader.getName()} leu ou não o livro ${book10.getTitle()}? ${reader.read(book10)}")
        printLn book1.getTitle()
    }
}