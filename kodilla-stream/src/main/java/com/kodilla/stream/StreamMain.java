package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.*;


import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);

        Forum forum = new Forum();
        Map<Integer, ForumUser> mapForum = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex()== 'M')
                .filter(forumUser -> LocalDate.now().getYear()- forumUser.getBirthDate().getYear() > 20 )
                .filter(forumUser -> forumUser.getPostQuantity() > 0)
                .collect(Collectors.toMap(ForumUser::getID, forumUser -> forumUser));



        System.out.println("# elements: " + mapForum.size());
        mapForum.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}