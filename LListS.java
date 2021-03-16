//https://www.geeksforgeeks.org/reverse-a-linked-list/
public class LListS
{
  private Node head;
  
  public LListS(){
    head = null;
  }
  public void addH(int num){//add head
      head = new Node(num);
      Node temp = new Node (num);
      temp.setNext(head);
  }
  public void add(int num){//add tail
      Node temp = head;
      Node next = new Node(num);
      if(temp == null)
        head = next;
      else{
        while(temp.getNext() != null)
          temp = temp.getNext();
      temp.setNext(next);
      }  
  }
  public void rev(){
   Node prev=null;
    while(head.getNext() != null){
      Node temp = head.getNext();
      head.setNext(prev);
      prev = head;
      head = temp;
    }
    head.setNext(prev);
  }
  public String toString(){
    String output = "[";
      if(head == null)
        return output +"]";
      Node temp = head;
      while(temp.getNext() != null){
        output += temp.toString() + ", ";
        temp = temp.getNext();
      }
      output+= temp.toString() + "]";
   return output;
  }
}
 