package com.kodilla.good.patterns.challenges.order.service.orders;


import com.kodilla.good.patterns.challenges.order.service.data.Product;
import com.kodilla.good.patterns.challenges.order.service.data.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrdersDatabase {

    public List<Order> create(){
        List<Order> sampleOrders = new ArrayList<>();;
        Product product = new Product(1, "CosDrogiego",10.50);
        User user = new User(1,"janex", "Jan", "Kowalski");
        sampleOrders.add(new Order(1,LocalDate.of(2018,10,20), product, user ));


        Product product1 = new Product(2, "CosTansze",1.50);
        User user1 = new User(2,"Adrianex", "Adrian", "Nowak");
        sampleOrders.add(new Order(2,LocalDate.of(2018,12,20), product1, user1 ));

        return sampleOrders;
    }
}
