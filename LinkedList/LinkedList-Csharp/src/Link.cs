using System;

namespace Data
{
  class Link
  {
    public Link()
    {
      this.top=null;
      this.bottom=null;
      this.size=0;
    }

    public void addBottom(string data)
    {
      Node newNode=new Node(new Data(data));

      if(isEmpty())
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

    public void addTop(string data)
    {
      Node newNode=new Node(new Data(data));

      if(isEmpty())
      {
        this.bottom=newNode;
        this.top=newNode;
      }
      else 
      {
        newNode.next=this.top;
        this.top=newNode;
      }
      this.size++;
    }

    public void view()
    {
      if(isEmpty())
      {
        Console.WriteLine("The stack is empty");
        return;
      }

      Node current=this.top;
      while(current!=null)
      {
        Console.WriteLine(current.data.data);
        current=current.next;
      }
    }

    public void deleteTop()
    {
      if(isEmpty()){return;}

      this.top=top.next;
      if(top==null)
      {
        this.bottom=null;
      }
      this.size--;
    }

    public void deleteBottom()
    {
      if(isEmpty()){return;}

      if(this.top==this.bottom)
      {
        this.top=null;
        this.bottom=null;
        this.size--;
      }

      Node current=this.top.next;
      while(current!=this.bottom)
      {
        current=current.next;
      }

      current.next=null;
      this.bottom=current;
      this.size--;
    }

    public void deleteAt(int n)
    {
      n--;
      if(n==0)
      {
        this.deleteTop();
        return;
      }
      else if(n==this.get_size())
      {
        this.deleteBottom();
        return;
      }

      int count=0;
      Node current=this.top;
      while(count<n)
      {
        current.next=current.next;
        count++;
      }

      current.next=current.next.next;
      this.size--;
    }

    public void insertAt(string data,int index)
    {
      index--;
      if(index<0||index>this.get_size()){return;}
      if(index==0)
      {
        this.addTop(data);
        return;
      }
      else if(index==this.get_size())
      {
        this.addBottom(data);
        return;
      }

      int count=0;
      Node newNode=new Node(new Data(data));
      Node current=this.top;
      while(count<index)
      {
        current=current.next;
        count++;
      }

      Node temp=current.next;
      current.next=newNode;
      newNode.next=current;
      this.size++;
    }

    public int get_size(){return this.size;}

    private bool isEmpty(){return this.top==null;}

    private Node top,bottom;
    private int size;
  }
}
