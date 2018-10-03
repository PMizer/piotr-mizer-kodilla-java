package com.kodilla.good.patterns.challenges.food2door.shops;

import com.kodilla.good.patterns.challenges.food2door.data.Product;
import com.kodilla.good.patterns.challenges.food2door.orders.OrderValidator;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements FoodManufacturer{
    private String shopName = "Extra Food Shop";
    private OrderValidator orderValidator;
    private Map<Product, Integer> products = new HashMap<>();

    public ExtraFoodShop(){
        products.put(new Product("extra chicken", 6), 5);
        products.put(new Product("rice", 2), 7);

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

