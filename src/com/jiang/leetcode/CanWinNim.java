package com.jiang.leetcode;

/**
 * Created by jiangxin on 2019/5/15.
 * 题目：
 * 你和你的朋友，两个人一起玩 Nim 游戏：桌子上有一堆石头，每次你们轮流拿掉 1 - 3 块石头。 拿掉最后一块石头的人就是获胜者。你作为先手。

 你们是聪明人，每一步都是最优解。 编写一个函数，来判断你是否可以在给定石头数量的情况下赢得游戏。

 示例:

 输入: 4
 输出: false
 解释: 如果堆中有 4 块石头，那么你永远不会赢得比赛；
 因为无论你拿走 1 块、2 块 还是 3 块石头，最后一块石头总是会被你的朋友拿走。
 *
 *
 * 解题思路：
 * 实例是提示，如果给你剩下啦4个石头那么你永远不可能赢，所以如果要保持必赢，就要把最后这四块石头的选择权推给对方
 * 因为题目说每个人可以拿1-3块，作为先手，只要第一次拿走整除4的余数，这样剩下的石头的个数就是4的倍数，然后接下来的轮次，对方拿走几块，只要保持自己和对方的加和等于4
 * 就一定能保证，给对方剩最后4块石头，这样，自己就能必赢啦
 */
public class CanWinNim {
    public boolean canWinNim(int n) {
        if (n%4==0){
            return false;
        }else {
            return true;
        }
    }

    public boolean canWinNim1(int n) {
        return n%4!=0;
    }

    public static void main(String[] args) {
        CanWinNim c=new CanWinNim();
        int n=9;
        System.out.println(c.canWinNim(n));
    }
}
