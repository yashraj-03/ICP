public class asteroid_collision {
    class Solution {
        public int[] asteroidCollision(int[] asteroids) {
            ArrayDeque<Integer> stk = new ArrayDeque<>();
            for(int astroid: asteroids){
                boolean destroyed=false;
                while(!stk.isEmpty() && astroid<0 && stk.peek()>0){
                    if(Math.abs(stk.peek())<Math.abs(astroid)){
                        stk.pop();
                    }
                    else if(Math.abs(stk.peek())==Math.abs(astroid)){
                        stk.pop();
                        destroyed=true;
                        break;
                    }
                    else{
                        destroyed=true;
                        break;
                    }
                }
                if(!destroyed){
                    stk.push(astroid);
                }
            }
            int[] res = new int[stk.size()];
            int i=res.length-1;
            while(!stk.isEmpty()){
                res[i--]=stk.pop();
            }
            return res;
        }
    }
}