package ru.mirea.task18;

public class num6
{
    static public class ThrowsDemo {
        public void printMessage(String key) {
            try {

                String message = getDetails(key);
                System.out.println(message);
            }
            catch (NullPointerException e) {
                System.out.println("NullPointerException -> все сломалось!");
            }
        }
        public String getDetails(String key) {
            if(key == null) {
                throw new NullPointerException( "null key in getDetails" );
            }
            return "data for " + key; }
    }
    public static void main(String[] args)
    {
        String key="0";
        ThrowsDemo mc1 = new ThrowsDemo();
        mc1.printMessage(key);
    }
}
