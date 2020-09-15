package com.company.interview.sort;

/**
 * 冒泡排序（稳定）
 * 描述：像气泡一样把最大的或最小的以相邻两两交换的形式一个个浮出来
 * 稳定的意义：只有当二次排序的时候不破坏原先次序
 * 步骤：
 * 1、for（外层循环控制排序的趟数）
 *        for(内层循环控制比较的次数，并且每趟过后比较次数都减1)
 * sort
 * sort2（优化增加了一个是否对调位置的哨兵变量）
 * @Description TODO
 * @Author 计算机171 戴启东
 * @Date 2020/9/8 16:41
 */
public class BubbleSort {
    public static void sort(int[] arrays){
        //交换变量
        int temp;
        if(arrays == null){
            return;
        }
        long startTime = System.nanoTime();
        //外层比较的趟数
        for(int i = 0; i < arrays.length - 1; i++){
            //内层比较的趟数
            for (int j = 0; j < arrays.length - i-1; j++){
                if(arrays[j] > arrays[j+1]){
                    temp= arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = temp;
                }
            }
        }
        long endTime = System.nanoTime(); //获取结束时间
        System.out.println("所用的时间为："+(endTime-startTime));
    }

    public static void sort2(int[] arrays){

        //交换变量
        int temp;

        //
        int ischange = 0;
        if(arrays == null){
            return;
        }

        long startTime = System.nanoTime();
        //外层比较的趟数
        for(int i = 0; i < arrays.length - 1; i++){
            //内层比较的趟数
            for (int j = 0; j < arrays.length - i-1; j++){
                if(arrays[j] > arrays[j+1]){
                    temp= arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = temp;
                    ischange = 1;
                }
            }
            if(ischange == 0){
                break;
            }
        }
        long endTime = System.nanoTime(); //获取结束时间
        System.out.println("所用的时间为："+(endTime-startTime));
    }

    public static void main(String[] args) {
        int[] arrays = {10,1,2,3,4,5,6,7,8,9};
        sort2(arrays);
        System.out.println("5"+3);
    }

}
