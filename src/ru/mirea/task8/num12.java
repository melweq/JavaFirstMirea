package ru.mirea.task8;

import java.util.Scanner;

public class num12 {
    public static void Rec(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 0){
            return;
        }
        if (num % 2 != 0) {
            System.out.println(num);
            Rec();
        }
        else {
            Rec();
        }

    }

    public static void main(String[] args){
        Rec();
    }
}