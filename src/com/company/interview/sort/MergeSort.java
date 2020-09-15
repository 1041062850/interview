package com.company.interview.sort;

/**
 * 归并排序（稳定）
 * 描述：使用分治法，将两个已排好序的数组合并成一个有序的数组原理是使用分治法将大问题分割成一系列小问题进行求解
 * 步骤：
 * 1、拆分
 * 2、合并
 * @Description TODO
 * @Author 计算机171 戴启东
 * @Date 2020/9/9 15:42
 */
public class MergeSort {
    //一、拆分
    public static void sort(int[] arrays,int L, int R){
        if(L == R){
            return;
        }else {
            int M = (L + R) / 2;
            //左边
            sort(arrays, L, M);

            //右边
            sort(arrays, M + 1, R);

            //合并
            merge(arrays, L, M + 1, R);
        }

    }

    //二、合并
    public static void merge(int[] arrays,int L, int M, int R){

        //1.把两个数组分别放出来，并赋值
        int[] leftArray = new int[M-L];

        int[] rightArray = new int[R - M + 1];

        for(int i = L;i < M; i++){
            leftArray[i-L] = arrays[i];
        }
        for(int i = M; i <= R; i++){
            rightArray[i-M] = arrays[i];
        }

        int i = 0, j = 0;
        //2.  k是选取array做左边那个进行存放
        //*****************************************
        int k = L;

        //3.比较两个数组的值，哪个小就往数组上放
        while(i < leftArray.length && j <rightArray.length){
            //谁小就放谁上去
            if(leftArray[i] <= rightArray[j]){
                arrays[k] = leftArray[i];
                i++;
                k++;
            }else{
                arrays[k] = rightArray[j];
                j++;
                k++;
            }
        }

        //4.如果左边的数组还没有比较完，右边比较完了，就将左边数组的剩余数抄到大数组中
        while(i < leftArray.length){
            arrays[k] = leftArray[i];
            i++;
            k++;
        }

        //4.如果右边的数组还没有比较完，左边比较完了，就将右边数组的剩余数抄到大数组中
        while(j < rightArray.length){
            arrays[k] = rightArray[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        int[] arrays = {1,2,3,9,8,7,5,6,12};
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
