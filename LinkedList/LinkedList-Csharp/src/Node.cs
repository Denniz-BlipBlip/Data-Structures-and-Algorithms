namespace Data
{
  class Node
  {
    public Node(Data data)
    {
      this.next=null;
      this.data=data;
    }

    public Node next{get; set;}
    public Data data{get; set;}
  }
}
