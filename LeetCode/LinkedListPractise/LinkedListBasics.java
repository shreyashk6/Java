package LinkedListPractise;
public class LinkedListBasics {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtTail(1);
        list.printList();
        list.insertAtTail(2);
        list.insertAtHead(0);
        list.printList(); // Output: 0 -> 1 -> 2 -> null
        list.deleteAtHead();
        list.printList(); // Output: 1 -> 2 -> null
    }
}


class Node {
    int data; // Data stored in the node
    Node next; // Reference to the next node

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class SinglyLinkedList {
    Node head; // Reference to the first node

    // Constructor
    SinglyLinkedList() {
        head = null;
    }

    // Insert at the beginning
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Delete the first node
    public void deleteAtHead() {
        if (head != null) {
            head = head.next;
        }
    }

    // Print the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}