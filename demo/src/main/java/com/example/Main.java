package com.example;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
/**
 * класс Main
 */

public class Main {
    
    public static void main(String[] args) {
        // Создаем библиотеку
        Library library1 = new Library();
        library1.setName("Центральная библиотека");
        library1.setCapacity(10);  // Вместимость

        Book book1 = new Book("Ведьмак:Час презрения", "Andrzej Sapkowski", 1995);
        Book book2 = new Book("Ведьмак:Крещение огнем", "Andrzej Sapkowski", 1996);
        Book book3 = new Book("Бегущий за ветром", "Khaled Hosseini", 1997);
        Book book4 = new Book("Зеленая Миля", "Stephen King", 1996);
        Book book5 = new Book("Гарри Поттер и узник Азкабана", "J.K Rowling", 2003);

        // Добавляем книги в библиотеку
        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);
        library1.addBook(book4);
        library1.addBook(book5);

        
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

        while (true) {
            System.out.println("\nВыбор:");
            System.out.println("1. Показать все книги одного автора");
            System.out.println("2. Показать полную информацию о всех книгах");
            System.out.println("3. Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очиcтка буфера

            switch (choice) {
                case 1:
                    System.out.print("Введите имя автора: ");
                    String author = scanner.nextLine().trim(); 
                    Book[] booksByAuthor = library1.getBooksByAuthor(author);
                    if (booksByAuthor.length > 0) {
                        System.out.println("\nКниги автора '" + author + "' в " + library1.getName() + ":");
                        for (Book book : booksByAuthor) {
                            System.out.println(book);
                        }
                    } else {
                        System.out.println("Книги данного автора не найдены.");
                    }
                    break;
                case 2:
                    System.out.println("\nВсе книги в библиотеке " + library1.getName() + ":");
                    library1.printAllBooks();
                    break;
                case 3:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}
