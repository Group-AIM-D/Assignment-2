package com.javapoint.ReturnCar;

import java.util.ArrayList;
//import java.util.HashSet;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ReturnCarList 
{
     /**
     * @return
     */
    public List<ReturnCar> findAll()
    {
        ArrayList<ReturnCar> returnCarList = new ArrayList<ReturnCar>();
        returnCarList.add(new ReturnCar("Atifah", "atifah@gmail.com", 130722, "Taman Melawati, Kuala Lumpur"));
        
        return returnCarList;
    }
}
