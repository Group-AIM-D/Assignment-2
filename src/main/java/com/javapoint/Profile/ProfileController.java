package com.javapoint.Profile;

//import java.util.HashSet;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController 
{
    @Autowired
    private IProfileDetails profileDetails;

    @GetMapping(value = "/profile")
    public List<Profile> getProfile()
    {
        List<Profile> profile = profileDetails.findAll();
        return profile;
    }
}
