package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(final String taskClass){
        switch  (taskClass){
            case SHOPPING:
                return new ShoppingTask("groceries","pizza",1);
            case PAINTING:
                return new PaintingTask("painting", "red", "home");
            case DRIVING:
                return  new DrivingTask("driving","Houston","bus");
            default:
                return null;
        }

    }

}
