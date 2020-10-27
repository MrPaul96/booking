package com.booking;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class HotelBooking implements Serializable {
    private String hotelName;
    private double pricePerNight;
    private int numberOfNights;

    public double getTotalPrice() {
        return pricePerNight * numberOfNights;
    }
}
