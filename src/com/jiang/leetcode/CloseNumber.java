package com.jiang.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangxin on 2019/5/21.
 * https://blog.csdn.net/jubaoquan/article/details/80313050
 */
public class CloseNumber {

    public static void main(String[] args) {
        List<Integer> data = new ArrayList<Integer>(){{
            add(1);
            add(2);
//            add(3);
//            add(4);
        }};
        List<List<Integer>> arrangeList = arrangeSelect(data);
        List<List<Integer>> arrangeList1 = arrangeSelect1(data);
        //System.out.println(JSON.toJSONString(arrangeList));
        System.out.println(arrangeList1);
    }

    /**
     * 方法一:无序
     * @param data
     * @param <E>
     * @return
     */
    public  static  <E> List<List<E>> arrangeSelect1(List<E> data ) {
        int nCnt = data.size();
        //int nBit1 = (0xFFFFFFFF >>> (32 - nCnt));
        int nBit = (int) (Math.pow(2, nCnt) - 1);
        List<List<E>> arrangeAllSet = new ArrayList<>();
        for (int i = 1; i <= nBit; i++) {
            List<E> arrangeSet = new ArrayList<>();
            for (int j = 0; j < nCnt; j++) {
                if ((i << (31 - j)) >> 31 == -1) {
                    arrangeSet.add(data.get(j));
                }
            }
            arrangeAllSet.add(arrangeSet);
//            for (int a=0;a<arrangeAllSet.size();a++){
//                for (int b=0;b<arrangeAllSet.get(a).size();b++){
//                    if ()
//                }
//            }
        }
        return arrangeAllSet;
    }

    /**
     * 方法二:有序
     * @param data
     * @param <E>
     * @return
     */
    public static <E> List<List<E>>  arrangeSelect(List<E> data){
        List<List<E>> resultSet = new ArrayList<>();
        for (int i = 0; i < data.size(); i++){
            resultSet = combinerSelect(data, new ArrayList<E>(), data.size(), i + 1, resultSet);
        }
        return resultSet;
    }

    public static <E> List<List<E>> combinerSelect(List<E> data, List<E> workSpace, int n, int k, List<List<E>> resultList) {
        List<E> copyData;
        List<E> copyWorkSpace;
        if(workSpace.size() == k) {
            List<E> everyResultList = new ArrayList<>();
            for(E c : workSpace){
                everyResultList.add(c);
            }
            resultList.add(everyResultList);
        }
        for(int i = 0; i < data.size(); i++) {
            copyData = new ArrayList<>(data);
            copyWorkSpace = new ArrayList<>(workSpace);
            copyWorkSpace.add(copyData.get(i));
            for(int j = i; j >=  0; j--){
                copyData.remove(j);
            }
            combinerSelect(copyData, copyWorkSpace, n, k, resultList);
        }
        return resultList;
    }

}
