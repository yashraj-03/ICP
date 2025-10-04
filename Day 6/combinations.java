public class combinations {
    class Solution {
        public List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> res = new ArrayList<>();
            helper(n, k, 1, new ArrayList<>(), res);
            return res;
        }
        public void helper(int n, int k, int start, List<Integer> curr, List<List<Integer>> res){
            if(curr.size()==k){
                res.add(new ArrayList<>(curr));
                return;
            }
            for(int i=start; i<=n; i++){
                curr.add(i);
                helper(n,k,i+1,curr,res);
                curr.remove(curr.size()-1);
            }
        }
    }
}