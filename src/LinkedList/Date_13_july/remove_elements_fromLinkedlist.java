package LinkedList.Date_13_july;

public class remove_elements_fromLinkedlist {
    public detect_cycle.ListNode removeElements(detect_cycle.ListNode head, int val) {
        while(head!=null && head.val==val){
            head= head.next;
        }
        if(head == null){
            return null;
        }

        detect_cycle.ListNode temp= head;
        while(temp.next!=null){
            if(temp.next.val==val){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return head;

    }
}
