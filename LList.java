//Name:
//Lab 9A
//Linked List simulation

public class LList
{
   private Node head;
   
   public LList()
   {
      head = null;
   }
   
   public void add(int num)
   {
      Node temp = head;
      Node newNode = new Node(num);
      if(temp == null)
      {
         temp = newNode;
         head = temp;
      }
      else
      {
         while(temp.getNext() != null)
            temp = temp.getNext();
         temp.setNext(newNode);   
      }
   }
      
   public void addH(int num)
   {
      if(head == null)
         head = new Node(num);
      else
      {
         Node temp = head;
         head = new Node(num);
         head.setNext(temp);
      }
   }
   
   public void reverse()
   {
      //Add code here for Lab 9A  
   }
   
   public void findNthFromEnd(int n)
   {
      //Add code here for Lab 9B
   }
   
   public String toString()
   {
      String output = "";
      if(head == null)
         output = "[]";
      else
      {
         Node temp = head;
         while(temp.getNext() != null)
         {
            output += temp + " - ";
            temp = temp.getNext();
         }
         output += temp;
      }
      return output;
   }
}





