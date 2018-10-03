package com.kodilla.good.patterns.challenges.food2door.orders;

import com.kodilla.good.patterns.challenges.food2door.data.Product;

import java.time.LocalDate;

public class OrderDto {
    private Product product;
    private LocalDate createdOrder;
    private boolean isOrdered;

    public OrderDto(Product product, LocalDate createdOrder, boolean isOrdered) {
        this.product = product;
        this.createdOrder = createdOrder;
        this.isOrdered = isOrdered;
    }

}
