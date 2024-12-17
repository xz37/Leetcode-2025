package q0724;

class Solution {
    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] accum = new int[n];
        for (int i = 0; i < n; i++) {
            accum[i] = i == 0 ? nums[0] :  accum[i - 1] + nums[i];
        }
        int sum = accum[n - 1];
        for (int i = 0; i < n; i++) {
            int left = accum[i] - nums[i], right = sum - accum[i];
            if (left == right) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] test = new int[]{3};
        int res = pivotIndex(test);
        System.out.println(res);
    }
}
