package com.jiang.leetcode;

import java.util.HashMap;

/**
 * Created by jiangxin on 2019/6/2.
 */
public class NumUniqueEmails {
    public int numUniqueEmails(String[] emails) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i=0;i< emails.length ;i++ ) {
            String b = "";
            String a="";
            if (emails[i].indexOf("+")!=-1){
                 a = emails[i].substring(0,emails[i].indexOf("+"));
            }else {
                a=emails[i].substring(0,emails[i].indexOf("@"));
            }
            for (int j=0;j<a.length() ;j++ ) {
                if (emails[i].charAt(j)!='.') {
                    b += emails[i].charAt(j);
                }
            }
            b += emails[i].substring(emails[i].indexOf("@"),emails[i].length()-1);
            if (map.containsValue(b)) {
                continue;
            }
            map.put(i,b);
        }
        return map.size();
    }

    public static void main(String[] args) {
        NumUniqueEmails u=new NumUniqueEmails();
        String[] emails={"testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"};
        int t=u.numUniqueEmails(emails);
        System.out.println(t);

    }
}
