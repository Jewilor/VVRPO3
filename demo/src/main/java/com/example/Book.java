package com.example;
/**
 * класс Book представляет книгу с заголовком, автором и годом выпуска.
 */
public class Book {
    private String title;
    private String author;
    private int year;
    /**
     * конструктор для создания экземпляра книги.
     *
     * @param title название книги
     * @param author автор книги
     * @param year год выпуска
     */
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;  
    }
    /**
     * возвращает название книги.
     *
     * @return название книги
     */
    public String getTitle() {
        return title;
    }
    /**
     * возвращает автора книги.
     *
     * @return автор книги
     */
    public String getAuthor() {
        return author;
    }
    /**
     * возвращает год выпуска книги.
     *
     * @return год выпуска книги
     */
    public int getYear() {
        return year;
    }
    /**
     * возвращает строковое представление книги.
     *
     * @return строковое представление книги
     */
    @Override
    public String toString() {
        return "Книга: '" + title + '\'' +
               ", Автор: '" + author + '\'' +
               ", Год выпуска: " + year;
    }
}
