package librarySystem;

import librarySystem.entities.Author;
import librarySystem.entities.BookPublisher;
import librarySystem.entities.Categories;


public class Book {
        private int bookId;
        private String bookName;
        private Author author;
        private Categories bookCategory;
        private BookPublisher bookPublisher;

        public Book(String bookName, Author author, Categories bookCategory, BookPublisher bookPublisher) {
                this.bookName = bookName;
                this.author = author;
                this.bookCategory = bookCategory;
                this.bookPublisher = bookPublisher;
        }

        public Book(int bookId, String bookName, Author author, Categories bookCategory, BookPublisher bookPublisher) {
                this.bookId = bookId;
                this.bookName = bookName;
                this.author = author;
                this.bookCategory = bookCategory;
                this.bookPublisher = bookPublisher;
        }




}
