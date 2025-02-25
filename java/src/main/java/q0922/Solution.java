package q0922;

class Solution {
    public int[] sortArrayByParityII(int[] nums) {

        int[] ans = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                ans[index] = nums[i];
                index += 2;
            }
        }
        index = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                ans[index] = nums[i];
                index += 2;
            }
        }
        return ans;
    }
}
