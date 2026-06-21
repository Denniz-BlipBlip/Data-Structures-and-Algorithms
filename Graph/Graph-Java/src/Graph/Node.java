package Graph;

public class Node
{
  public Node(Data data)
  {
    this.data=data;
    this.next=null;
  }

  public void setNext(Node node){this.next=node;}
  public Node getNext(){return this.next;}
  public Data getData(){return this.data;}
  private Node next;
  private Data data;
}
