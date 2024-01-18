package com.tmy.num303;

public class NumArray {

    private int[] preSums;

    public NumArray(int[] nums) {
        preSums = new int[nums.length + 1];
        preSums[0] = 0;
        for(int i = 1 ; i < preSums.length ; i++){
            preSums[i] = preSums[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        return preSums[right + 1] - preSums[left];
    }
}
