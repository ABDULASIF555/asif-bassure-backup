package DataStructures;

public class LinkedListStackDemo {
    Node head;
    public boolean addNode(int data){
        Node node = new Node(data);
        if (head!=null) {
            head = node;
        }
        else{
            head.next = node;
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}
