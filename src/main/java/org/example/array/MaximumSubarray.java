package org.example.array;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int sum = 0, max = 0;;
        for (int num : nums) {
            if (sum < 0)
                sum = 0;
            sum += num;
            max = Math.max(sum, max);
        }
        return Math.max(sum, max);
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
