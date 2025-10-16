package LinkedListPractise;
public class SingleLinkedInsertATHead {
    public static void main(String[] args) {
        SingleLinkedList lis= new SingleLinkedList();
        lis.insertAtHead(3);
        lis.printList();
        System.out.println("----------------------------");
        lis.insertAtHead(4);
        lis.insertAtHead(1);
        lis.printList();
    }
}

class SingleLinkedList{
    //Declare head
    Node head;
    //declare constructor
    SingleLinkedList(){
        // this.head=null;
        head= null;
    }
    public void insertAtHead(int data){ 
        Node newNode = new Node(data);  //creating a new nodeee
        newNode.next= head;//Points new node next to current head
        head = newNode;//Update head to new nodee
    }

    //Printing the linked list
    public void printList(){
        Node current = head;
        while (current!=null){
            System.out.println(current.data + " ");
            current=current.next;
        }
        System.out.println("null");
    }
}