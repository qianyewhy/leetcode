package com.jiang.leetcode;
import java.util.*;

/**
 * Created by jiangxin on 2019/5/19.
 * 题目：
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。

 push(x) -- 将元素 x 推入栈中。
 pop() -- 删除栈顶的元素。
 top() -- 获取栈顶元素。
 getMin() -- 检索栈中的最小元素。
 *
 * 思路：
 * 常数级时间，也就是每次使用一个方法时不要遍历栈，否则就是o(N)级时间了（线性,倾斜直线），top（），pop（），push（）操作本身就是常数级操作，所以这里只考虑找出最小值，
 * 具体方法为，使用一个栈（最小栈）（数组实现，访问栈顶常数级时间o(N)）来累加最小值，这样最小栈的栈顶到栈首是最小值累加的集合。
 *
 *
 */
public class MinStack {
    List<Integer> stack=new ArrayList<Integer>();
    List<Integer> min=new ArrayList<Integer>();

    /** initialize your data structure here. */
    public MinStack() {
    }

    public void push(int x) {
        stack.add(x);
        if (min.size()==0){
            min.add(x);
        }else {
            if (min.get(min.size()-1)>=x){
                min.add(x);
            }

        }
    }

    public void pop() {
        if (!isempty()){
            int temp=stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            if (temp==min.get(min.size()-1)){
                min.remove(min.size()-1);
            }
        }
    }

    public int top() {
        if (isempty()){
            return -1;
        }
        return stack.get(stack.size()-1);
    }

    public int getMin() {
        if (min.size()==0){
            return -1;
        }
        return min.get(min.size()-1);
    }

    public boolean isempty(){
        if (stack.size()==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);
        System.out.println(minStack.top());
       // System.out.println( minStack.getMin());
        minStack.pop();
       // System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.push(2147483647);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.push(-2147483648);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }
}

