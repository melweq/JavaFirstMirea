package ru.mirea.task1;
import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Размер массива
        int[] data = new int[n];
        int sum = 0;
        int i;
        int max_elem = 0;
        int min_elem = 10;
        // Ввод чисел
        for (i = 0; i < n; ++i) {
            data[i] = scanner.nextInt();
        }

        // Цикл While
        sum = 0;
        i = 0;
        while(i < n){
            sum += data[i];
            ++i;
            if(i > max_elem){
                max_elem = i;
            }
        }
        System.out.println("Сумма: " + sum);
        System.out.println("Максимальный элемент: " + max_elem);

        // Цикл do-while
        i = 0;
        sum = 0;
        do {
            sum += data[i];
            ++i;
            if(i < min_elem){
                min_elem = i;
            }
        } while (i < n);
        System.out.println("Сумма: " + sum);
        System.out.println("Минимальный элемент: " + min_elem);
    }
}
