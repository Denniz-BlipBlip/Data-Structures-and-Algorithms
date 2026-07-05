using System;

namespace src 
{
  class Stack 
  {
    public Stack(){this.top=null;}

    public void push(string data)
    {
      Node newNode=new Node(new Data(data));
      newNode.next=this.top;
      this.top=newNode;
    }

    public void pop()
    {
      if(isEmpty())
      {
        Console.WriteLine("The stack is empty");
        return;
      }

      this.top=this.top.next;
    }

    public void peek()
    {
      if(this.isEmpty())
      {
        Console.WriteLine("The stack is empty"); 
        return;
      }

      Console.WriteLine(this.top.data.data);
    }

    private bool isEmpty()
    {
      return top==null;
    }

    private Node top;
  }
}
