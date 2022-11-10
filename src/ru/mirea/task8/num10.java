package ru.mirea.task8;

import java.util.Scanner;

public class num10 {

    public static int Rev(int n, int a){
        if (n == 0) {
            return a;
        }
        else {
            return Rev(n / 10, 10 * a + n % 10);
        }

    }
    public static void main(String[] args){
        int a = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Rev(n, a));
    }
}
