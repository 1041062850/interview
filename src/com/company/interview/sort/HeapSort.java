package com.company.interview.sort;

import java.util.Arrays;

/**
 * 堆排序（不稳定）
 * 描述：也是选择排序的一种，完全二叉树 自底向上调整堆积树
 * 最大堆：要求节点的元素都要不小于其孩子
 * 最小堆：要求节点元素都不大于左右孩子
 * 第一个非叶子结点 arr.length/2-1
 * 结点的左孩子：2*i+1
 * @Description TODO
 * @Author 计算机171 戴启东
 * @Date 2020/9/9 17:24
 */
public class HeapSort {

    public static void sort(int[] arr){
        //1、构建大根堆（选取第一个非叶子结点进行构建，然后依次往上）最后构建一个满足定义的大根堆
        for(int i = arr.length/2 - 1; i >= 0; i--){
            adjustHeap(arr,i,arr.length);
        }
        System.out.println("第一个大根堆--------------");
        System.out.println(Arrays.toString(arr));
        System.out.println("第一个大根堆--------------");
        //2、调整堆结构
        for(int j = arr.length-1; j > 0; j--){
            //将每一次最大的根节点 放在末尾
            swap(arr,0,j);
            //每处理一个最大的放在数组末尾后，就再一次调整成标准的大根堆
            adjustHeap(arr,0,j);
        }
    }

    /**
     * 调整大根堆
     * @param arr
     * @param i
     * @param length
     */
    public static void adjustHeap(int[] arr, int i, int length){
        //取出当前元素
        int temp = arr[i];
        //找本结点的左右孩子
        for(int k=i*2+1; k<length; k = k*2+1){
            //比较出哪个孩子的值大
            if (k + 1 < length && arr[k] < arr[k+1]){
                k++;
            }
            //若左右孩子大于本结点，则交换
            if(arr[k] > temp){
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
        }
        //最后把本次需要调整的结点放到调整后的位置
        arr[i] = temp;
    }

    /**
     * 交换元素
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(int[] arr,int a ,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {

        int []arr = {1,19,6,2,4,7,11,3,10};
        sort(arr);
        System.out.println(Arrays.toString(arr));


    }

}
