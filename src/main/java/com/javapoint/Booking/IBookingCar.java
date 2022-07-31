package com.javapoint.Booking;

import java.util.HashSet;

public interface IBookingCar 
{
    HashSet<BookingCar> findAllBooking();
    BookingCar findBookingByID(long id);
    void addBooking(BookingCar b);
    void deleteAllData();
}