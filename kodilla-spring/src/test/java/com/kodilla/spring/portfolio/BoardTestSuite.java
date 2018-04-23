package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        board.getToDoList().addTask("To do task");
        board.getInProgressList().addTask("Task in progress");
        board.getDoneList().addTask("Done task");
        //When
        String toDoListTest = board.getToDoList().getTasks().get(0);
        String InProgressListTest = board.getInProgressList().getTasks().get(0);
        String doneListTest = board.getDoneList().getTasks().get(0);
        //Then
        Assert.assertEquals("To do task",toDoListTest);
        Assert.assertEquals("Task in progress",InProgressListTest);
        Assert.assertEquals("Done task",doneListTest);
    }
}