package com.atguigu.client;


public class HelloWorld {
    /**
     * @param args
     * @author Natalie
     * @version 1.0
     */

    
    public static void main(String[] args) {
        //System.out.println("HelloWorld!");
        /*List<String> list = new ArrayList<>();
        String s = new String();
        System.out.println("args = [" + args + "]");
        System.out.println("s = " + s);
        System.err.println("");
        System.out.printf("");
        System.out.println("HelloWorld.main");
        boolean a = true;
        boolean b = false;
        System.out.println(a ^ b);
        int i1 = 31;
        System.out.println(i1 >> 2);
        System.out.println(i1 >>> 2);
        int i2 = -31;
        System.out.println(i2 >> 2);
        System.out.println(i2 >>> 2);*/
       /* Scanner sca = new Scanner(System.in);
        System.out.println("请依次输入三个数：");
        int num1 = sca.nextInt();
        int num2 = sca.nextInt();
        int num3 = sca.nextInt();
        System.out.println(num1+","+num2+","+num3);*/
       /* if(num1 > num2){
            num1 = num1 ^ num2;
            num2 = num1 ^ num2;
            num1 = num1 ^ num2;
        }
        if (num1 > num3){
            System.out.println("排序后的结果为："+num3+","+num1+","+num2);
        }else{
            if(num2 > num3){
                System.out.println("排序后的结果为："+num1+","+num3+","+num2);
            }else{
                System.out.println("排序后的结果为："+num1+","+num2+","+num3);
            }
        }*/
       /*if(num1 > num2){
           if(num3 > num1){
               System.out.println("排序后的结果为："+num2+","+num1+","+num3);
           }else if (num3 < num2){
               System.out.println("排序后的结果为："+num3+","+num2+","+num1);
           }else{
               System.out.println("排序后的结果为："+num2+","+num3+","+num1);
           }
       }else {
           if(num3 > num2){
               System.out.println("排序后的结果为："+num1+","+num2+","+num3);
           }else if (num3 < num1){
               System.out.println("排序后的结果为："+num3+","+num1+","+num2);
           }else{
               System.out.println("排序后的结果为："+num1+","+num3+","+num2);
           }
       }*/
     /*  int score = 59;
       switch (score/10){
           case 9:
           case 8:
           case 7:
           case 6:
               System.out.println("你的成绩合格！");
               break;
           default:
               System.out.println("你的成绩不合格！");
               break;
       }*/
        //从键盘输入一个月份和日，输出该日期在当年是第几天
        /*Scanner sca = new Scanner(System.in);
        System.out.println("请输入一个月份：");
        int month = sca.nextInt();
        System.out.println("请输入一个日期：");
        int day = sca.nextInt();
        int sum = 0;
        switch (month){
            case 3:
                sum += 28;
            case 2:
                sum += 31;
            case 1:
                sum += day;
                break;
            default:
                System.out.println("请输入正确的月份！");
        }
        System.out.println(sum);*/
        
        /*System.out.println('*'+'\t'+'*');*/
        /*System.out.println(4>=3);*/
        /*for (int i = 0; i < 4; i++) {
            System.out.print(i+1+","); 
        }*/
       /* int j = 1;
        for (System.out.print("a"),j=2; j<4; System.out.print("b"),j++) {
            System.out.print("c");
        }*/
      /*  int sum = 0;
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);*/
        /*for (int i = 1; i <= 150; i++) {
            System.out.print(i+" ");
            if (i % 3 == 0){
                System.out.print("foo ");
            }
            if(i % 5 == 0){
                System.out.print("biz ");
            }
            if (i % 7 == 0){
                System.out.print("baz ");
            }
            System.out.println();
        }*/
        System.out.println("****************");
        //输出所有的水仙花数，指一个3位数，其各个位上数字立方和等于其本身。
       /* int counts = 0;
        for (int i = 100; i < 1000; i++) {
            int baiW = i / 100;
            int shiW = i % 100 / 10;
            int geW = i % 100 % 10;
            if (baiW * baiW * baiW + shiW * shiW * shiW + geW * geW * geW == i){
                System.out.println(i);
                counts++;
            }
        }
        System.out.println(counts);*/
        //从键盘读入个数不确定的整数，并判断读入的整数和负数的个数，输入为0时结束程序。
       /* Scanner s = new Scanner(System.in);
        int posNum = 0;
        int negNum = 0;
        for(;;){
            System.out.print("请输入一个数：");
            int num = s.nextInt();
            if(num > 0){
                posNum++;
            }else if (num < 0){
                negNum++;
            }else{
                break;
            }
        }
        System.out.println("正数的个数为："+posNum+",负数的个数为："+negNum);*/

       /* for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i+1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 4-i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/
        //打印出100以内的所有质数
        /*boolean flag = false;
        long start = System.currentTimeMillis();
        for (int i = 2; i < 100000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    flag = true;
                }
            }
            if (flag == false){
                System.out.println("该数是质数："+i);
            }
            flag = false;
        }
        long end = System.currentTimeMillis();
        System.out.println((int) (end - start));*/

        //break和continue的区别
        /*label:for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j % 4 == 0){
                    //break;
                    //continue;
                    //break label;
                    continue label;
                }
                System.out.print(j);
            }
            System.out.println("haha");
        }*/
        //3000米长的绳子，每天减一半，问多少天这个绳子会＜5米？不考虑小数
       /* int day = 0;
        for (int i = 3000; i >= 5; day++) {
            i /= 2;
        }
        System.out.println(day);*/
       /*int n = 123456;
       int res = 0;
       while (n > 0){
           res = res * 10;
           int yushu = n % 10;
           res = res + yushu;
           n = n / 10;
       }
        System.out.println(res);*/

      /* String[] str = new String[4];
       str[3] = new String("AA");
       System.out.println(str[3].toString());*/

     /* int[] arr = new int[]{1,2,3,4};
      int[] arr1;
      arr1 = arr;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
      arr1[0] = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
*/
     /*HelloWorld hw = new HelloWorld();
     Circle c = new Circle();
     hw.printAreas(c,5);*/

    /* HelloWorld hw = new HelloWorld();
     hw.sayHello("张三", "李四", "王五");
     System.out.println();
     System.out.println("===========");
     hw.sayHello(2, new String[]{"张三", "李四", "王五"});*/

    /*HelloWorld hw = new HelloWorld();
    hw.first();*/
/*
    int a = 12345;
    int b = 0;
    while (a > 0){
        int yushu = a % 10;
        b = b * 10 + yushu;
        a /= 10;
    }
        System.out.println(b);*/

//模板之循环遍历
      /*  String[] str = {"张三","李四","王五"};
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
        }
        for (String s : str) {
            System.out.print(s);
        }
        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            System.out.print(s);
        }*/

//模板之集合遍历
        /*ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {
            
        }*/



    }//主方法main结尾

    /*public void first(){
        int i = 5;
        Value v = new Value();
        v.i = 25;
        second(v,i);
        System.out.println(v.i);
    }
    public void second(Value v, int i){
        i = 0;
        v.i = 20;
        Value val = new Value();
        v = val;
        System.out.println(v.i + " " + i);
    }
*/
    /*public void sayHello(int j, String[] args) {
        System.out.println(j);
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }

    public void sayHello(String... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }*/

    /*public void  printAreas(Circle c, int time){
        System.out.println("Radius"+"\t\t"+"Area");
        double i;
        for (i = 1; i <= time; i++) {
            c.radius = i;
            System.out.println(i+"\t\t"+c.findArea());
        }
        System.out.println("运行完之后i的值为："+i);
    }*/

}//主类结尾

/*class Value{
    int i = 15;
}*/
/*class Circle{
    double radius;
    public double findArea(){
        return Math.PI * radius * radius;
    }
}*/

