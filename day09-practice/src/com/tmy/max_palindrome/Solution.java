package com.tmy.max_palindrome;

/**
 * 求字符串中 最大回文串的长度
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/17
 */
public class Solution {
    public int longestPalindrome(String s) {
        int max = 0;
        for(int i = 0 ; i < s.length(); i++){
            //是奇数 回文字符串
            int i1 = getMaxLength(s,i,i);
            //是偶数 回文字符串
            int i2 = getMaxLength(s,i,i + 1);
            max = Math.max(max, i1);
            max = Math.max(max, i2);
        }
        return max;
    }

    private int getMaxLength(String s, int left ,int right){
        while(left>= 0 && right<= s.length() -1 && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right -(left +1);
    }
}
