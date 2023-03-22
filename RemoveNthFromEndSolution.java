public class RemoveNthFromEndSolution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n == 0) {
            return head;
        }
        else {
            ListNode temp = new ListNode(0);
            temp.next = head;
            ListNode first = temp;
            ListNode second = temp;
            for(int i = 0; i < n + 1; i++) {
                first = first.next;
            }
            while(first != null) {
                first = first.next;
                second = second.next;
            }     
            second.next = second.next.next;
            return temp.next;
        }
    }
}
