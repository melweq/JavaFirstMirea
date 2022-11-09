package ru.mirea.task6;

class MoveablePoints implements Moveable
{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MoveablePoints(int x, int y, int xSpeed, int ySpeed)
    {
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    @Override
    public String toString()
    {
        return "MovablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
    }

    public void moveup ()
    {
        System.out.println("Вверх\n" );
    }
    public void movedown ()
    {
        System.out.println("Вниз\n" );
    }
    public void moveleft ()
    {
        System.out.println("Влево\n" );
    }
    public void moveright ()
    {
        System.out.println("Вправо\n" );
    }
}