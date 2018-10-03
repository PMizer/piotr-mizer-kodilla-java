package com.kodilla.good.patterns.challenges.food2door.shops;

import com.kodilla.good.patterns.challenges.food2door.data.Product;

public interface FoodManufacturer {
    public boolean process(Product product, int quantity);
    public String getShopName();
}
