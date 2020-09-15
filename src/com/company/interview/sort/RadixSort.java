package com.company.interview.sort;

/**
 * 基数排序(稳定性)
 * 描述：将数组中的每一位都放进桶子里，个十百千万，并回收，循环下去。
 * 注意：负数和零的不在内
 * 步骤：
 * 1、求出数组中最大值
 * 2、基数排序
 *
 * @Description TODO
 * @Author 计算机171 戴启东
 * @Date 2020/9/11 9:05
 */
public class RadixSort {
    //先找出最大的值，确定最高位
    public static int findMax(int[] arrays, int L, int R){
        if(L == R){
            return arrays[L];
        }else{
            int a = arrays[L];
            int b = findMax(arrays,L+1,R);

            if(a > b){
                return a;
            }else{
                return b;
            }
        }

    }

    //基数排序
    public static void sort(int[] arrays){
        int max = findMax(arrays,0,arrays.length-1);

        for(int i = 1; max/i > 0; i *= 10){
            int[][] buckets = new int[arrays.length][10];

            //获取每一位数字（个、十、百、千、万分配到桶子里）
            for(int j = 0; j < arrays.length; j++){

                int num = (arrays[j]/i) % 10;

                buckets[j][num] = arrays[j];
            }

            //回收桶子里的元素
            int k = 0;

            //有十个桶子
            for(int j = 0; j < 10; j++){
                for(int l = 0; l < arrays.length; l++){
                    if(buckets[l][j] != 0){
                        arrays[k++] = buckets[l][j];
                    }
                }

            }
        }
    }

    public static void main(String[] args) {
        int[] arrays = {1,2,3,9,8,7,5,6,12};
        System.out.println("排序前:");
        for (int i:arrays
        ) {
            System.out.print(i);
        }
        sort(arrays);
        System.out.println("\n排序后:");
        for (int i:arrays
        ) {
            System.out.print(i);
        }
    }


}
