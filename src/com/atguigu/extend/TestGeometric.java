package com.atguigu.extend;

public class TestGeometric {
    public static void main(String[] args) {
        TestGeometric tg = new TestGeometric();
        GeometricObject go = new GeometricObject("red",12);

        System.out.println(go);
        boolean b = tg.equalObj(new Circle1("red",2.0,3.0),
                                new MyRectangle("blue",2.0,3.0,4.0));
        System.out.println(b);

    }
    //判断两个对象的面积是否相等
    public boolean equalObj(GeometricObject go,GeometricObject got){
        if (go.findArea() == got.findArea()){
            return true;
        }else {
            return false;
        }

    }
}

