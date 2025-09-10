package com.example.shipping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShippingApplication  {
//public class ShippingApplication implements CommandLineRunner {

//    @Autowired
//    private OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(ShippingApplication.class, args);
    }


//    @Override
//    public void run(String... args) throws Exception {
//        Order order1 = new Order(1034, 150.0, 20.0);
//        Order order2 = new Order(2282, 800.0, 10.0);
//        Order order3 = new Order(1309, 95.90, 0.0);
//
//        System.out.println("Pedido código " + order1.getCode()
//                + " - Valor total: R$ " + String.format("%.2f", orderService.total(order1)));
//
//        System.out.println("Pedido código " + order2.getCode()
//                + " - Valor total: R$ " + String.format("%.2f", orderService.total(order2)));
//
//        System.out.println("Pedido código " + order3.getCode()
//                + " - Valor total: R$ " + String.format("%.2f", orderService.total(order3)));
//    }
}
