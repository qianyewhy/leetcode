package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/4/22.
 * 快排思路：
 *第一趟排序先从右往左遍历，比基准值大，右指针就往左移动，直到找到比基准值小的，然后直接赋值给左指针
 * 然后再从左往右遍历，比基准值小，左指针就往右移动，直到找到比基准值大的，然后和赋值给右指针
 * 一直循环，直到左指针大于等于右指针，把基准值赋值给左指针（其实这一步放在上面也可以
 */
public class QuickSort {
    //选取数据第一位为基准值，第一次排序，找到基准值的索引，然后返回
    public  int partition(int[] array, int low, int high){
        int key=array[low];

        while (low<high){
            while (low<high&&array[high]>=key){
                high--;
            }
            array[low]=array[high];
            while (low<high&&array[low]<=key){
                low++;
            }
            array[high]=array[low];
            array[low]=key;
        }
//        array[low]=key;
        return low;
    }
    //递归排序，基准值左右两边分别进行排序
    public int[] sort(int[] array, int low, int high){
        //这个是递归跳出的条件，不写这个，会造成死循环
        if (low>=high){
            return null;
        }
        int mid = partition(array,low,high);
        sort(array,low,mid-1);
        sort(array,mid+1,high);
        return array;
    }

    public static void main(String[] args) {
        QuickSort q = new QuickSort();
        int[] array={3,4,7,9,2,5};
        int[] temp;
        temp=q.sort(array,0,array.length-1);

        for (int i:temp){
            System.out.println(i);
        }
    }

}
