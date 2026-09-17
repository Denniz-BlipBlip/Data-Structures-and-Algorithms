package DoublyLinkedList;

public class Node<T> 
{
  public T get_food(){return this.food;}
  public Node<T> get_next(){return this.next;}
  public Node<T> get_prev(){return this.prev;}
  public void set_prev(Node node){this.prev=node;}
  public void set_next(Node node){this.next=node;}
  public Node(T food)
  {
    this.food=food;
    this.prev=null;
    this.next=null;
  }
  private Node<T>prev,next;
  private T food;
}
