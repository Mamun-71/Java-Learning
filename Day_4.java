import java.util.Scanner;


class Pen{

    String color;
    String type;

    public void write()
    {
        System.out.println("writing something");
    }

    public void printColor()
    {
        System.out.println(this.color);
    }
}

class Student
{
    String name;
    int age;


    public  void printInfo(String name)
    {
        System.out.println(this.name);
    }

    public  void printInfo(int age)
    {
        System.out.println(this.age);
    }

    public void printInfo(String name,int age)//Constructor
    {
        System.out.println(name+" "+age);
    }

    Student(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
}

class Shape {
    public void area()
    {
        System.out.println("displays area");
    }
}

class Tringle extends Shape//Inheritance
{
    //Single inheritance.

    public void area(int l,int h)
    {
        System.out.println(l/2*l*h);
    }

}
class EquilateralTriangle extends Tringle
{
    //Multi-level inheritance.

    public void area(int l,int h)
    {
        System.out.println(l/2*l*h);
    }
}

class Circle extends Shape//H
{
    //Hierarchical Inheritance.
    
    public void area(double r)
    {
        System.out.println(3.14*r*r);
    }
}

public class Main {
    public static void main(String[] args) {

       /* Pen pen1 = new  Pen();

        pen1.color = "blue";
        pen1.type = "gel";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen2.printColor();

        */

        Student s1 = new Student("Mamun",24);
        /*
        s1.name = "Mamun";
        s1.age = 24;
        */

        s1.printInfo("Mamun",23);


    }
}
