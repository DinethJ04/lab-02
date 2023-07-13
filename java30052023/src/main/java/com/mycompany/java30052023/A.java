package com.mycompany.java30052023;
public class A 
{
    private int a,b;
    //parameterized constructor
    public A(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    
    public void displayA()
    {
        System.out.println("The value of a is: "+a);
        System.out.println("The value oof b is: "+b);
    }
}