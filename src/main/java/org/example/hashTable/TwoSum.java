package org.example.hashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // Question : https://leetcode.com/problems/two-sum/

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i =  0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum.twoSum(nums, 9)));
    }
}
