package com.atguigu.client;

public class PaiXuXuanZe {
    public static void main(String[] args) {
        int[] arr = new int[]{9,1,5,8,3,7,4,6,2};
        System.out.println("排序前：");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        //方案一：
       /* for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }*/

        //方案二：优化后，把交换的次数减少
        int i,j,min;
        for (i = 0; i < arr.length-1; i++) {
            min = i;
            for (j = i + 1; j <= arr.length-1; j++){
                if (arr[min] > arr[j]){
                    min = j;
                }
            }
            if (i != min){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        System.out.println("排序后：");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
    }
}
