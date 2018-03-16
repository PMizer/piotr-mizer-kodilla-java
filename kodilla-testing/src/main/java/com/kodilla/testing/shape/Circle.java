package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    String shapeName;
    Integer field;

    public Circle(String shapeName, Integer field){
        this.shapeName = shapeName;
        this.field = field;
    }

    public String getShapeName(){
        return shapeName;
    }
    public Integer getField(){
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (shapeName != null ? !shapeName.equals(circle.shapeName) : circle.shapeName != null) return false;
        return field != null ? field.equals(circle.field) : circle.field == null;
    }

    @Override
    public int hashCode() {
        int result = shapeName != null ? shapeName.hashCode() : 0;
        result = 31 * result + (field != null ? field.hashCode() : 0);
        return result;
    }
}
