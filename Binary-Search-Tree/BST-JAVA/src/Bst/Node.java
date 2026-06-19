package Bst;

public class Node 
{
  public Node(Data data)
  {
    this.data=data;
    this.right=null;
    this.left=null;
  }

  public Node getRight(){return this.right;}
  public Node setRight(Node node){return this.right=node;}
  public Node getLeft(){return this.left;}
  public Node setLeft(Node node){return this.left=node;}
  public Data getData(){return this.data;}
  public void setData(Data data){this.data=data;}
  private Node right;
  private Node left;
  private Data data;
}
