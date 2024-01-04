package com.hotel.controller;

import com.hotel.Service.HotelService;
import com.hotel.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class HotelController {
    private final HotelService hotelService;

    @Autowired
    public HotelController(HotelService hotelService) { this.hotelService = hotelService; }

    @PostMapping
    public void save(@RequestBody final Hotel hotel) {
        hotelService.save(hotel);
    }


}
