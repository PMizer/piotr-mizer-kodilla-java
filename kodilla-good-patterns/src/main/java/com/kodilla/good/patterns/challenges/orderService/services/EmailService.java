package com.kodilla.good.patterns.challenges.orderService.services;

import com.kodilla.good.patterns.challenges.orderService.data.User;

public class EmailService implements InformationService {
    @Override
    public void information(User user) {
        System.out.println("Wysylam wiadomosc do uzytkownika " + user.getUserName());

    }
}
