public class sliding_window_maximum {
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            if(nums == null || nums.length==0){
                return new int[0];
            }
            int n=nums.length;
            int[] res = new int[n-k+1];
            Deque<Integer> queue = new ArrayDeque<>();
            for(int i=0; i<n; i++){
                while(!queue.isEmpty() && queue.peekFirst()<=i-k){
                    queue.pollFirst();
                }
                while(!queue.isEmpty() && nums[queue.peekLast()]<nums[i]){
                    queue.pollLast();
                }
                queue.offerLast(i);
                if(i>=k-1){
                    res[i-k+1] = nums[queue.peekFirst()];
                }
            }
            return res;
        }
    }
}