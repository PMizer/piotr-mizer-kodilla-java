package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.createTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertFalse(shopping.isTaskExecuted());
        shopping.executeTask();
        Assert.assertTrue(shopping.isTaskExecuted());
        Assert.assertEquals("groceries", shopping.getTaskName());
    }

    @Test
    public void testFactoryPainting(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.createTask(TaskFactory.PAINTING);
        //Then
        Assert.assertFalse(painting.isTaskExecuted());
        painting.executeTask();
        Assert.assertTrue(painting.isTaskExecuted());
        Assert.assertEquals("painting", painting.getTaskName());
    }

    @Test
    public void testFactoryDriving(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.createTask(TaskFactory.DRIVING);
        //Then
        Assert.assertFalse(driving.isTaskExecuted());
        driving.executeTask();
        Assert.assertTrue(driving.isTaskExecuted());
        Assert.assertEquals("driving", driving.getTaskName());
    }
}
