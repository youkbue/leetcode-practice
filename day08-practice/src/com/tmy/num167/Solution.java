package com.tmy.num167;

/**
 * 解决方案
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/16
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
      int left = 0 , right = numbers.length -1;
      while (left < right){
          int num = (numbers[left] + numbers[right]);
          if(num == target){
              return new int[]{left+1, right+1};
          }
          else if(num < target){
              left++;
          }
          else if (num > target){
              right--;
          }
      }
      return new int[]{-1,-1};
    }
}
