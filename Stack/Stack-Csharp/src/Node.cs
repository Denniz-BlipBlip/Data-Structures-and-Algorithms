
namespace src
{
  class Node 
  {
    public Node(Data data)
    {
      this.data=data;
      this.next=null;
    }

    public Node next{get;set;}
    public Data data{get;set;}
  }
}
