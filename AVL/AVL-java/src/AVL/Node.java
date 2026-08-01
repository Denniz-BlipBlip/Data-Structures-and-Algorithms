package DSA;

public class Node 
{
  public Node(Data data)
  {
    this.data=data;
    this.left=null;
    this.right=null;
    this.height=1;
  }

  public Node get_right(){return this.right;}
  public Node get_left(){return this.left;}
  public void set_right(Node node){this.right=node;}
  public void set_left(Node node){this.left=node;}
  public Data get_data(){return this.data;}
  public void set_data(Data data){this.data=data;}
  public void set_height(int n){this.height=n;}
  public int get_height(){return this.height;}

  private Data data;
  private Node right,left;
  private int height;
}
