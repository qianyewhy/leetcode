package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/3/24.
 * 题目描述：一个二维数组，每一行从左到右递增，每一列从上到下递增.输 入一个二维数组和一个整数，判断数组中是否含有整数。
 * 思路：最傻的办法---二重循环
 * 优化：选定右上角的数，值相等就返回true，比它大，行++；比它小，列--；
 *
 */
public class Find2Array {
    public static boolean find(int[][] a, int t){
       for (int i=0;i<a.length;i++){
           if (t<a[0][0]||t>a[a.length-1][a[a.length-1].length-1]){
               return false;
           }
           for (int j=0;j<a[i].length;j++) {
               if (t==a[i][j]){
                   return true;
               }
           }
       }
        return false;
    }


    //优化
    public static boolean findbetter(int[][] a,int t){
        int c=a[0].length-1;
        int r=0;
        if (a==null){
            return false;
        }
        while (r<a.length&&c>=0){
            if (a[r][c]==t){
                return true;
            }
            if (a[r][c]<t){
                r++;
            }else {
                c--;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[][] testarray=new int[4][4];
        testarray[0][0]=1;
        testarray[0][1]=2;
        testarray[0][2]=8;
        testarray[0][3]=9;
        testarray[1][0]=2;
        testarray[1][1]=4;
        testarray[1][2]=9;
        testarray[1][3]=12;
        testarray[2][0]=4;
        testarray[2][1]=7;
        testarray[2][2]=10;
        testarray[2][3]=13;
        testarray[3][0]=6;
        testarray[3][1]=8;
        testarray[3][2]=11;
        testarray[3][3]=15;
        System.out.println(find(testarray, 20));
        System.out.println(findbetter(testarray, 3));
    }
}
