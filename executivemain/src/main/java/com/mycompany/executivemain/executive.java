package com.mycompany.executivemain;
public class executive extends Employee implements paybonus
{
    private float travelallowance;
    public executive(int e,String d,String en,String a,float s,float t)
    {
        super(e,d,en,a,s);
        travelallowance=t;
    }
    public void calcincentive()
    {
        float incentive;
        if (salary>=5000)
        {
            incentive=salary*0.10f;
            System.out.println("Incentive amount is: "+incentive);
        }
        else
            System.out.println("Not eligible for an incentive");
    }
}
