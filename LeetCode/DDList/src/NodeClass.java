public class NodeClass {
    Node head;

    public void insertAtHead(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head= newNode;
    }
}
