package com.javapoint.Profile;

import java.util.ArrayList;
//import java.util.HashSet;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProfileDetails implements IProfileDetails
{
    private boolean add;

    /**
     * @return
     */
    public List<Profile> findAll()
    {
        ArrayList<Profile> profileDetails = new ArrayList<Profile>();
        add = profileDetails.add(new Profile("Atifah", "atifah@gmail.com", 013, "Taman Melawati, Kuala Lumpur"));
        
        return profileDetails;
    }
}
