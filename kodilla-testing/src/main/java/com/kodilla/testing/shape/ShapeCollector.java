package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    public ArrayList<Shape> shapeList = new ArrayList<Shape>();
    Shape shape;

    public void addFigure(Shape shape){
        shapeList.add(shape);

    }

    public boolean removeFigure(Shape shape){
        boolean result = false;

        if (shapeList.contains(shape)){
            shapeList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        Shape get = shapeList.get(n);
        return get;
    }

    public void showFigures(){

        for(Shape temp : shapeList){
            System.out.println("Figura to " +temp.getShapeName()+" o polu "+temp.getField());
        }

    }



}
