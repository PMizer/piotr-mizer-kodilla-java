package com.kodilla.good.patterns.challenges.food2door.orders;

import com.kodilla.good.patterns.challenges.food2door.data.Product;

import java.util.Map;

public class OrderValidator {

    public static boolean orderValidate(Map<Product, Integer> products, Product product, int quantity) {
        if(products.containsKey(product)) {
            int quantityInShop = products.get(product);
            if (quantityInShop >= quantity) {
                System.out.println("Ordered " + quantity +" "+product.getName());
                return true;
            } else {
                System.out.println("We can't realize order ,In depot we stored only " + quantityInShop);
                return false;
            }
        }else {
            return false;
        }
    }
}
