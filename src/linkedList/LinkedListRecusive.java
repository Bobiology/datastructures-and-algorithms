package linkedList;

public class LinkedListRecusive {
    Node head;

   class Node {
        int data;
       Node next;

       Node(int data){
          this.data = data;
          next = null; 
       }
   }

   public  Node Insert(Node node,int data){
       if(node == null){
          node = new Node(data);
       }else{
           //recuse
           node.next = Insert(node.next,data);
       }
       return node;
   }
   public void insertRecusive(int data){
       head = Insert(head,data);
   }
   public void PrintNode(){
       Node current = head;
       while(current != null){
          System.out.println (" Data "+ current.data);
           current = current.next;
       }
   }
   public Node Reverse(Node node){
       Node current = node;
       Node previous = null;
       Node temp = null;

       while(current != null ){
           temp = current.next;
           current.next = previous;
           previous = current;
           current = temp;
       }
       return previous;
   }

   public void Reverse(){
       head = Reverse(head);
   }
   public static void main (String args[]){

       LinkedListRecusive lk = new LinkedListRecusive();
       lk.insertRecusive(1);
        lk.insertRecusive(2);
        lk.insertRecusive(3);
        lk.insertRecusive(4);

       lk.PrintNode();
       lk.Reverse();
       lk.PrintNode();
   }
}
