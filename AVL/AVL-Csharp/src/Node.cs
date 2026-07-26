using System;

namespace src
{
  struct Node 
  {
    Node(Data data)
    {
      this.right=null;
      this.left=null;
      this.height=1;
      this.data=data;
    }

    public Data data{get;}
    public Node right{get;set;}
    public Node left{get;set;}
    public int height{get;set;}
  }
}
