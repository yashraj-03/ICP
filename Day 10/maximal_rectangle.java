public class maximal_rectangle {
    class Solution {
        public int maximalRectangle(char[][] matrix) {
            if(matrix.length==0){
                return 0;
            }
            int cols=matrix[0].length;
            int[] height = new int[cols];
            int maxA=0;
            for(char[] row: matrix){
                for(int j=0; j<cols; j++){
                    if(row[j]=='1'){
                        height[j]+=1;
                    }
                    else{
                        height[j]=0;
                    }
                }
                maxA = Math.max(maxA, helper(height));
            }
            return maxA;
        }
        public int helper(int[] heights){
            int n=heights.length;
            int maxArea=0;
            Stack<Integer> stk = new Stack<>();
            for(int i=0; i<=n; i++){
                int h=(i==n)?0:heights[i];
                while (!stk.isEmpty() && h < heights[stk.peek()]) {
                    int height = heights[stk.pop()];
                    int width = stk.isEmpty() ? i : i - stk.peek() - 1;
                    maxArea = Math.max(maxArea, height * width);
                }
                stk.push(i);
            }
            return maxArea;
        }
    }
}