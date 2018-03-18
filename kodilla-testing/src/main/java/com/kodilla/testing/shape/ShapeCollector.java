package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapeList = new ArrayList<Shape>();


    public void addFigure(Shape shape){
        shapeList.add(shape);

    }

    public boolean removeFigure(Shape shape){
        return shapeList.remove(shape);
    }

    public Shape getFigure(int n){
        Shape get = shapeList.get(n);
        return get;
    }

    public ArrayList<Shape> getShapeList() {
        return shapeList;
    }

}
