class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int id=1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==id)
            id++;
        }
        return id;
    }
    
}