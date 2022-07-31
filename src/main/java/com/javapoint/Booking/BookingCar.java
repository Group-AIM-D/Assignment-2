package com.javapoint.Booking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
//import java.util.List;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

@Service
public class BookingCar implements IBookingCar
{
    /**
     * @return
     */
    public List<Booking> findAll()
    {
        ArrayList<Booking> returnCarList = new ArrayList<Booking>();
        returnCarList.add(new Booking("Ford"));
        returnCarList.add(new Booking("BMW"));
        returnCarList.add(new Booking("Honda"));
        returnCarList.add(new Booking("Mercedes"));
        returnCarList.add(new Booking("Perodua"));

        return returnCarList;
    }

    @Override
    public HashSet<BookingCar> findAllBooking() 
    {
        return null;
    }

    @Override
    public BookingCar findBookingByID(long id) 
    {
        return null;
    }

    @Override
    public void addBooking(BookingCar b) {}

    @Override
    public void deleteAllData() {}
}
