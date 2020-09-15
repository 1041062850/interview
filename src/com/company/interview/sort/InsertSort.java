package com.company.interview.sort;

/**
 * 插入排序（稳定）
 * 描述：将一个数据插入到已排序的数据中，适用于少量数据的排序O(n^2)
 * 步骤：
 * 1、for循环需要排序的趟数
 *      while 找到合适的插入位置
 * @Description TODO
 * @Author 计算机171 戴启东
 * @Date 2020/9/9 9:03
 */
public class InsertSort {
    public static void sort(int[] arrays){
        //临时变量
        int temp;

        //外层循环  第一位已经是有序的
        for(int i = 1; i< arrays.length; i++){
            //将需要比较的那一位 放在temp中
            temp = arrays[i];

            while(arrays[i-1] > temp){
                //如果
                arrays[i] = arrays[i-1];
                i--;
            }
            //若都满足即可
            arrays[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arrays = {1,2,3,9,8,7,5,6};
        sort(arrays);
    }
}
