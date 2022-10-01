package ru.mirea.task2;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Имя");
        String name = scanner.next();
        System.out.println("email");
        String email = scanner.next();
        System.out.println("Гендер");
        char gender = scanner.next().charAt(0);

        Author author = new Author(name, email, gender);
        System.out.println("Имя - " + author.getName());
        System.out.println("Email - " + author.getEmail());
        System.out.println("Гендер - " + author.getGender());

        System.out.println("Новое имя");
        name = scanner.next();
        author.setName(name);
        System.out.println("Новый email");
        email = scanner.next();
        author.setEmail(email);

        System.out.println(author.toString());
    }
}
