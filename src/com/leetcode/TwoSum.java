package com.leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {4, 2, 6, 2, 5, 7, 23};
        int target = 12;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return nums;
    }
}
