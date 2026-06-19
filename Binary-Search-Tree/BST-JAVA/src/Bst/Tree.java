package Bst;

public class Tree 
{
  public Tree()
  {
    this.root=null;
  }

  public void insert(String word,int id)
  {
    this.root=this.insert(this.root,word,id);
  }

  public void search(int id)
  {
    this.search(this.root,id);
  }

  public void remove(int id)
  {
    this.root=this.remove(this.root,id);
  }

  public void view()
  {
    this.inorder(this.root);
  }

  private Node insert(Node root,String word,int id)
  {
    if(root==null)
    {
      return new Node(new Data(word,id));
    }

    if(id>root.getData().getId())
    {
      return root.setRight(insert(root.getRight(),word,id));
    }
    else 
    {
      return root.setLeft(insert(root.getLeft(),word,id));
    }
  }

  private Node remove(Node root,int id)
  {
    if(root==null)
    {
      return null;
    }

    return root;
  }

  private Node findMin(Node root)
  {
    if(root==null)
    {
      return null;
    }
    
    while(root!=null&&root.getLeft()!=null)
    {
      root=root.getLeft();
    }
    return root;
  }
}
