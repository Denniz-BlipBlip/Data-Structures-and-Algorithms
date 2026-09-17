package DoublyLinkedList;

public class FavouriteFood<T>
{

  public void add_tail(T food)
  {
    Node<T>node=new Node(food);
    if(this.is_empty())
    {
      this.head=node;
      this.tail=node;
    }
    else 
    {
      node.set_prev(this.tail);
      this.tail.set_next(node);
      this.tail=node;
    }
    this.size++;
  }
  public void add_head(T food)
  {
    Node<T>node=new Node(food);
    if(this.is_empty())
    {
      this.head=node;
      this.tail=node;
    }
    else 
    {
      this.head.set_prev(node);
      node.set_next(node);
      this.head=node;
    }
    this.size++;
  }
  public FavouriteFood()
  {
    this.head=null;
    this.tail=null;
    this.size=0;
  }
  private boolean is_empty(){return this.head==null;}
  private int size;
  private Node<T>head,tail;
}
