package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;
    private boolean isTaskExecuted = false;

    public ShoppingTask(final String taskName,final String whatToBuy,final double quantity){
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }
    @Override
    public void executeTask(){
        System.out.println("Executing "+taskName+" buying "+quantity+" of "+whatToBuy);
        isTaskExecuted = true;
    }

    @Override
    public String getTaskName(){
        return taskName;
    }

    @Override
    public boolean isTaskExecuted(){
        return isTaskExecuted;
    }
}
