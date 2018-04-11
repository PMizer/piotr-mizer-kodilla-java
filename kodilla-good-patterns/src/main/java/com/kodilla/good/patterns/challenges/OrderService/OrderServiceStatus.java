package com.kodilla.good.patterns.challenges.OrderService;

import java.time.LocalDate;

public class OrderServiceStatus implements OrderService {
    @Override
    public boolean orderState(Order order) {
        if(order.getOrderDate().isAfter(LocalDate.now())){
            return true;
        }
        else {
            return false;
        }
    }
}
