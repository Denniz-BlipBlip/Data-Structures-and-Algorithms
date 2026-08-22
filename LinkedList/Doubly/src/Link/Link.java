package Link;

public class Link 
{
  public void push_rear(String data)
  {
    Node node=new Node(data);
    if(this.isEmpty())
    {
      this.front=node;
      this.rear=node;
    }
  }

  public void push_front(String data)
  {
    Node node=new Node(data);
    if(this.isEmpty())
    {
      this.front=node;
      this.rear=node;
    }
    else 
    {
      this.front.prev=node;
      node.next=this.front;
      this.front=node;
    }
    this.size++;
  }

  private boolean isEmpty(){return this.front==null;}
  private int size;
  private Node rear,front;

  public Link()
  {
    this.front=null;
    this.rear=null;
    this.size=0;
  }
}
