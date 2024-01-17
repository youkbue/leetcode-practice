package com.tmy.palindrome_str;


/**
 * 给定一个字符串 s ，验证 s 是否是 回文串 ，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/17
 */
public class Solution {
    public boolean isPalindrome(String s) {
        int left = 0 , right = s.length() -1;

        //排除非字母和数字字符
        while (left < right){
            if(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            if(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }

        }
        return true;
    }
}
