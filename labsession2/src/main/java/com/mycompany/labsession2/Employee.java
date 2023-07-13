package com.mycompany.labsession2;
public class Employee 
{
    private int empID;
    private String empName,empDesignation;
    public void setempID(int i)
    {
        empID=i;
    }
    public int getempID()
    {
        return empID;
    }
    public void setempName(String n)
    {
        empName=n;
    }
    public String getempName()
    {
        return empName;
    }
    public void setempDesignation(String d)
    {
        empDesignation=d;
    }
    public String getempDesignation()
    {
        return empDesignation;
    }
}
