package ru.mirea.task6;

class AddNewShape implements Command {

    Shape newShape;

    AddNewShape(Shape ob) {
        newShape = ob;
    }

    public void execute() {
        System.out.println(newShape.name + " shape is done.");
    }

    public void unexecute() {
        System.out.println(newShape.name + " is deleted.");
        newShape = null;
    }
}
