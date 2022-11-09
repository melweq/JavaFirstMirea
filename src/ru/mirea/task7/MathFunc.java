package ru.mirea.task7;

public class MathFunc implements MathCalculable {
    @Override
    public double pow(double num, double power) {
        return Math.pow(num, power);
    }

    @Override
    public double complexNumMod(double real, double im) {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(im, 2));
    }

    public double getCircleLength(double radius) {
        return 2 * PI * radius;
    }
}
