package com.kodilla.good.patterns.challenges.food2door.orders;

import com.kodilla.good.patterns.challenges.food2door.shops.FoodManufacturer;
import com.kodilla.good.patterns.challenges.food2door.data.Product;

public class OrderRequester {
    private FoodManufacturer foodManufacturer;
    private Product product;
    private int quantity ;

    public OrderRequester(FoodManufacturer foodManufacturer, Product product, int quantity) {
        this.foodManufacturer = foodManufacturer;
        this.product = product;
        this.quantity = quantity;
    }

    public FoodManufacturer getFoodManufacturer() {
        return foodManufacturer;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
