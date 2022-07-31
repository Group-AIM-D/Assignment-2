package com.javapoint.ReturnCar;

//import java.util.HashSet;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReturnCarController 
{
    @Autowired
    private IReturnCarList returnCarList;

    @GetMapping(value = "/returnCar")
    public List<ReturnCar> getReturnCar()
    {
        List<ReturnCar> returnCar = returnCarList.findAll();
        return returnCar;
    }
}
