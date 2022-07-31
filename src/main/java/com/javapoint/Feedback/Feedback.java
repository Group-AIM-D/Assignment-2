package com.javapoint.Feedback;

//import org.hibernate.validator.constraints.Email;

public class Feedback 
{
    private String name;
    private String email;
    private String subject;
    private String feedback;

    public Feedback(String name, String email, String subject, String feedback)
    {
        super();
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.feedback = feedback;
    }
    public Feedback(String string) {
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
    public String getSubject()
    {
        return subject;
    }
    public void setSubject(String subject)
    {
        this.subject = subject;
    }
    public String getFeedback()
    {
        return feedback;
    }
    public void setFeedback(String feedback)
    {
        this.feedback = feedback;
    }
}
