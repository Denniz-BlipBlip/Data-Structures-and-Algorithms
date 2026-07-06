namespace src
{
  class Node
  {
    public Node(Data data)
    {
      this.right=null;
      this.left=null;
      this.data=data;
    }

    public Data data{get; set;}
    public Node right{get; set;}
    public Node left{get; set;}
  }
}
