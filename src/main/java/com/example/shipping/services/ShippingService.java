package com.example.shipping.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shippment(double order) {
        if (order < 100.0) {
            return 20.0;
        } else if (order < 200.0) {
            return 12.0;
        } else {
            return 0.0;
        }
    }
}
