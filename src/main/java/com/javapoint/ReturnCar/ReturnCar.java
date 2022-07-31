package com.javapoint.ReturnCar;

public class ReturnCar 
{
    private String cust_Name;
    private String cust_Email;
    private int date;
    private String cust_address;

    public ReturnCar()
    {

    }
    public ReturnCar(String cust_Name, String cust_Email, int date, String cust_address)
    {
        super();
        this.cust_Name = cust_Name;
        this.cust_Email = cust_Email;
        this.date = date;
        this.cust_address = cust_address;
    }
    public String getCustName()
    {
        return cust_Name;
    }
    public void setCustName(String cust_Name)
    {
        this.cust_Name = cust_Name;
    }
    public String getCustEmail()
    {
        return cust_Email;
    }
    public void setCustEmail(String cust_Email)
    {
        this.cust_Email = cust_Email;
    }
    public int getDate()
    {
        return date;
    }
    public void setDate(int date)
    {
        this.date = date;
    }
    public String getCustAddress()
    {
        return cust_address;
    }
    public void setCustAddress(String cust_address)
    {
        this.cust_address = cust_address;
    }
}
