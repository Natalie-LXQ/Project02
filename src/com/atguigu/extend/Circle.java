package com.atguigu.extend;

public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double findArea(){
        return this.radius * this.radius * Math.PI;
    }
    private void info(){
        System.out.println("我是一个圆");
    }
    public void info1(){
        this.info();
        System.out.println("它是一个圆柱");
    }
}
