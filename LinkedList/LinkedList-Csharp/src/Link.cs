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
        this.bottom=null;
        this.top=null;
      }
      else 
      {
        newNode.next=this.top;
        this.top-newNode;
      }
      this.size+;
    }

    public void view()
    {
      if(isEmpty()){return;}

    }

    private bool isEmpty(){return this.top==null;}

    private Node top,bottom;
    private int size;
  }
}
