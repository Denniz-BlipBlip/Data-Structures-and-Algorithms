package Queue;

public class Queue
{
  public Queue()
  {
    this.rear=null;
    this.front=null;
    this.size=0;
  }

  public void enqueue(String word)
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

  public void dequeue()
  {
    if(isEmpty())
    {
      return;
    }

    this.front=this.front.getNext();
    if(this.front==null)
    {
      this.rear=null;
    }
    this.size--;
  }

  public void peek()
  {
    if(isEmpty())
    {
      return;
    }

    System.out.println(this.front.getData().getData());
  }

  public void view()
  {
    if(isEmpty())
    {
      return;
    }

    Node current=this.front;
    while(current!=null)
    {
      System.out.println(current.getData().getData());
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
