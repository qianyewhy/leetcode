package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/5/5.
 * 题目： 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 * 思路：
 * 1、双重循环，时间复杂度高
 * 2、利用indexOf方法，查看字符串中是否包含某个字符，如果包含该字符就返回第一次出现的索引，不包含返回-1
 */
public class NumJewelsInStones {
    public int numJewelsInStones(String J, String S) {
        int count=0;
        for (int i=0;i<J.length();i++){
            for (int j=0;j<S.length();j++){
                if (J.charAt(i)==S.charAt(j)){
                    count++;
                }
            }
        }

        return count;

    }


    public int numJewelsInStones1(String J, String S){
        int count1=0;
        for (int i=0;i<S.length();i++){
            if (J.indexOf(S.charAt(i))!=-1){
                count1++;
            }
        }
        return count1;
    }

    public static void main(String[] args) {
        NumJewelsInStones n=new NumJewelsInStones();
        String J="A";
        String S="aAAbbbb";
        int count=n.numJewelsInStones(J,S);
        int count1=n.numJewelsInStones1(J,S);
        System.out.println(count);
        System.out.println(count1);

    }
}
