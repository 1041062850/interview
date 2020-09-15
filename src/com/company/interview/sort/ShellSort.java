package com.company.interview.sort;

import java.util.Arrays;

/**
 * 希尔排序（不稳定）
 * 描述：插入排序的高级版本，减少移动次数
 *增量的概念
 * 步骤：
 * 1、 for循环 设置增量，每一趟都除以2
 *          for循环每分一次组就延续本组的数据往后比较
 *              while循环 比较回原来的数据大小
 * @Description TODO
 * @Author 计算机171 戴启东
 * @Date 2020/9/10 18:19
 */
public class ShellSort {
    public static void sort(int[] arrays){
        //增量每次都 /2
        for(int step = arrays.length/2; step > 0; step/=2){

            //每分一次组就
            for(int i = step; i < arrays.length; i++){

                int j = i;
                //将需要比较的那个放在temp中
                int temp = arrays[j];

                //只有执行while循环后才也会对前面排序过的数进行比较
                while(j - step >= 0 && arrays[j - step] > temp){

                    arrays[j] = arrays[j - step];
                    //延续到序列的开头
                    j = j-step;
                }
                //执行完while 则需要把小的那个替换回低位
                arrays[j] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int []arr = {1,19,6,2,4,7,11,3,10};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
