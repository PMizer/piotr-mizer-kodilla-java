package com.kodilla.good.patterns.challenges.food2door.orders;


import java.time.LocalDate;

public class OrderProcessor {
    public OrderDto orderExecutor(OrderRequester orderRequest){
        System.out.println("Executing order from "+orderRequest.getFoodManufacturer().getShopName());
        if( orderRequest.getFoodManufacturer().process(orderRequest.getProduct(), orderRequest.getQuantity())){
            System.out.println("Requst valid ordering");
            return new OrderDto(orderRequest.getProduct(), LocalDate.now(),true);
        }else {
            System.out.println("Request not valid");
            return new OrderDto(orderRequest.getProduct(), LocalDate.now(),false);
        }
    }
}
