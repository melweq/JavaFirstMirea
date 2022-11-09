package ru.mirea.task10;

public class Student
{
    public String Name;
    public String Surename;
    public String Specialnost;
    public int Kurs;
    public int srbal;
    public String Grupa;

    public int getKurs() {
        return Kurs;
    }

    public int getSrbal() {
        return srbal;
    }

    public void setSrbal(int srbal) {
        this.srbal = srbal;
    }

    public String getName() {
        return Name;
    }

    public String getSurename() {
        return Surename;
    }

    public String getSpecialnost() {
        return Specialnost;
    }

    public String getGrupa() {
        return Grupa;
    }

    public void setKurs(int kurs) {
        this. Kurs = kurs;
    }
    public void setsrbal(int srbal) {
        this. srbal = srbal;
    }
    public void setName(String name) {
        this. Name = name;
    }

    public void setSurename(String surename) {
        this.Surename = surename;
    }

    public void setSpecialnost(String specialnost) {
        this.Specialnost = specialnost;
    }

    public void setGrupa(String grupa) {
        this. Grupa = grupa;
    }

    public Student(int kurs,int srbal, String name, String surename, String specialnost, String grupa) {
        Kurs = kurs;
        Name = name;
        Surename = surename;
        Specialnost = specialnost;
        Grupa = grupa;
        srbal=srbal;
    }

    public Student (){
    }

    public static void main(String[] args)
    {

    }
}
