package com.tmy.num370;

import com.tmy.Difference;

/**
 * 区间加法
 *
 * @author kancsd
 * @version 1.0.0
 * @date 2024/01/19
 */
public class Solution {

    /**
     * 获取修改数组
     *
     * @param length  长度
     * @param updates 更新数据 update[0][0]代表 left 0 1代表right 0 2代表val
     * @return {@link int[]} 返回进行k次操作后的数据
     */
    int[] getModifiedArray(int length,int[][] updates){
        int[] nums = new int[length];
        Difference difference = new Difference(nums);
        for (int[] update : updates) {
            int left = update[0];
            int right = update[1];
            int val = update[2];
            difference.increment(left,right,val);
        }
        return difference.getResult();
    }
}
