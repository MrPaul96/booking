package com.booking;

import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    @GetMapping(value = "/all")
    public List<HotelBooking> getAll() {
        return this.bookings;
    }

    @GetMapping(value = "/revenues")
    public Double getRevenues() {
        return bookings.stream()
                .mapToDouble(booking -> booking.getPricePerNight())
                .reduce(0, (x1, x2) -> x1 + x2);
    }

    @GetMapping(value = "bookings/{numberOfNights")
    public List<HotelBooking> getBookingsByNumberOfNights(@PathVariable("numberOfNights") int numberOfNights) {
        return bookings.stream()
                .filter(booking -> booking.getNumberOfNights() == numberOfNights)
                .collect(Collectors.toList());
    }
}
