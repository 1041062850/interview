package com.company.interview.topic;
/**
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 */

import java.util.*;
public class Main2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[10];
        while(a != 0){
            int t = a % 10;
            a /= 10;
            if(arr[t] != 1){
                arr[t] = 1;
                sb.append(t);
            }

        }
        System.out.println(sb);
    }
}

