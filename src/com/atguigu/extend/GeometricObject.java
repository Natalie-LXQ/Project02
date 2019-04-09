package com.atguigu.extend;

public class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea(){
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GeometricObject)) return false;

        GeometricObject that = (GeometricObject) o;

        if (Double.compare(that.weight, weight) != 0) return false;
        return color != null ? color.equals(that.color) : that.color == null;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + "\'" +
                ", weight=" + weight +
                '}';
    }
}
