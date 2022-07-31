package com.javapoint.Profile;

public class Profile 
{
    private String name;
    private String email;
    private int phoneNo;
    private String address;

    public Profile()
    {

    }
    public Profile(String name, String email, int phoneNo, String address)
    {
        super();
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.address = address;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public int getPhoneNo()
    {
        return phoneNo;
    }
    public void setPhoneNo(int phoneNo)
    {
        this.phoneNo = phoneNo;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
}