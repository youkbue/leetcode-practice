package com.tmy.num344;

/**
 * 解决方案
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/16
 */
public class Solution {
    public void reverseString(char[] s) {
        int left = 0 ,right = s.length -1;
        while (left < right){
            char temp = ' ';
            temp =s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
            if(left == right) break;
        }
    }
}
