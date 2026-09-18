package DoublyLinkedList;

public class FavouriteFood<T>
{
  public void add_at(int index,T food)
  {
    if(index<0||index>this.size)return;
    if(index==0)
    {
      this.add_head(food);
      return;
    }
    if(index==this.size)
    {
      this.add_tail(food);
      return;
    }
    Node<T> curr=this.head,node=new Node(food);
    int count=0;
    while(count<index)
    {
      curr=curr.get_next();
      count++;
    }
    Node before=curr,after=curr.get_next();
    node.set_prev(before);
    node.set_next(after);
    before.set_next(node);
    after.set_prev(node);
    this.size++;
  }

  public void delete_at(int index)
  {
    if(this.is_empty())return;
    if(index<0||index>this.size)return;
    if(index==0)
    {
      this.delete_head();
      return;
    }
    if(index==this.size)
    {
      this.delete_tail();
      return;
    }
    Node curr=this.head;
    int count=0;
    while(count<index)
    {
      curr=curr.get_next();
      count++;
    }

    Node before=curr.get_prev(),after=curr.get_next();
    before.set_next(after);
    after.set_next(before);
    this.size--;
  }
  public void delete_tail()
  {
    if(this.is_empty())return;
    if(this.head==this.tail)
    {
      this.head=null;
      this.tail=null;
    }
    else 
    {
      this.tail=this.tail.get_next();
      this.tail.set_prev(null);
    }
    this.size--;
  }
  public void delete_head()
  {
    if(this.is_empty())return;
    if(this.head==this.tail)
    {
      this.head=null;
      this.tail=null;
    }
    else 
    {
      this.head=this.head.get_next();
      this.head.set_prev(null);
    }
    this.size--;
  }
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

  public void display() 
  {
    if(this.is_empty())return;
    Node curr=this.head;
    int counter=1;
    System.out.println("My Top 5  Favorite Foods");
    while(curr!=null)
    {
      System.out.println(counter+". "+curr.get_food());
      curr=curr.get_next();
      counter++;
    }
  }

  private boolean is_empty(){return this.head==null;}
  private int size;
  private Node<T>head,tail;
}
