package com.atguigu.extend;

public class Cylinder extends Circle{
    private double length;
    public Cylinder(){
        this.length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double findVolume(){
        return this.findArea() * this.length;
    }
    private void info(){
        System.out.println("我是一个圆柱");
    }

}
