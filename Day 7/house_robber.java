public class house_robber {
    class Solution {
        public int rob(int[] nums) {
            int n=nums.length;
            if(n==0){
                return 0;
            }
            if(n==1) return nums[0];
            int prev=nums[0];
            int prev1=Math.max(nums[0],nums[1]);
            for(int i=2; i<n; i++){
                int curr = Math.max(prev1, nums[i]+prev);
                prev=prev1;
                prev1=curr;
            }
            return prev1;
        }
    }
}