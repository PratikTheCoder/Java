package Experiment12;

import java.util.Scanner;
import Experiment12.library.Book;

public class Exp12b {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        int bookId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Book Price: ");
        double price = sc.nextDouble();

        Book b = new Book(bookId, title, author, price);

        System.out.println();

        b.display();

        sc.close();
    }
}