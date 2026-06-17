package Stack;

public class Node
{
  public Node(Data data)
  {
    this.data=data;
    this.next=null;
  }

  public Node getNext(){return this.next;}
  public void setNext(Node node){this.next=node;}
  public Data getData(){return this.data;}
  private Node next;
  private Data data;
}
