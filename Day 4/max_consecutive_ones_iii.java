public class max_consecutive_ones_iii {
    class Solution {
        public int longestOnes(int[] nums, int k) {
            int left =0;
            int right = 0;
            int maxlen=0;
            int zerocnt=0;
            int n = nums.length;
            while(right<n){
                if(nums[right]==0){
                    zerocnt++;
                }
                while(zerocnt>k){
                    if(nums[left]==0){
                        zerocnt--;
                    }
                    left++;
                }
                maxlen = Math.max(maxlen, right-left+1);
                right++;
            }
            return maxlen;
        }
    }
}