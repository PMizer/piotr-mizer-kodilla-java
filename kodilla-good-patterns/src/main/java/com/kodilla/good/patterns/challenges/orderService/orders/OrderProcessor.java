package com.kodilla.good.patterns.challenges.orderService.orders;


import com.kodilla.good.patterns.challenges.orderService.services.InformationService;
import com.kodilla.good.patterns.challenges.orderService.services.OrderRepository;
import com.kodilla.good.patterns.challenges.orderService.services.OrderService;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                           final OrderService orderService,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final Order order) {


        if(orderService.orderState(order)){
            informationService.information(order.getUser());
            orderRepository.saveToRepo(order);
            return new OrderDto(order, true);
        }

        else{
            System.out.println("Blad w zamowieniu, odrzucam");
            return new OrderDto(order, false);
            }

    }
}
