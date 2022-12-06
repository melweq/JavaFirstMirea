package ru.mirea.task29;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;


public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Info myCurrency = new Info(17);
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\melweq\\Desktop\\Lec.ser"); //Директория
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(myCurrency);
        objectOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\melweq\\Desktop\\Lec.ser"); //Директория
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Info myCurrencyDeserialized = (Info) objectInputStream.readObject();
        System.out.println(myCurrencyDeserialized);
    }
}
