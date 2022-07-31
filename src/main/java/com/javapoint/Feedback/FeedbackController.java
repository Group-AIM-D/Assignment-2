package com.javapoint.Feedback;

import java.util.HashSet;
//import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedbackController 
{
    @Autowired
    private IFeedbackList feedbackList;

    @GetMapping(value = "/feedback")
    public HashSet<FeedbackList> getFeedback()
    {
        HashSet<FeedbackList> feedback = feedbackList.findAllBooking();
        return feedback;
    }
}
