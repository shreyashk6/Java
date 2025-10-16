package LinkedListPractise;
public class LinkedListInsertAtEnd {
    public static void main(String[] args) {
        InnerLinkedListTrail2 list =  new InnerLinkedListTrail2();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);

        System.out.println("Initial list:");
        list.printList();
    }
}
//Defining Node class for linked list 
class Node{
    int data;
    Node next;
    // constructor
    Node(int data){
        this.data=data;
       // this.next=next;
    }
}
class InnerLinkedListTrail2 {
    Node head;

    
    //insert at the endddd
    public void insertAtTail(int data){
        //create an  empty node at first
        Node newNode= new Node(data);
        if(head==null){//check if its empty
            head= newNode;
            return;
        }
        Node current = head;   // initialize an emoty temporary node 
        while (current.next!=null){     //check whererver the next node is emoty or null and assign
            current= current.next;
        }
        current.next=newNode;
    }
    public void printList(){
        Node current = head;
        while(current!= null){
            System.out.println(current.data+ " ");
            current= current.next;
        }
        System.out.println(" ");
    }
}