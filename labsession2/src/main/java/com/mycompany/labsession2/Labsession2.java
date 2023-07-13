package com.mycompany.labsession2;
public class Labsession2 
{
    public static void main(String[] args) 
    {
        Employee e=new Employee();
        Employee b=new Employee();
        e.setempName("Bogdan");
        e.setempID(1234);
        e.setempDesignation("Manager");
        b.setempName("Bird");
        b.setempID(3456);
        b.setempDesignation("Assistant");
        //Getting the outputs using getter methods
        //Bogdan
        System.out.println("Employee name: "+e.getempName());
        System.out.println("Employee ID: "+e.getempID());
        System.out.println("Employee designation: "+e.getempDesignation());
        //Bird
        System.out.println("Employee name: "+b.getempName());
        System.out.println("Employee ID: "+b.getempID());
        System.out.println("Employee designation: "+b.getempDesignation());
    }
}
