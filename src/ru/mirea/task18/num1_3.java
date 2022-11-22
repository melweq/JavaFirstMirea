package ru.mirea.task18;

public class num1_3 {
    static public class Exception1
    {
        public void exceptionDemo()
        {
            try
            {
                System.out.println( 2/0 );
            } catch ( ArithmeticException e ) {
                System.out.println("Attempted division by zero");
            }
        }
    }

    public static void main(String[] args) {
        Exception1 mc1 = new Exception1();
        mc1.exceptionDemo();
    }
}

