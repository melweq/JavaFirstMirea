package ru.mirea.task6;

class MoveableCircle implements Moveable
{
    public int radius;
    public MoveablePoint center;

    public MoveableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        this.radius=radius;
        this.center = new MoveablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {return "MovableCircle{" + "radius=" + radius + ", center=" + center + '}';
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