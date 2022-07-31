package com.javapoint.Feedback;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FeedbackList implements IFeedbackList
{
    /**
     * @return
     */
    public List<Feedback> findAll()
    {
        ArrayList<Feedback> feedbackList = new ArrayList<Feedback>();
        feedbackList.add(new Feedback("A good good service provide by the rental car"));
        feedbackList.add(new Feedback("Car is in a good condition to rent"));
        
        return feedbackList;
    }

    @Override
    public HashSet<FeedbackList> findAllBooking() 
    {
        return null;
    }

    @Override
    public FeedbackList findBookingByID(long id) 
    {
        return null;
    }
}
