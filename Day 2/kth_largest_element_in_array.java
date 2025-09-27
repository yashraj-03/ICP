public class kth_largest_element_in_array {
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int num: nums){
                pq.add(num);
                if (pq.size() > k) {
                    pq.poll();
                }
            }
            return pq.peek();
        }
    }
}