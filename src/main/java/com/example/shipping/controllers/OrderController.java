package com.example.shipping.controllers;

import com.example.shipping.dtos.OrderTotalDTO;
import com.example.shipping.entities.Order;
import com.example.shipping.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private Order lastOrder;

    @Autowired
    private OrderService orderService;


    @PostMapping("/calculate")
    public OrderTotalDTO calculateTotal(@RequestBody Order order) {
        double total = orderService.total(order);
        this.lastOrder = order; // guarda o pedido em memória
        return new OrderTotalDTO(order.getCode(), total);
    }


    @GetMapping("/lastOrder")
    public Order getLastOrder() {
        if (lastOrder == null) {
            throw new RuntimeException("Nenhum pedido foi cadastrado ainda!");
        }
        return lastOrder;
    }
}

