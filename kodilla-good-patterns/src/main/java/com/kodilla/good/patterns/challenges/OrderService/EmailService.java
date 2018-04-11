package com.kodilla.good.patterns.challenges.OrderService;

public class EmailService implements InformationService {
    @Override
    public void information(User user) {
        System.out.println("Wysylam wiadomosc do uzytkownika " + user.getUserName());

    }
}
