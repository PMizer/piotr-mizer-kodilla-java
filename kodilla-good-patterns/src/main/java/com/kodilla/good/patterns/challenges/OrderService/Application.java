package com.kodilla.good.patterns.challenges.OrderService;

import java.util.List;

public class Application {
    public static void main(String argsp[]) {

        OrdersDatabase ordersDatabase = new OrdersDatabase();
        List<Order> orders = ordersDatabase.create();
        System.out.println(orders.get(0));


        OrderProcessor orderProcessor = new OrderProcessor(new EmailService(), new OrderServiceStatus(), new DatabaseRepository());
        orderProcessor.process(orders.get(0));


    }
}


