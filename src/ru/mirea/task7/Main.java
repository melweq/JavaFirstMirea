package ru.mirea.task7;

public class Main {
    public static void main(String[] args) {
        MathCalculable mc = new MathFunc();
        System.out.println(mc.pow(10, 3.14));
        System.out.println(mc.complexNumMod(10, 4));
        System.out.println(((MathFunc) mc).getCircleLength(42));
    }
}
