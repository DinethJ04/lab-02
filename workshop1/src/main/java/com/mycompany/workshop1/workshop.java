package com.mycompany.workshop1;
public class workshop 
{
    private  int EmployeeID;
    private String EmployeeName;
    private float EmployeeSalary;
    
    public void setData(int ei,String en,float es)
    {
        EmployeeID=ei;
        EmployeeName=en;
        EmployeeSalary=es;
    }
    
    public void setEmployeeID(int ei)
    {
        this.EmployeeID=EmployeeID;
    }
    public int getEmployeeID(int ei)
    {
        return EmployeeID;
    }
    public void setEmployeeName(String en)
    {
        this.EmployeeName=EmployeeName;
    }
    public String getEmployeename(String en)
    {
        return EmployeeName;
    }
    public void setEmployeeSalary(float es)
    {
        this.EmployeeSalary=EmployeeSalary;
    }
    public float getEmployeeSalary(float es)
    {
        return EmployeeSalary;
    }
}
