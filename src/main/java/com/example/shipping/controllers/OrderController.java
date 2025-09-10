package com.example.shipping.controllers;

import com.example.shipping.dtos.OrderTotalDTO;
import com.example.shipping.entities.Order;
import com.example.shipping.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/calculate")
    public OrderTotalDTO calculateTotal(@RequestBody Order order) {
        double total = orderService.total(order);
        return new OrderTotalDTO(order.getCode(), total);
    }

    @GetMapping("/hello")
    public String hello() {
        return "API de frete funcionando!";
    }
}
