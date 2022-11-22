package ru.mirea.task18;

import java.util.Scanner;
public class num7
{
    static public class ThrowsDemo
    {
        public void getKey() throws Exception {
            String  key=null;
            try {
                printDetails(key);
            }
            catch (NullPointerException e) {
                throw new Exception("Key set to empty string");
            }
        }
    }

    public static void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private static String getDetails(String key) throws Exception {
        return "data for " + key;
    }
    public static void main(String[] args) throws Exception {
        ThrowsDemo mc1 = new ThrowsDemo();
        mc1.getKey();
    }
}
