//Deque which is also known as Doubly Ended Queue.
//Note:
//The major difference between the normal queue and the deque is that the node/data can be inserted/deleted from both the FRONT and the REAR of the queue.
  
//Doubly Ended Queue can be implemented using a Doubly LinkedList.

//Applications:
//-> DoublyEnded queue can be used to implement LRU cache where the insertion/deletion of the node from the front/rear pointer is performed in O(1) Time Complexity.

//Operations performed in the deque are
//-> Insert a node at FRONT
//-> Delete a node at FRONT
//-> Insert a node at REAR
//-> Delete a node at REAR

//Let's implement each and every function one by one,


public class deque{
  
//defining a node in a doubly LinkedList
public class Node {
  int data;
  Node prev, next;
  Node(int data){
    this.data = data;
    prev = next = null;
  }
}
  public static void insertFront(){
  }
  
  public static void insertRear(){
  }
  
  public Node deleteFront(){
  }
  public Node deleteRear(){
  }
  
  public Node peekFront(){
  }
  public Node peekRear(){
  }
}
