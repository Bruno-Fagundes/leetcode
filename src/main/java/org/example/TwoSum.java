package org.example;

public class TwoSum {
        public static void main (String[] args) {
            int[] nums = {2,7,11,15};
            int target = 9;
            int[] result = twoSum(nums,target);
            System.out.println("[" + result[0] + "]" + "[" + result[1] + "]");
        }

        public static int[] twoSum(int[] nums, int target) {
            int num1 = 0, num2 = 0;

            for (int i = 0; i < nums.length; i++) {
                for(int j = i+1; j < nums.length; j++) {
                    if ((nums[i] + nums[j]) == target) {
                        num1 = i;
                        num2 = j;
                    }
                }

            }
            if (num1 == 0 & num2 == 0) {
                throw new IllegalArgumentException("No two numbers found that sum to: " + target);
            }
            return new int[] {num1,num2};
        }
}
