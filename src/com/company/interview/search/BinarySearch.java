package com.company.interview.search;

/**
 * 二分查找（折半查找）
 * 有序的
 * @Description TODO
 * @Author 计算机171 戴启东
 * @Date 2020/9/13 18:42
 */
public class BinarySearch {
    public static int binarySearch(int[] arr, int value, int low, int high){
        int mid = low+(high - low)/2;
        if(arr[mid] == value){
            return mid+1;
        }
        else if(arr[mid] > value){
            return binarySearch(arr,value,low,mid-1);
        }
        else{
            return binarySearch(arr,value,mid+1,high);
        }

    }

    public static void main(String[] args) {
        int[] arrays = {1,3,4,5,6,8,9,10,12,14};
        int t = binarySearch(arrays,14,0,arrays.length-1);
        System.out.println(t);
    }
}
