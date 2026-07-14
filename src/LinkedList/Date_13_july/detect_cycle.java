package LinkedList.Date_13_july;

public class detect_cycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}

//    public boolean hasCycle(ListNode head) {
//        Set<ListNode> visited = new HashSet<>();
//        ListNode temp = head;
//        while (temp != null) {
//            if (!visited.add(temp)){
//                return true;
//            }
//            temp = temp.next;
//        }
//        return false;
//    }