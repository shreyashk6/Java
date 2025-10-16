package LinkedListPractise;
// Define Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linked List class
class SinglyLinkedList {
    Node head;

    // Insert at the end
    public void insert(int data) {      //INSERTING AT END
        Node newNode = new Node(data);
        if (head == null) { // empty list
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Delete by value
    public void delete(int value) {
        if (head == null) return; // empty list

        // if head node itself holds the value
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next; // skip the node
        }
    }

    // Search for a value
    public boolean search(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) return true;
            current = current.next;
        }
        return false;
    }

    // Print all elements
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Get element at specific index
    public int get(int index) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) return current.data;
            count++;
            current = current.next;
        }
        throw new IndexOutOfBoundsException("Index out of range");
    }
}

// Main program
public class PerfectLinkedListEnd {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Insert elements
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Initial list:");
        list.printList();  // 10 -> 20 -> 30 -> 40 -> null

        // Delete one element
        list.delete(20);
        System.out.println("After deleting 20:");
        list.printList();  // 10 -> 30 -> 40 -> null

        // Search for a value
        System.out.println("Is 30 in the list? " + list.search(30)); // true
        System.out.println("Is 50 in the list? " + list.search(50)); // false

        // Get element at index
        System.out.println("Element at index 1: " + list.get(1)); // 30
    }
}
 