package com.example;
/**
 * класс Library представляет библиотеку содержащую книги.
 */
public class Library {
    private String name;
    private Book[] books;
    private int count;
    /**
     * установка вместимость библиотеки.
     *
     * @param capacity максимальное количество книг, которые может содержать библиотека
     */
    public void setCapacity(int capacity) {
        this.books = new Book[capacity];
        this.count = 0;
    }

    /**
     * установка название библиотеки.
     *
     * @param name название библиотеки
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * добавление книгу в библиотеку.
     *
     * @param book книга для добавления
     */
    public void addBook(Book book) {
        if (count < books.length) {  
            books[count] = book;  
            count++;
        } else {
            System.out.println("Библиотека переполнена. Книги больше не помещаются.");
        }
    }
    /**
     * выводит информацию о всех книгах в библиотеке.
     */
    public void printAllBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
    /**
     * возвращает массив книг указанного автора.
     *
     * @param author имя автора для поиска
     * @return массив книг, написанных указанным автором
     */
    public Book[] getBooksByAuthor(String author) {
        int resultCount = 0;
        author = author.trim();  //  trim убирает пробелы
    
        // считаем количество книг нужного автора, игнорируя регистр
        for (int i = 0; i < count; i++) {
            if (books[i].getAuthor().trim().equalsIgnoreCase(author)) {
                resultCount++;
            }
        }
    
        // массив для хранения книг нужного автора
        Book[] result = new Book[resultCount];
        int index = 0;
    
        // заполнение массива книгами нужного автора, игнорируя регистр
        for (int i = 0; i < count; i++) {
            if (books[i].getAuthor().trim().equalsIgnoreCase(author)) {
                result[index] = books[i];
                index++;
            }
        }
    
        return result;
    }
    /**
     * возвращает название библиотеки.
     *
     * @return название библиотеки
     */
    public String getName() {
        return name;
    }
}