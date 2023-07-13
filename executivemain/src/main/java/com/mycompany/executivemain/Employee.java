package com.mycompany.executivemain;
public class Employee 
{
    private int employeeid;
    private String employeename,address,dob;
    protected float salary;
    //parameterized constructor
    public Employee(int e,String d,String en,String a,float s)
    {
        employeeid=e;
        dob=d;
        employeename=en;
        address=a;
        salary=s;
    }
    
    public void displayinfo()
    {
        System.out.println("The employee ID is: "+employeeid);
        System.out.println("The date of birth is: "+dob);
        System.out.println("The employee name is: "+employeename);
        System.out.println("The address is: "+address);
        System.out.println("The salary is: "+salary);
    }
}
