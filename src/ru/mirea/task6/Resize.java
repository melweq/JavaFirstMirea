package ru.mirea.task6;

class Resize implements Command {
    Shape current;
    Shape previous;

    Resize(Shape ob) {
        previous = new Shape();
        previous.name = ob.name;
        current = ob;
    }
    public void execute() {
        current.name = "Strange";
        System.out.println("Old name: " + previous.name);
        System.out.println("New name: " + current.name);
    }

    public void unexecute() {
        current = previous;
        System.out.println("Now, current name is: " + current.name);
    }
}
