class Solution {
    public int sumOfSquares(int[] nums) {
        int i;
        int n=nums.length;
        int sum=0;
        for(i=0;i<n;i++)
        {
            if(n%(i+1)==0)
            {
                sum=sum+nums[i]*nums[i];
            }
        }
        return sum;
    }
}