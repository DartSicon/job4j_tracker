package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        final String CLEAN_CODE_TITLE = "Clean code";

        Book harryPotter = new Book("Harry Potter", 400);
        Book js = new Book("Java script for dummies", 250);
        Book cleanCode = new Book(CLEAN_CODE_TITLE, 300);
        Book sport = new Book("Sport journal", 150);

        Book[] books = new Book[4];

        books[0] = harryPotter;
        books[1] = js;
        books[2] = cleanCode;
        books[3] = sport;

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println("Книга: " + books[index].getName() + ", " +
                               "Кол-во страниц: " + book.getCount() );
        }

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int index = 0; index < books.length; index++) {
            System.out.println("Книга: " + books[index].getName() + ", " +
                               "Кол-во страниц: " + books[index].getCount() );
        }

        for (int index = 0; index < books.length; index++) {
            if (books[index].getName().equals(CLEAN_CODE_TITLE)) {
                System.out.println("Книга: " + books[index].getName() + ", " +
                                   "Кол-во страниц: " + books[index].getCount() );
            }
        }
    }
}
