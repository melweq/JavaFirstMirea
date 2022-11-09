package ru.mirea.task6;

class NameableClass implements Nameable
{
    String name;
    public NameableClass(String name)
    {
        this.name = name;
        getName();
    }
    public void getName ()
    {
        System.out.println(toString());
    }
    @Override
    public String toString()
    {
        return "Название:" + name ;
    }
}
