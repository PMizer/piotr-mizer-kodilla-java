package com.kodilla.good.patterns.challenges.OrderService;

public class OrderDto {
    public Order order;
    public boolean isValid;

    public OrderDto(Order order, boolean isValid) {
        this.order = order;
        this.isValid = isValid;
    }

    public Order getOrder() {
        return order;
    }

    public boolean isValid() {
        return isValid;
    }
}
