package com.atguigu.client;

//第一种：冒泡排序
public class PaiXuMaoPao{
    public static void main(String[] args) {
        int[] str = new int[]{3,8,6,9,3,4,1,18,7};
        //方案一:最原始的冒泡排序算法
      /*  for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < str.length-1; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i] > str[j]) {
                    int temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }*/

        //方案二：
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] +" ");
        }
        System.out.println("");
        for (int i = 0; i < str.length-1; i++) {
            for (int j = 0; j < str.length -1 - i; j++) {
                if (str[j] > str[j+1]){
                    int temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }


        //方案三：改进后的
      /*  for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
        }
        System.out.println("");
        for (int i = 1; i < str.length; i++) {
            for (int j = str.length-1; j >= i ; j--) {
                if (str[j-1] > str[j]){
                    int temp = str[j-1];
                    str[j-1] = str[j];
                    str[j] = temp;
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
        }*/

      //方案四
       /* for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println();
        boolean flag = true;
        for (int i = 0; i < str.length - 1 && flag; i++) {
            flag = false;
            for (int j = str.length - 1; j > i; j--) {
                if (str[j-1] > str[j]){
                    int temp = str[j-1];
                    str[j-1] = str[j];
                    str[j] = temp;
                    flag = true;
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }*/

    }
}
