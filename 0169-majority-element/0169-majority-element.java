class Solution {
    public int majorityElement(int[] nums) {
        int c = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                c = num;
                count = 1;
            } 
            else if (num == c) {
                count++;
            } 
            else {
                count--;
            }
        }
        return c;
    }
}