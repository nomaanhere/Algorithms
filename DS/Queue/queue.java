//Queue is a abstract/linear DS which can be implemented using 
//1) An array
//2) A LinkedList
//Implementation of a queue using a LinkedList

//There are two pointers in queue viz. Front and Rear.
//Nodes are inserted from the Rear of the List.
//Nodes are deleted from the front of the List.

//*Important points:
//-> If the queue is empty front node and the rear node should point to null.
//-> If there is only one node in the list, and we are about to delete that node then front would be null, but rear would still point to that node.
//    Its our duty to make rear pointing to null.
//-> Before deleting a node from the list, check whether the list is empty i.e. front==null or not.
//-> Before inserting check whether front==null or not. If yes then head.next=Node and same goes to the rear.

//There are two operations defined in the queue mainly
//1) Enqueue -> Insertion of the node to the REAR of the queue.
//2) Dequeue -> Deletion of the node from the FRONT of the queue.

public class queue{
  //defining the node to be used in the Singly LinkedList
  public class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
      next = null;
    }
  }
  
  Node front = null;
  Node rear = null;
  
  public boolean isEmpty(){
    return front == null;
  }
  
  public static void enqueue(int data){
    Node toAdd = new Node(data);
    if(front == null){
      front = toAdd;
    } else {
      Node temp=front;
      while(temp.next!=null){
        temp=temp.next;
      }
      temp.next = toAdd;
      rear = toAdd;
    }
  }
   
  public Node dequeue(){
    if(front == null && rear == null){
        return null; //node can't be deleted
    }
    if(front.next == null){
        rear=null;//if there is only one node left in the list that is to be deleted     
    }
    else {
        Node temp = front;
        front = front.next;
        return temp.data;
  }
}
