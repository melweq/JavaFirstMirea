package ru.mirea.task10;

import java.util.Scanner;
class num3 implements Comparator<Student>
{
    Scanner in = new Scanner(System.in);
    public  Student[] idNumber = new Student[20];
    public  Student[] idNumber1 = new Student[20];
    public  Student[] idNumber2 = new Student[20];
    public void setArray()
    {
        int i,f;
        String A;
        for(i=0;i<3;i++)
        {
            idNumber[i] = new Student();
            idNumber1[i] = new Student();
            idNumber2[i] = new Student();
        }
        for(i=0;i<1;i++)
        {
            System.out.println("ведите Имя студента:");
            A=in.nextLine();
            idNumber [i] .setName(A);
            System.out.println("ведите фамилию студента:");
            A=in.nextLine();
            idNumber [i] .setSurename(A);
            System.out.println("ведите Специальность студента:");
            A=in.nextLine();
            idNumber [i] .setSpecialnost(A);
            System.out.println("ведите курс студента:");
            f=in.nextInt();
            idNumber [i] .setKurs(f);
            System.out.println("ведите Группу студента:");
            A=in.nextLine();
            A=in.nextLine();
            idNumber [i] .setGrupa(A);
            System.out.println("ведите Средний бал студента:");
            f=in.nextInt();
            idNumber [i] .setsrbal(f);
            A=in.nextLine();
        }
        for(i=0;i<1;i++)
        {
            System.out.println("ведите Имя студента:");
            A=in.nextLine();
            idNumber1 [i] .setName(A);
            System.out.println("ведите фамилию студента:");
            A=in.nextLine();
            idNumber1 [i] .setSurename(A);
            System.out.println("ведите Специальность студента:");
            A=in.nextLine();
            idNumber1 [i] .setSpecialnost(A);
            System.out.println("ведите курс студента:");
            f=in.nextInt();
            idNumber1 [i] .setKurs(f);
            System.out.println("ведите Группу студента:");
            A=in.nextLine();
            A=in.nextLine();
            idNumber1 [i] .setGrupa(A);
            System.out.println("ведите Средний бал студента:");
            f=in.nextInt();
            idNumber1 [i] .setsrbal(f);
            A=in.nextLine();
        }
        idNumber2[0]=idNumber1[0];
        idNumber2[1]=idNumber[0];
    }
    public void outArray()
    {
        int i;
        for(i=0;i<2;i++)
            System.out.println(idNumber2[i] .getName()+" "+idNumber2[i] .getSurename()+" "+idNumber2[i] .getSpecialnost()+" "+idNumber2[i] .getKurs()+" "+idNumber2[i] .getGrupa()+" "+idNumber2[i] .getSrbal());
    }
    @Override
    public void sortkurs()
    {
        int i;
        int p1,p2;
        String p3,p4,p5,p6;
        for(i=1;i<3;i++)
        {
            if(idNumber2[i].getKurs()>idNumber2[i-1].getKurs())
            {
                p1=idNumber2[i].getKurs();
                p2=idNumber2[i].getSrbal();
                p3=idNumber2[i].getName();
                p4=idNumber2[i].getSurename();
                p5=idNumber2[i].getSpecialnost();
                p6=idNumber2[i].getGrupa();

                idNumber2[i].setKurs(idNumber2[i-1].getKurs());
                idNumber2[i].setSrbal(idNumber2[i-1].getSrbal());
                idNumber2[i].setName(idNumber2[i-1].getName());
                idNumber2[i].setSurename(idNumber2[i-1].getSurename());
                idNumber2[i].setSpecialnost(idNumber2[i-1].getSpecialnost());
                idNumber2[i].setGrupa(idNumber2[i-1].getGrupa());

                idNumber2[i-1].setKurs(p1);
                idNumber2[i-1].setSrbal(p2);
                idNumber2[i-1].setName(p3);
                idNumber2[i-1].setSurename(p4);
                idNumber2[i-1].setSpecialnost(p5);
                idNumber2[i-1].setGrupa(p6);
                sortsrbal();
            }
        }
    }
    @Override
    public void sortsrbal()
    {
        int i;
        int p1,p2;
        String p3,p4,p5,p6;
        for(i=1;i<3;i++)
        {
            if(idNumber2[i].getSrbal()>idNumber2[i-1].getSrbal())
            {
                p1=idNumber2[i].getKurs();
                p2=idNumber2[i].getSrbal();
                p3=idNumber2[i].getName();
                p4=idNumber2[i].getSurename();
                p5=idNumber2[i].getSpecialnost();
                p6=idNumber2[i].getGrupa();

                idNumber2[i].setKurs(idNumber2[i-1].getKurs());
                idNumber2[i].setSrbal(idNumber2[i-1].getSrbal());
                idNumber2[i].setName(idNumber2[i-1].getName());
                idNumber2[i].setSurename(idNumber2[i-1].getSurename());
                idNumber2[i].setSpecialnost(idNumber2[i-1].getSpecialnost());
                idNumber2[i].setGrupa(idNumber2[i-1].getGrupa());

                idNumber2[i-1].setKurs(p1);
                idNumber2[i-1].setSrbal(p2);
                idNumber2[i-1].setName(p3);
                idNumber2[i-1].setSurename(p4);
                idNumber2[i-1].setSpecialnost(p5);
                idNumber2[i-1].setGrupa(p6);
                sortsrbal();
            }
        }
    }

    public static void main(String[] args)
    {
        int i;
        num3 m1 = new num3();
        m1.setArray();
        m1.sortsrbal();
        m1.outArray();
    }
}
