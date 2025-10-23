public class Min_Stack {
    class Pair {
        int x, y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    class MinStack {
        Stack<Pair> stk;
        public MinStack() {
            stk = new Stack<>();
        }

        public void push(int val) {
            int min;
            if (stk.isEmpty()) {
                min = val;
            }
            else {
                min = Math.min(stk.peek().y, val);
            }
            stk.push(new Pair(val, min));
        }

        public void pop() {
            if(!stk.isEmpty()){
                stk.pop();
            }
        }

        public int top() {
            return stk.peek().x;
        }

        public int getMin() {
            return stk.peek().y;
        }
    }

}