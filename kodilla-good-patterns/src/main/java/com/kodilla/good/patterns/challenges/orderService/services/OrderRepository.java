package com.kodilla.good.patterns.challenges.orderService.services;

import com.kodilla.good.patterns.challenges.orderService.orders.Order;

public interface OrderRepository {
    public void saveToRepo(Order order);
}
