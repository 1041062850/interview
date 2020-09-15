package com.company.interview.sort;

/**
 * 选择排序（不稳定）
 * 描述：每一轮选一个最大的(最小的)放到最后(最前)
 * 步骤：
 *  * 1、for（外层循环控制排序的趟数）
 *          新的趟数角坐标清零
 *  *        for(内层循环控找到当前趟数最大的值)
 * @Description TODO
 * @Author 计算机171 戴启东
 * @Date 2020/9/8 22:48
 */
public class SelectionSort {
    public static void sort(int[] arrays){

        //记录当前趟数的坐标
        int pos;

        //中间值
        int temp;

        for(int i = 0; i < arrays.length - 1; i++ ) {
            pos = 0;
            for(int j = 0; j < arrays.length - i; j++){
                if(arrays[j] > arrays[pos]){
                    pos = j;
                }
            }
            //交换
            temp = arrays[pos];
            arrays[pos] = arrays[arrays.length-1-i];
            arrays[arrays.length-1-i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arrays = {1,2,3,9,8,7,5,6};
        sort(arrays);
    }
}
