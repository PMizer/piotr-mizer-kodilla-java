package com.kodilla.good.patterns.challenges.food2door.orders;

import com.kodilla.good.patterns.challenges.food2door.shops.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.food2door.shops.HealthyShop;
import com.kodilla.good.patterns.challenges.food2door.data.Product;

import java.util.LinkedList;
import java.util.List;

public class OrderRetriever {
    public List<OrderRequester> retrieve() {
        List<OrderRequester> requests = new LinkedList<>();
        HealthyShop healthy = new HealthyShop();
        GlutenFreeShop glutenFree = new GlutenFreeShop();

        requests.add(new OrderRequester(healthy, new Product("lemon", 2), 1));
        requests.add(new OrderRequester(healthy, new Product("apple", 11), 1));
        requests.add(new OrderRequester(glutenFree, new Product("glutten free bread", 30), 1));
        return requests;
    }
}