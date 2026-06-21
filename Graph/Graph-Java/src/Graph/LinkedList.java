package Graph;

public class LinkedList
{
  public LinkedList()
  {
    this.rear=null;
    this.front=null;
  }

  public void add(int number)
  {
    Node newNode=new Node(new Data(number));
    if(this.isEmpty())
    {
      this.rear=newNode;
      this.front=newNode;
    }
    else
    {
      this.rear.setNext(newNode);
      this.rear=newNode;
    }
  }

  public void remove(int number)
  {
    if(isEmpty())
    {
      return;
    }

    if(number==this.front.getData().getNumber())
    {
      this.front=this.front.getNext();
      if(front==null)
      {
        this.rear=null;
      }
      return;
    }
    else if(numbe)
  }

  public void print()
  {
    if(this.isEmpty())
    {
      return;
    }

    Node current=this.front;
    while(current!=null)
    {
      System.out.println(current.getData().getNumber());
      current=current.getNext();
    }
  }

  private boolean isEmpty()
  {
    return this.front==null;
  }

  private Node rear;
  private Node front;
}
