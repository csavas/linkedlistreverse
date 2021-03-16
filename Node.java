public class Node
{
    private int value;
    private Node next;
    
    public Node(int x)
    {
        value = x; 
        next = null;
    }
    
    public Node getNext()
    {
        return next;   
    }
    
    public void setNext(Node newNode)
    {
        next = newNode;
    }
    
    public String toString()
    {
        return "" + value;
    }
}
