package com.atguigu.client;

import java.util.SortedSet;
import java.util.TreeSet;

public class Niuke {
    public static void main(String[] args) {
       /* int j = 0;
        for (int i = 0; i < 256; i++) {
            j = i * i;
            String str = String.valueOf(j);
            int len = str.length();
            boolean flag = true;
            for (int k = 0; k < len/2; k++) {
                char start = str.charAt(k);
                char end = str.charAt(len - k - 1);
                if (start != end){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(i);
            }
        }*/
       //某人有8 角的邮票5 张，1 元的邮票4 张，1 元8 角的邮票6 张，用这些邮票中的一张或若干张可以得到多少中不同的邮资？
        SortedSet<Integer> set = new TreeSet<>();
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <=4 ; j++) {
                for (int k = 0; k <= 6; k++) {
                    int d = 8 * i + 10 * j + 18 * k;
                    set.add(d);
                }
            }
        }
        System.out.println(set.size()-1);
        System.out.println(set);
        /*for (int i = 0; i < set.size(); i++) {
            System.out.print(set);
        }*/
    }
}
