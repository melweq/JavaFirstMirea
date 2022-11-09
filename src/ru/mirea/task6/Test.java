package ru.mirea.task6;

public class Test
{
    public static void main(String args[])
    {
        Shape object = new Shape("Simple");
        Command shape = new AddNewShape(object);

        System.out.println("Creating shape:");
        shape.execute();
        shape = new Resize(object);

        System.out.println("Resizing shape:");
        shape.execute();

        System.out.println("Undo resizing shape:");
        shape.unexecute();
        shape = new AddNewShape(object);

        System.out.println("Deleting shape:");
        shape.unexecute();
    }
}