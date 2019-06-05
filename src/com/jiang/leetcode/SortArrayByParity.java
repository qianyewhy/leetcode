package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/6/2.
 */
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int max=A.length-1;
        int temp;
        for (int i=0;i<A.length;i++){
            if (i>=max){
                return A;
            }
            if (A[i]%2==1&&A[max]%2==0){
                temp=A[max];
                A[max]=A[i];
                A[i]=temp;
                max--;
            }else if (A[i]%2==1&&A[max]%2==1){
                max--;
                i--;
            }
        }
        return A;
    }
    public int[] sortArrayByParity1(int[] A){
        int index=0;
        for (int i=0;i<A.length;i++){
            if (A[i]%2==0){
                int t=A[i];
                A[i]=A[index];
                A[index]=t;
                index++;
            }
        }
        return A;
    }


    public static void main(String[] args) {
        SortArrayByParity s=new SortArrayByParity();
        int[] A={3,1,2,4,5,7,9};
        int[] temp=s.sortArrayByParity1(A);
        for (int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
    }
}
