//LRU cache can be implemented using a doublyLinkedList along with a hashmap
//LRU cache implementation uses two APIs viz. get() & put() methods


public cacheEntry(int key, String value){
  int key;
  String value;
  cacheEntry(int key){
    this.key = key;
    this.value = value;
  }
}
HashMap<Integer,cacheEntry> entry = new HashMap();
public void 
