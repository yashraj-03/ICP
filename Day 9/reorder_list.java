public class reorder_list {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    class Solution {
        public void reorderList(ListNode head) {
            if(head==null || head.next==null){
                return;
            }
            ListNode slow=head, fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            ListNode sec = reverse(slow.next);
            slow.next=null;
            ListNode first=head;
            while(sec!=null){
                ListNode temp1=first.next;
                ListNode temp2=sec.next;
                first.next=sec;
                sec.next=temp1;
                first=temp1;
                sec=temp2;
            }
        }
        public ListNode reverse(ListNode head){
            ListNode prev=null, curr=head;
            while(curr!=null){
                ListNode temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
            }
            return prev;
        }
    }
}