    package LinkedListPractise;
    import LinkedListPractise.Node.NodeClass;
    public class NodeTrail {
        public static void main(String[] args) {
            NodeClass list = new NodeClass();
            list.insertDataInNode(10);
            list.printNodeList();        
        }
    }
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null; // Fixed: Initialize next to null
        }
    }
    

        class NodeClass{
            Node head;

        //inserting into a node
        public void insertDataInNode(int data) {
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

        //deletingg by value
        public void deleteAData(int value){
            if(head==null)return;//emptylist
            //
            if(head.data==value){ //Check if the head node itself has the value
                head=head.next;
                return;
            }
            //lets search for the ndoe while traversing
            Node current = head;
            while (current.next!=null && current.next.data != value) {
                current =  current.next;            
            }
            if(current.next!=null){
                current.next= current.next.next; //skips the node
            }
        }
        // Print the Node list
        public void printNodeList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " --> "); // Fixed: Use print
                current = current.next;
            }
            System.out.println("null");
        }
    }