package LinkedList;

import java.time.temporal.IsoFields;

public class LinkedList 
{
  public LinkedList()
  {
    this.rear=null;
    this.front=null;
    this.size=0;
  }

  public void insertFront(String word)
  {
    Node newNode=new Node(new Data(word));
    if(isEmpty())
    {
      this.rear=newNode;
      this.front=newNode;
    }
    else 
    {
      newNode.setNext(front);
      this.front=newNode;
    }
    this.size++;
  }

  public void insertBack(String word)
  {
    Node newNode=new Node(new Data(word));
    if(isEmpty())
    {
      this.rear=newNode;
      this.front=newNode;
    }
    else 
    {
      this.rear.setNext(newNode);
      this.rear=newNode;
    }
    this.size++;
  }

  public void deleteFront()
  {
    if(isEmpty())
    {
      System.out.println("The List is empty");
      return;
    }

    this.front=this.front.getNext();
    if(this.front==null)
    {
      this.rear=null;
    }
    this.size--;
  }

  public void deleteRear()
  {
    if(isEmpty())
    {
      System.out.println("The List is Empty");
      return;
    }
     if(this.front==this.rear)
     {
       this.rear=null;
       this.front=null;
       this.size--;
       return;
     }
     Node current=this.front.getNext();
     while(current.getNext()!=this.rear)
     {
       current=current.getNext();
     }
     current.setNext(null);
     this.rear=current;
     this.size--;
  }

  public void deleteAt(int index)
  {
    if(index==0)
    {
      this.deleteFront();
      return;
    }
    else if(index==this.size)
    {
      this.deleteRear();
      return;
    }
    int count=0;
    Node current=this.front;
    while(count<index-1)
    {
      current=current.getNext();
      count++;
    }
    current.setNext(current.getNext().getNext());
    size--;
  }

  public void insertAt(String word,int index)
  {
    if(index<0||index>this.size)
    {
      return;
    }
    if(index==0)
    {
      this.insertFront(word);
      return;
    }
    if(index==this.size)
    {
      this.insertBack(word);
      return;
    }
    int count=0;
    Node newNode=new Node(new Data(word));
    Node current=this.front;
    while(count<index-1)
    {
      current=current.getNext();
      count++;
    }
    Node temp=current.getNext();
    current.setNext(newNode);
    newNode.setNext(temp);
    this.size++;
  }

  public void view()
  {
    if(isEmpty())
    {
      System.out.println("The List is empty");
      return;
    }

    Node current=this.front;
    while(current!=null)
    {
      System.out.println(current.getData().getWord());
      current=current.getNext();
    }
  }

  public int getSize()
  {
    return this.size;
  }

  private boolean isEmpty()
  {
    return this.front==null;
  }

  private Node rear;
  private Node front;
  private int size;
}
