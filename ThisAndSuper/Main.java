

//EVERY CLASS IN JAVA EXTENDS THE OBJECT CLASS

class A //Extends object clas
{
    public A()
    {   
         super();//every constructor in java has an invisible method called super
        System.out.println("in A");
    }
    public A(int a)
    {
        System.out.println("in A int");
    }
}

class B extends A
{
    public B()
    {
        super(); //will call the default constructor of super class A
        System.out.println("in B");
    }

    public B(int a)
    {   
        //this(); //will execute the constructor of this class
        super(a); //will call the PARAMETERIZED constructor of super class A
        System.out.println("in B int");
    }
}

public class Main
{
    public static void main(String[] a)
    {
       B obj = new B(5);
    }
}