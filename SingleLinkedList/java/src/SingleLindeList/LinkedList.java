package LinkedList;

public class LinkedList 
{
  public LinkedList()
  {
    this.front=null;
    this.size=0;
  }

  public void push_front(String data)
  {
    Node node=new Node(data);
    node.next=this.front;
    this.front=node;
    this.size++;
  }

  public void push_rear(String data)
  {
    Node node=new Node(data);
    Node curr=this.front;
    while(curr.next!=null){curr=curr.next;}
    node.next=curr.next;
    curr.next=node;
    this.size++;
  }

  public void push_at(int index,String data)
  {
    if(index<0||index==this.size-1)return;
    if(index==0)
    {
      this.push_front(data);
      return;
    }
    if(index==this.size-1)
    {
      this.push_rear(data);
      return;
    }

    Node node=new Node(data),curr=this.front;
    int n=0;
    while(n<index-1)
    {
      curr=curr.next;
      n++;
    }
    node.next=curr.next;
    curr.next=node;
    this.size++;
  }

  public void pop_front()
  {
    if(this.empty())return;
    this.front=this.front.next;
    this.size--;
  }

  public void pop_rear()
  {
    if(this.empty())return;
    if(this.front.next.next==null)
    {
      this.front=null;
      this.size--;
      return;
    }
    Node curr=this.front;
    while(curr.next.next!=null){curr=curr.next;}
    curr.next=curr.next.next;
    this.size--;
    return;
  }

  public void pop_at(int index)
  {
    if(this.empty())return;
    if(index<0||index==this.size-1)return;
    if(index==0)
    {
      this.pop_front();
      return;
    }
    if(index==this.size-1)
    {
      this.pop_rear();
      return;
    }

    Node curr=this.front;
    int n=0;
    while(n<index-1)
    {
      curr=curr.next;
      n++;
    }
    curr.next=curr.next.next;
  }

  public void remove(String data)
  {
    if(this,empty())return;
    Node curr=this.front;
    if(this.front.data.equals(data))
    {
      this.front=this.front.next;
      this.size--;
      return;
    }
    while(curr.next!=null)
    {
      if(curr.next.equals(data))
      {
        curr.next=curr.next.next;
        this.size--;
        return;
      }
      curr=curr.next;
    }
  }

  private boolean empty(){return this.front==null;}
  private Node front;
  private int size;
}
