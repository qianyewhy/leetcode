package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/5/12.
 */
public class FlipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i=0;i<A.length;i++){
            int temp=A[i].length;
            for (int j=0;j<temp/2;j++){
                int a=A[i][j];
                A[i][j]=A[i][temp-j-1];
                A[i][temp-j-1]=a;
            }
            for (int b=0;b<temp;b++){
                A[i][b]=A[i][b]^1;
            }
        }

        return A;
    }

    public static void main(String[] args) {
        FlipAndInvertImage f=new FlipAndInvertImage();
        int[][] A={{1,1,0},{1,0,1},{0,0,0}};
        f.flipAndInvertImage(A);
        for (int i=0;i<A.length;i++){
            for (int j=0;j<A[i].length;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}
