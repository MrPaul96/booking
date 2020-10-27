package com.booking;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("booking")
public class BookingController {
    private List<HotelBooking> bookings;

    public BookingController() {
        bookings = new ArrayList<>();
        bookings.add(new HotelBooking("User1", 200.40, 3));
        bookings.add(new HotelBooking("User2", 90, 4));
        bookings.add(new HotelBooking("User3", 90, 5));
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<HotelBooking> getAll() {
        return this.bookings;
    }

    @RequestMapping(value = "/getRevenues", method = RequestMethod.GET)
    public Double getRevenues() {
        // bookings.forEach(booking => System.out.print(p.hotelName));

        return 1.0;
    }
}
