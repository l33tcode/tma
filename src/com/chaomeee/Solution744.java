package com.chaomeee;

/**
 * Created by tina on 2/10/18.
 * url: https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
 */
public class Solution744 {


    public static char nextGreatestLetter(char[] letters, char target) {
        int lo = 0, hi = letters.length - 1;

        if (letters[hi] <= target) {//如果每个都小，直接取第一个
            return letters[0];
        }

        while (lo + 1 < hi) {//二分法缩小到两个数字
            int mid = lo + (hi - lo) / 2;
            if (letters[mid] <= target) {
                lo = mid;
            } else {
                hi = mid;
            }
        }


        if (letters[lo] > target) {//如果左边的比target大，则是左边的。
            return letters[lo];
        }
        return letters[hi];//不然就是右边的。
    }


    public static void main(String[] args) {
        char[] letters = new char[]{'e', 'e', 'e', 'e', 'e', 'e', 'n', 'n', 'n', 'n'};
        char target = 'e';
        char result = nextGreatestLetter(letters, target);
        System.out.println(result);
    }
}
