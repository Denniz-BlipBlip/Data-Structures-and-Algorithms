using System;

namespace Queue
{
  class Queue
  {
    public Queue()
    {
      this.top=null;
      this.bottom=null;
      this.size=0;
    }

    public void enqueue(string data)
    {
      Node newNode=new Node(new Data(data));
      if(this.isEmpty())
      {
        this.top=newNode;
        this.bottom=newNode;
      }
      else
      {
        this.bottom.next=newNode;
        this.bottom=newNode;
      }
      this.size++;
    }

    public void dequeue()
    {
      if(isEmpty())
      {
        this.top=null;
        this.bottom=null;
      }
      
      this.top=this.top.next;
      if(top==null)
      {
        this.bottom=null;
      }
      this.size--;
    }

    public void view()
    {
      if(isEmpty())
      {
        Console.WriteLine("The queue is empty");
        return;
      }

      Node current=this.top;
      while(current!=null)
      {
        Console.WriteLine(current.data.data);
        current=current.next;
      }
    }

    public int get_size()
    {
      return this.size;
    }

    private bool isEmpty(){return this.top==null;}

    private Node top;
    private Node bottom;
    private int size;
  }
}
