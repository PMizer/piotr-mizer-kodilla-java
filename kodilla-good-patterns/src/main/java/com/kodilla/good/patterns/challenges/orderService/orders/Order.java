package com.kodilla.good.patterns.challenges.orderService.orders;

import com.kodilla.good.patterns.challenges.orderService.data.Product;
import com.kodilla.good.patterns.challenges.orderService.data.User;

import java.time.LocalDate;

public class Order {
    private int id;
    private LocalDate orderDate;
    private Product product;
    private User user;

    public Order(int id, LocalDate orderDate, Product product, User user) {
        this.id = id;
        this.orderDate = orderDate;
        this.user = user;
        this.product = product;


    }

    public int getId() {
        return id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public Product getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }
}
