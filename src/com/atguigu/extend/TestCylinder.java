package com.atguigu.extend;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder();
        System.out.println(cyl.findVolume());
        cyl.setLength(3.0);
        cyl.setRadius(2.0);
        double vol = cyl.findVolume();
        System.out.println(vol);
        cyl.info1();
    }
}
