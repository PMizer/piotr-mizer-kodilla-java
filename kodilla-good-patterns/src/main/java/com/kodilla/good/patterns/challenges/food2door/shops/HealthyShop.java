package com.kodilla.good.patterns.challenges.food2door.shops;


import com.kodilla.good.patterns.challenges.food2door.data.Product;
import com.kodilla.good.patterns.challenges.food2door.orders.OrderValidator;

import java.util.*;

public class HealthyShop implements FoodManufacturer {
    private String shopName = "HealthyShop";
    private OrderValidator orderValidator;
    private Map<Product, Integer> products = new HashMap<>();

    public HealthyShop(){
        products.put(new Product("lemon", 2), 5);
        products.put(new Product("apple", 5), 7);

    }

    @Override
    public boolean process(Product product, int quantity) {
        boolean result = orderValidator.orderValidate(products,product, quantity);
        if (result) {
            updateStore(product, quantity);
            System.out.println("Now left : " + products.get(product) + " " + product.getName() + " in shop");
        }
        return result;

    }

    private void updateStore(Product product, int quantity) {
        this.products.put(product, products.get(product) - quantity);
    }

    public String getShopName() {
        return shopName;
    }
}
