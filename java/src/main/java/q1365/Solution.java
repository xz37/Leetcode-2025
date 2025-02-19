package q1365;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
//    Solution 1 - sorting
//    public int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] sortedNums = Arrays.copyOf(nums, nums.length);
//        Arrays.sort(sortedNums);
//        Map<Integer, Integer> valueToAns = new HashMap<>();
//        for (int i = 0; i < sortedNums.length; i++) {
//            if (i == 0) {
//                valueToAns.put(sortedNums[0], 0);
//                continue;
//            }
//            if (sortedNums[i] != sortedNums[i - 1]) {
//                valueToAns.put(sortedNums[i], i);
//            }
//        }
//
//        int[] ans = new int[nums.length];
//        for (int i = 0; i < ans.length; i++) {
//            ans[i] = valueToAns.get(nums[i]);
//        }
//
//        return ans;
//    }

//    Solution 2: make a count table
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] counts = new int[101];
        for (int num : nums) {
            counts[num]++;
        }
        int previous = 0;
        for (int i = 0; i <= 100; i++) {
            int currentCount = counts[i];
            if (i == 0) {
                counts[0] = 0;
            } else {
                counts[i] = counts[i - 1] + previous;
            }
            previous = currentCount;
        }

        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = counts[nums[i]];
        }
        return res;
    }

        public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {8,1,2,2,3};
        int[] res = solution.smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(res));
    }
}
