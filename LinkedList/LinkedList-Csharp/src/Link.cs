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

      }
    }

    private Node top,bottom;
    private int size;
  }
}
