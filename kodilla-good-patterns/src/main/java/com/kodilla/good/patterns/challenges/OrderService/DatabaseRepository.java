package com.kodilla.good.patterns.challenges.OrderService;

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
