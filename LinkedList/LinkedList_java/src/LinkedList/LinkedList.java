package LinkedList;

public class LinkedList<T> 
{
  public LinkedList()
  {
    this.front=null;
    this.rear=null;
    this.size=0;
  }

  public void push_front(T data)
  {
    Node<T>node=new Node<>(new Data<>(data));
    if(this.empty())
    {
      this.front=node;
      this.rear=node;
    }
    else 
    {
      node.next=this.front;
      this.front=node;
    }
    this.size++;
  }

  public void push_rear(T data)
  {
    Node<T>node=new Node<>(new Data<>(data));
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

  public void remove_front()
  {
    if(this.empty())return;
    this.front=this.front.next;
    if(front==null){this.rear=null;}
    this.size--;
  }

  public void remove_back()
  {
    if(this.empty())return;
    if(this.rear==this.front)
    {
      this.rear=null;
      this.front=null;
      this.size--;
      return;
    }

    Node<T>curr=this.front.next;
    while(curr!=this.rear){curr=curr.next;}
    curr.next=null;
    this.rear=curr;
    this.size--;
  }
  
  public void remove_at(int index)
  {
    if(index<0||this.empty())return;
    if(index==0)
    {
      this.remove_front();
      return;
    }
    if(index==this.size)
    {
      this.remove_back();
      return;
    }

    Node<T>curr=this.front;
    int n=0;
    while(n<index)
    {
      curr=curr.next;
      n++;
    }
    curr.next=curr.next.next;
    this.size--;
  }

  public void push_at(T data,int index)
  {
    if(index<0||index>this.size)return;
    if(index==0)
    {
      this.push_front(data);
      return;
    }
    if(index==this.size)
    {
      this.push_rear(data);
      return;
    }

    Node<T>node=new Node<>(new Data<>(data));
    Node<T>curr=this.front;
    int n=0;
    while(n<index)
    {
      curr=curr.next;
      n++;
    }
    curr.next=node;
    node.next=curr;
    this.size++;
  }

  public void view()
  {
    if(this.empty())return;

    Node<T>curr=this.front;
    while(curr!=null)
    {
      System.out.println(curr.data.data);
      curr=curr.next;
    }
  }

  public int search(T data)
  {
    if(this.empty())return -1;
    Node<T>curr=this.front;
    while(curr!=null)
    {
      if(curr.data.data==data)return 1;
    }
    return-1;
  }

  public void reverse()
  {
    Node<T>curr=this.front,oValue=this.front,prev=null;
    while(curr!=null)
    {
      Node<T>temp=curr.next;
      curr.next=prev;
      prev=curr;
      curr=temp;
    }
    this.front=oValue;
    this.rear=prev;
  }

  private boolean empty(){return this.front==null;}

  private Node<T>front,rear;
  private int size;
}
