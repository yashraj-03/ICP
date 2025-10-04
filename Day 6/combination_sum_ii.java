public class combination_sum_ii {
    class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            List<List<Integer>> res = new ArrayList<>();
            helper(candidates, target, 0, new ArrayList<>(), res);
            return res;
        }
        public void helper(int[] candidates, int target, int start, List<Integer> curr, List<List<Integer>> res){
            if(target==0){
                res.add(new ArrayList<>(curr));
                return;
            }
            for(int i=start; i<candidates.length; i++){
                if(i>start && candidates[i]==candidates[i-1]) continue;

                if(candidates[i]>target){
                    break;
                }
                curr.add(candidates[i]);
                helper(candidates, target-candidates[i], i+1, curr, res);
                curr.remove(curr.size()-1);
            }
        }
    }
}