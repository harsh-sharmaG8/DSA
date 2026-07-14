package LinkedList.Date_14_july;

import LinkedList.Date_13_july.ListNode;

public class Merge_two_sorted_linkedlist {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode returnNode = new ListNode(Integer.MAX_VALUE);
        ListNode headNode= returnNode;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                returnNode.next=list1;
                list1=list1.next;
            }
            else{
                returnNode.next=list2;
                list2=list2.next;
            }
            returnNode= returnNode.next;
        }
        if(list1==null){
            returnNode.next=list2;
        }
        else if(list2==null){
            returnNode.next=list1;
        }

        return headNode.next;
    }
}
