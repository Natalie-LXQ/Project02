package com.atguigu.client;

public class PaiXuChaRu {
    public static void main(String[] args) {
        int[] arr = new int[]{5,0,3,4,6,2};
        System.out.println("排序前：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //假设前i个数已经是有序的了，从i+1个数开始与前面的数进行比较，找到合适的位置插入进去即可
        for (int i = 0; i < arr.length - 1; i++) {
            int comP = arr[i+1];
            int j;
            for (j = i; j >= 0; j--) {
                //当comP＞arr[j]时，说明comP肯定＜arr[j]，否则到不了arr[j]
                if (comP > arr[j]){
                    break;
                }
            }
            //找到i+1插入的位置后，要将插入位置及其以后的数往后挪动一位
            for (int k = i; k > j; k--) {
                arr[k+1] = arr[k];
            }
            arr[j+1] = comP; //将i+1这个比较的数插入到j和j+1之间
        }

        System.out.println("排序后：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
