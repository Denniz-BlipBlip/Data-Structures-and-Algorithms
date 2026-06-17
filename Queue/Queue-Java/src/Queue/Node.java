package Queue;

public class Node
{
  public Node(Data data)
  {
    this.data=data;
    this.next=null;
  }

  public Data getData(){return this.data;}
  public Node getNext(){return this.next;}
  public void setNext(Node node){this.next=node;}

  private Node next;
  private Data data;
}
