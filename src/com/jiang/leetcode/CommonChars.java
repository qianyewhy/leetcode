package com.jiang.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangxin on 2019/6/18.
 * 1002. 查找常用字符
 */
public class CommonChars {
    public List<String> commonChars(String[] A) {
         List<String> result=new ArrayList<String>();

        for (int i=0;i<A[0].length();i++){
            int count=0;
            for (int j=1;j<A.length;j++){
                if (A[j].indexOf(A[0].charAt(i))==-1){
                    break;
                }
                count++;
            }
            if (count==A.length-1){
                result.add(String.valueOf(A[0].charAt(i)));
                for (int t=1;t<A.length;t++){
                    String a=String.valueOf(A[0].charAt(i));
                    System.out.println(a);
                    A[t].replaceFirst(a,".");

                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        CommonChars c=new CommonChars();
        String[] A={"cool","lock","cook"};
        List temp=c.commonChars(A);
        System.out.println(temp.toString());
    }
}
