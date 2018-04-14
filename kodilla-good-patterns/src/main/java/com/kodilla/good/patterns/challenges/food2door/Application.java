package com.kodilla.good.patterns.challenges.food2door;
import com.kodilla.good.patterns.challenges.food2door.orders.OrderProcessor;
import com.kodilla.good.patterns.challenges.food2door.orders.OrderRequester;
import com.kodilla.good.patterns.challenges.food2door.orders.OrderRetriever;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();
        OrderRetriever orderRetriever = new OrderRetriever();
        List<OrderRequester> orderRequests = orderRetriever.retrieve();
        for (OrderRequester orderRequest: orderRequests) {
            orderProcessor.orderExecutor(orderRequest);
        }
    }
}
