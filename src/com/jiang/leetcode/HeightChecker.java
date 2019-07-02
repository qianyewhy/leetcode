package com.jiang.leetcode;

import java.util.Arrays;

/**
 * Created by jiangxin on 2019/6/25.
 * 1051. 高度检查器
 */
public class HeightChecker {
    public int heightChecker(int[] heights) {
        int count=0;
        int[] temp=new int[heights.length];
        //赋值
//        for (int i=0;i<heights.length;i++){
//            temp[i]=heights[i];
//        }
        temp=heights.clone();
        Arrays.sort(heights);
        for (int i=0;i<heights.length;i++){
            if (temp[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        HeightChecker h=new HeightChecker();
        int[] heights={1};
        System.out.println(h.heightChecker(heights));
    }
}
