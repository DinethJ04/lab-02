package com.mycompany.java30052023;
public class B extends A
{
    private int c;
    public B(int a,int b,int c)
    {
        super(a,b);
        this.c=c;
    }
    public void displayB()
    {
        System.out.println("The value of c is: "+c);
    }
}

