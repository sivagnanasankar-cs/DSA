package org.example.hashTable;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSumHashing(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            set.clear();
            for (int j = i+1; j < nums.length; j++) {
                int third = -(nums[i] + nums[j]);
                if (set.contains(third)) {
                    List<Integer> list = Arrays.asList(nums[i], nums[j], third);
                    list.sort(Comparator.comparingInt(a -> a));
                    result.add(list);
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(result);
    }

    // efficient
    public static List<List<Integer>> threeSumTwoPointer(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i< nums.length ; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0){
                    k--;
                }
                else {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j - 1]) j++;
                    while(j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{-1, 0, 1, 2, -1, -4};
        System.err.println(threeSumHashing(arr1));
        System.err.println(threeSumTwoPointer(arr1));
    }
}
