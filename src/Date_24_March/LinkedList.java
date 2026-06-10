package Date_24_March;

import java.util.Scanner;


public class LinkedList {
    class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        Node head;
    // Create linked list using user input
        public void createList() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();
            if (n == 0) return;
            System.out.println("Enter elements:");

            // First node
            int value = sc.nextInt();
            head = new Node(value);
            Node temp = head;

            // Remaining nodes
            for (int i = 1; i < n; i++) {
                value = sc.nextInt();
                Node newNode = new Node(value);
                temp.next = newNode;
                temp = newNode;
            }
        }
//         Display list
        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
//         reverse list
        public Node reverseList() {
            Node temp=head;
            Node prev=null;
            while(temp!=null){
                Node front=temp.next;
                temp.next=prev;
                prev = temp;
                temp=front;

            }
            return prev;
        }
//      find middle element
        public Node middleNode() {
            if (head == null || head.next == null) return head;
            Node slow=head,fast=head;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
//      delete middle element
        public Node deleteMiddle() {
            if (head == null || head.next == null) return null;
            Node slow=head,fast=head, prev=null;
            while(fast != null && fast.next != null){
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            prev.next= slow.next;
            return head;

        }


        public static void main(String[] args) {
            LinkedList list = new LinkedList();

            list.createList();   // directly creating LL from input
            System.out.println("Linked List:");
            list.display();
            System.out.println("Reversed linkedlist:");
            list.head= list.reverseList();
            list.display();
            Node midelement= list.middleNode();
            System.out.println("The middle element is:" + midelement.data);


        }

}


//     for first middle;
//      while(fast!=null && fast.next.next!=null)


// REMOVE DUPLICATES IN SORTED DOUBLY LINKEDLIST
//Node removeDuplicates(Node head){
//    if (head == null) return head;
//    Node curr = head;
//    while (curr != null && curr.next != null) {
//        if (curr.data == curr.next.data) {
//            if (temp.next != null) {
//                temp.next.prev = curr;
//                curr = curr.next;
//            }
//        }
//        return head;
//        }
//}

//DELETE MIDDLE ELEMENT FROM LINKEDLIST
//public ListNode deleteMiddle(ListNode head) {
//    if (head == null || head.next == null) return null;
//    ListNode slow=head,fast=head, prev=null;
//    while(fast != null && fast.next != null){
//        prev = slow;
//        slow = slow.next;
//        fast = fast.next.next;
//    }
//    prev.next= slow.next;
//    return head;
//
//}
//    }