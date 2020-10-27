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

    private static final List<Point> points = createPoints();

    private static List<Point> createPoints() {

        List<Point> result = new ArrayList<>();
        result.add(new Point(-4, -8));
        result.add(new Point(-2, 9));
        result.add(new Point(-1, -8));
        result.add(new Point(0, -7));
        result.add(new Point(1, 1));
        result.add(new Point(2, 3));
        result.add(new Point(2, 3));
        result.add(new Point(2, -2));
        result.add(new Point(4, -1));

        return result;
    }


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
