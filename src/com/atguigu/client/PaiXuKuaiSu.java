package com.atguigu.client;

public class PaiXuKuaiSu {
    public static void main(String[] args) {
        int[] array = new int[]{2,7,9,12,4,34,3,5};
        int lo = 0;
        int hi = array.length - 1;
        System.out.println(lo + " " + hi);
        PaiXuKuaiSu px = new PaiXuKuaiSu();
        px.sort(array,lo,hi);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public int partition(int[] array, int lo, int hi){
        int key = array[lo];
        while (lo < hi){
            while (array[hi] >= key && hi > lo){
                hi--;
            }
            int temp = array[lo];
            array[lo] = array[hi];
            array[hi] = temp;
            while (array[lo] <= key && hi > lo){
                lo++;
            }
            temp = array[lo];
            array[lo] = array[hi];
            array[hi] = temp;
        }
        return hi;
    }
    public void sort(int[] array, int lo, int hi){
        if(lo >= hi){
            return;
        }
        int index = partition(array,lo,hi);
        sort(array,lo,index-1);
        sort(array,index+1,hi);
    }
}
