package com.javapoint.Booking;

//import java.util.List;
import java.util.HashSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;

public class BookingController 
{
    @Autowired
    IBookingCar iBookingCar;
  
    @PostMapping("/")
    public void addBooking(@RequestBody BookingCar bookingCar) 
    {
        iBookingCar.addBooking(bookingCar);
    }
  
    @GetMapping("/findall")
    public HashSet<BookingCar> getAllBooking() 
    {
        return iBookingCar.findAllBooking();
    }
  
    @GetMapping("/findbyid/{id}")
    public BookingCar geBookById(@PathVariable long id) 
    {
        return iBookingCar.findBookingByID(id);
    }
  
    @DeleteMapping("/delete")
    public void deleteBook() 
    {
        iBookingCar.deleteAllData();
    }
}
