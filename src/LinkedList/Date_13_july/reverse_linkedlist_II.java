package LinkedList.Date_13_july;

public class reverse_linkedlist_II {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;

        ListNode curNode=head;
        ListNode leftpre= dummy;

        for(int i=0; i<left-1;i++){
            curNode=curNode.next;
            leftpre=leftpre.next;
        }

        ListNode subListHead=curNode;

        ListNode preNode=null;
        for(int i=0;i<right-left+1; i++){
            ListNode front= curNode.next;
            curNode.next=preNode;
            preNode=curNode;
            curNode= front;
        }

        subListHead.next=curNode;
        leftpre.next=preNode;

        return dummy.next;
    }
}
