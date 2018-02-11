package com.chaomeee;

/**
 * Created by tina on 2/10/18.
 * url: https://leetcode.com/problems/reverse-words-in-a-string/description/
 */
public class Solution151 {
    public String reverseWords(String p) {
        if (p == null) return p;
        if (p.trim().length() == 0) return "";
        String[] splitted = p.split(" ");
        for (int i = 0; i < splitted.length / 2; i++) {
            String temp = splitted[i];
            splitted[i] = splitted[splitted.length - i - 1];
            splitted[splitted.length - i - 1] = temp;
        }
        String result = "";
        for (int i = 0; i < splitted.length; i++) {
            if (splitted[i].trim().length() > 0) result = result + " " + splitted[i];

        }
        return result.trim();
    }
}
