package com.booking;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("points")
public class PointController {

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

    @RequestMapping(value = "/sum", method = RequestMethod.GET)
    public int sumPoints() {
        points.forEach(System.out::println);

        int result = points.stream()
                .mapToInt(p -> p.x)
                .reduce(0, (x1, x2) -> x1 + x2);

        return result;
    }

}
