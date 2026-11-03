class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];

        for (int n : nums) {
            max = Math.max(max, n);
        }

        int mov=0;

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] < max) {
                nums[i]++;
                mov++;
            }
        }
        return mov;
    }
}