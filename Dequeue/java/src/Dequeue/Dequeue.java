package Dequeue;

public class Dequeue
{
  public Dequeue()
  {
    this.front=null;
    this.rear=null;
    this.size=0;
  }

  public void push_front(String data)
  {
    Node node=new Node(data);
    if(this.empty())
    {
      this.rear=node;
      this.front=node;
    }
    else 
    {
      node.next=this.front;
      this.front=node;
    }
    this.size++;
  }

  public void push_rear(String data)
  {
    Node node=new Node(data);
    if(this.empty())
    {
      this.front=node;
      this.rear=node;
    }
    else 
    {
      this.rear.next=node;
      this.rear=node;
    }
    this.size++;
  }

  public void pop_rear()
  {
    if(this.empty())return;
    if(this.rear==this.front)
    {
      this.rear=null;
      this.front=null;
      this.size--;
      return;
    }

    Node curr=this.front;
    while(curr.next!=this.rear)curr=curr.next;
    curr.next=null;
    this.rear=curr;
    this.size--;
  }

  public void pop_front()
  {
    if(this.empty())return;
    this.front=this.front.next;
    if(front==null)this.rear=null;
    this.size--;
  }
  
  public void pop_at(int index)
  {
    if(index>this.size-1||index<0)return;
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
    this.size--;
  }

  public void push_at(String data,int index)
  {
    if(index<0)return;
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
    Node curr=this.front,node=new Node(data);
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
  
  private boolean empty(){return this.front==null;}
  private Node rear,front;
  private int size;
}
