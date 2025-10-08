public class palindrome_linkedlist {
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
        public boolean isPalindrome(ListNode head) {
            if(head==null || head.next==null){
                return true;
            }
            ListNode slow=head, fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            ListNode sec = reverse(slow);
            ListNode p1=head, p2=sec;
            while(p2!=null){
                if(p1.val != p2.val){
                    return false;
                }
                p1=p1.next;
                p2=p2.next;
            }
            return true;
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