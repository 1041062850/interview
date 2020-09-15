package com.company.interview.sort;

/**
 * 快速排序（不稳定）
 * 步骤：
 * 1、首先找一个支点，
 * 2、while循环后第一轮排序后让支点左边的数据都小于支点，支点右边的数据都大于支点。
 *       用if判断是否为一个数的时候，左右分别进行递归。
 * @Description TODO
 * @Author 计算机171 戴启东
 * @Date 2020/9/9 14:45
 */
public class QuickSort {
    public static void sort(int[] arrays,int L, int R){
        //游标
        int i = L;

        int j = R;

        //支点的选取
        int pivot = arrays[(L + R) / 2];

        //左右两端同时扫描
        while(i <= j){

            while(arrays[i] < pivot){
                i++;
            }

            while(arrays[j] > pivot){
                j--;
            }

            //找到需要移动的位置
            if(i <= j){
                int temp = arrays[i];
                arrays[i] = arrays[j];
                arrays[j] = temp;
                i++;
                j--;
            }

        }
            if(L < j){
                sort(arrays,L,j);
            }

            if(R > i){
                sort(arrays,i,R);
            }



    }

    public static void main(String[] args) {

        int[] arrays = {1,2,3,9,8,7,5,6};
        System.out.println("排序前:");
        for (int i:arrays
        ) {
            System.out.print(i);
        }
        sort(arrays,0,arrays.length-1);
        System.out.println("\n排序后:");
        for (int i:arrays
        ) {
            System.out.print(i);
        }
    }
}
