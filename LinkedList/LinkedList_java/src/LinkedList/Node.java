package LinkedList;

public class Node<T>
{
  public Node(Data<T> Data)
  {
    this.data=data;
    this.next=null;
  }

  public Data<T>data;
  public Node<T>next;
}
