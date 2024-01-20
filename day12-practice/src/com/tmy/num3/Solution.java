package com.tmy.num3;

import java.util.HashMap;

/**
 * 无重复子串的最大长度
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/20
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0 ,right = 0 ,max= 0;
        char[] charArray = s.toCharArray();
        while (right <s.length()){
            if(map.containsKey(charArray[right]) && right >= left){
                left = map.get(charArray[right]) +1;
            }
            max = Math.max(max, right - left +1);
            map.put(charArray[right],right);
            right++;
        }
        return max;
    }
}
