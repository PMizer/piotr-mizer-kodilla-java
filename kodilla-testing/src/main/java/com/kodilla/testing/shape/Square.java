package com.kodilla.testing.shape;

public class Square implements Shape {
    String shapeName;
    Integer field;

    public Square(String shapeName, Integer field){
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

        Square square = (Square) o;

        if (shapeName != null ? !shapeName.equals(square.shapeName) : square.shapeName != null) return false;
        return field != null ? field.equals(square.field) : square.field == null;
    }

    @Override
    public int hashCode() {
        int result = shapeName != null ? shapeName.hashCode() : 0;
        result = 31 * result + (field != null ? field.hashCode() : 0);
        return result;
    }
}

