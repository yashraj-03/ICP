public class implement_stack_using_Queues {
    class MyStack {
        public Queue<Integer> q1;
        public Queue<Integer> q2;
        public MyStack() {
            q1 = new LinkedList<>();
            q2 = new LinkedList<>();
        }

        public void push(int x) {
            q1.offer(x);
        }

        public int pop() {
            while(q1.size()>1){
                q2.offer(q1.poll());
            }
            int top = q1.poll();
            Queue<Integer> temp = q1;
            q1=q2;
            q2=temp;
            return top;
        }

        public int top() {
            while(q1.size()>1){
                q2.offer(q1.poll());
            }
            int top = q1.peek();
            q2.offer(q1.poll());
            Queue<Integer> temp = q1;
            q1=q2;
            q2=temp;
            return top;
        }

        public boolean empty() {
            return q1.isEmpty();
        }
    }
}