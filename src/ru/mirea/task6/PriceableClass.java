package ru.mirea.task6;

class PriceableClass implements Priceable
{
    String name;
    public PriceableClass(String name)
    {
        this.name = name;
        getPrice();
    }
    public void getPrice ()
    {
        System.out.println(toString());
    }
    @Override
    public String toString()
    {
        return "Разница в цене:" + name ;
    }
}
