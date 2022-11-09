package ru.mirea.task9;

import java.util.Arrays;
class SortingStudentsByGPA
{
    public static void sortik(int[] array, int low, int high) {
        if (array.length == 0) return;
        if (low >= high) return;
        int middle = low + (high - low) / 2;
        int opora = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {i++;}
            while (array[j] > opora) {j--;}
            if (i <= j)
            {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            sortik(array, low, j);
        if (high > i)
            sortik(array, i, high);
    }
    public static void main(String[] args) {
        int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        System.out.println("Было");
        System.out.println(Arrays.toString(x));

        int low = 0,i;
        int high = x.length - 1;

        sortik(x, low, high);
        System.out.println("Стало");
        for(i=8;i>=0;i--)
            System.out.print(x[i] + " ");
    }

}