package Stack;

public class Stack
{
  public Stack()
  {
    this.top=null;
    this.size=0;
  }

  public void push(String word)
  {
    Node newNode=new Node(new Data(word));
    newNode.setNext(this.top);
    this.top=newNode;
    this.size++;
  }

  public void pop()
  {
    if(isEmpty())
    {
      System.out.println("The Stack is Empty");
      return;
    }
    this.top=top.getNext();
    this.size--;
  }

  public void peek()
  {
    if(isEmpty())
    {
      System.out.println("The Stack is empty");
      return;
    }
    System.out.println(top.getData().getWord());
  }

  private boolean isEmpty()
  {
    return this.top==null;
  }

  private Node top;
  private int size;
}
