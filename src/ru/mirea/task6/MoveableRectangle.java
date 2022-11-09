package ru.mirea.task6;

public class MoveableRectangle
{
    public MoveablePoint topLeft;
    public MoveablePoint bottomRight;

    public MoveableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        this.topLeft.x=x1;
        this.topLeft.y=y1;
        this.bottomRight.x=x2;
        this.bottomRight.y=y2;
        this.bottomRight.xSpeed=xSpeed;
        this.bottomRight.ySpeed=ySpeed;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" + "topLeft=" + topLeft + ", bottomRight=" + bottomRight + '}';
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
