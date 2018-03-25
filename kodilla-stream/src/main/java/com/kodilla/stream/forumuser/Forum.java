package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum(){
        userList.add(new ForumUser(1, "Janek Kowalski", 'M', LocalDate.of(1990, 3, 2),0));
        userList.add(new ForumUser(2, "Bartek Kowalski", 'M', LocalDate.of(2013, 3, 2),100));
        userList.add(new ForumUser(3, "Janek Ktos", 'M', LocalDate.of(1990, 3, 2),100));
        userList.add(new ForumUser(4, "Janek Los", 'M', LocalDate.of(2000, 3, 2),100));
        userList.add(new ForumUser(5, "Daria Kowalski", 'F', LocalDate.of(2013, 3, 2),100));
        userList.add(new ForumUser(6, "Anna Was", 'F', LocalDate.of(1990, 3, 2),100));
        userList.add(new ForumUser(7, "Dawid Davidoff", 'M', LocalDate.of(1960, 3, 2),73));

    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(userList);
    }
}
