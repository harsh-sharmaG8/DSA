package Date_24_March;

public class Remove_dup_fromDoublyLinkedlist {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head;
    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
    // Display DLL
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
    // Remove duplicates from sorted DLL
    public void removeDuplicates() {
        if (head == null) {
            return;
        }
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data) {
                Node duplicate = curr.next;
                curr.next = duplicate.next;
                if (duplicate.next != null) {
                    duplicate.next.prev = curr;
                }
            } else {
                curr = curr.next;
            }
        }
    }
    public static void main(String[] args) {
        Remove_dup_fromDoublyLinkedlist dll = new Remove_dup_fromDoublyLinkedlist();

        dll.insert(1);
        dll.insert(2);
        dll.insert(2);
        dll.insert(3);
        dll.insert(3);
        dll.insert(4);
        dll.insert(4);
        dll.insert(5);

        System.out.println("Original List:");
        dll.display();

        dll.removeDuplicates();

        System.out.println("After Removing Duplicates:");
        dll.display();
    }
}