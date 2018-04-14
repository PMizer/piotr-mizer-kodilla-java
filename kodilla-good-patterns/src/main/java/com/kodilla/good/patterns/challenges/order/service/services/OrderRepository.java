package com.kodilla.good.patterns.challenges.order.service.services;

import com.kodilla.good.patterns.challenges.order.service.orders.Order;

public interface OrderRepository {
    public void saveToRepo(Order order);
}
