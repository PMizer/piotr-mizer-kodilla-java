package com.kodilla.good.patterns.challenges.order.service.services;

import com.kodilla.good.patterns.challenges.order.service.orders.Order;

import java.util.ArrayList;
import java.util.List;

public class DatabaseRepository implements OrderRepository {
    @Override
    public void saveToRepo(Order order) {
        List<Order> orderDatabase = new ArrayList<>();
        System.out.println("Dodaje zamowienie do bazy danych ");
        orderDatabase.add(order);
    }
}
