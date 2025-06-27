package com.aledepetris.leetcode.daily.challenge;

import java.util.LinkedList;
import java.util.Queue;

public class LongestSubsequenceRepeatedKTimes {

    public String longestSubsequenceRepeatedK(String s, int k) {
        String r="";
        Queue<String> q=new LinkedList<>();
        q.add("");
        while(!q.isEmpty()) {
            String c=q.poll();
            for(char ch='a';ch<='z';ch++) {
                String n=c+ch;
                if(isK(n,s,k)) {
                    r=n;
                    q.add(n);
                }
            }
        }
        return r;
    }

    private boolean isK(String s,String t,int k) {
        int c=0;
        int i=0;
        for(char ch:t.toCharArray()) {
            if(ch==s.charAt(i)) {
                if(++i==s.length()) {
                    i=0;
                    if(++c==k) return true;
                }
            }
        }
        return false;
    }

}
