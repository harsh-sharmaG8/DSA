package LinkedList.Date_13_july;

public class Palindrome_LinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head , fast=head;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
        }
        if(fast!=null){
            slow=slow.next;
        }

        slow=reverselist(slow);
        fast=head;

        while(slow!=null){
            if(fast.val!=slow.val){
                return false;
            }
            fast=fast.next;
            slow=slow.next;

        }
        return true;
    }
    private ListNode reverselist(ListNode head){
        ListNode temp = head;
        ListNode prev=null;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}
