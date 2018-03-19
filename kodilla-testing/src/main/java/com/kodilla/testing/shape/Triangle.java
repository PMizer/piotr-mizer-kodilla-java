package com.kodilla.testing.shape;

public class Triangle implements Shape {

    String shapeName;
    Integer field;

    public Triangle(String shapeName, Integer field){
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

        Triangle triangle = (Triangle) o;

        if (shapeName != null ? !shapeName.equals(triangle.shapeName) : triangle.shapeName != null) return false;
        return field != null ? field.equals(triangle.field) : triangle.field == null;
    }

    @Override
    public int hashCode() {
        int result = shapeName != null ? shapeName.hashCode() : 0;
        result = 31 * result + (field != null ? field.hashCode() : 0);
        return result;
    }
}

