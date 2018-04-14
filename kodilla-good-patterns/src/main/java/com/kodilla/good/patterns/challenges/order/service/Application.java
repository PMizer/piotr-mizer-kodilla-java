package com.kodilla.good.patterns.challenges.order.service;

import com.kodilla.good.patterns.challenges.order.service.orders.Order;
import com.kodilla.good.patterns.challenges.order.service.orders.OrderProcessor;
import com.kodilla.good.patterns.challenges.order.service.orders.OrdersDatabase;
import com.kodilla.good.patterns.challenges.order.service.services.DatabaseRepository;
import com.kodilla.good.patterns.challenges.order.service.orders.OrderServiceStatus;
import com.kodilla.good.patterns.challenges.order.service.services.EmailService;

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


