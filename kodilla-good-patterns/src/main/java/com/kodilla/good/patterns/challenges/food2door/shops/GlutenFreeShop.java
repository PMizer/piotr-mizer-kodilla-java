package com.kodilla.good.patterns.challenges.food2door.shops;

import com.kodilla.good.patterns.challenges.food2door.data.Product;
import com.kodilla.good.patterns.challenges.food2door.orders.OrderValidator;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements FoodManufacturer {
    private String shopName = "Gluten Free Shop";
    private OrderValidator orderValidator;
    private Map<Product, Integer> products = new HashMap<>();

    public GlutenFreeShop(){
        products.put(new Product("glutten free bread", 30), 0);
        products.put(new Product("shrimp", 5), 7);

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
        return shopName ;
    }
}


