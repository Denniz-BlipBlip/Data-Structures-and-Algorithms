
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
      Node newNode=new Node(new Data());
    }

    private Node top;
    private Node bottom;
    private int size;
  }
}
