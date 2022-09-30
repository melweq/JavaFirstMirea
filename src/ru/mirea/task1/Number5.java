package ru.mirea.task1;
import java.math.BigInteger;
import java.util.Scanner;

public class Number5 {
    public static  void main(String[] args) {
        int n;
        BigInteger res = BigInteger.ONE;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        n = sc.nextInt();
        while (n > 1) {
            res = res.multiply(BigInteger.valueOf(n));
            n--;
        }
        System.out.println("Факториал: " + res);
    }
}
