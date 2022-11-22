package ru.mirea.task18;

import java.util.Scanner;

public class num8 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in);
        String key = myScanner.nextLine();
        try {
            printDetails( key );
        }
        catch (Exception e)
        {
            for(int i=1;i<=1;i++) getKey();
        }
    }
    public void printDetails(String key) {
        try { String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            throw e;
        }
    }
    private String getDetails(String key) {
        return "data for " + key;
    }
    public static void main(String[] args) throws Exception {
        num8 mc1 = new num8();
        mc1.getKey();
    }
}