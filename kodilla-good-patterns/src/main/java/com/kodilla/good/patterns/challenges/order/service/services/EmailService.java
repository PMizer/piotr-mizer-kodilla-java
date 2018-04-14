package com.kodilla.good.patterns.challenges.order.service.services;

import com.kodilla.good.patterns.challenges.order.service.data.User;

public class EmailService implements InformationService {
    @Override
    public void information(User user) {
        System.out.println("Wysylam wiadomosc do uzytkownika " + user.getUserName());

    }
}
