package com.kodilla.good.patterns.challenges.order.service.orders;

import com.kodilla.good.patterns.challenges.order.service.services.OrderService;

import java.time.LocalDate;

public class OrderServiceStatus implements OrderService {
    @Override
    public boolean orderState(Order order) {
        return order.getOrderDate().isAfter(LocalDate.now());
    }
}
