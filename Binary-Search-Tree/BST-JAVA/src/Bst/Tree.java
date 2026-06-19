package Bst;

public class Tree 
{
  public Tree()
  {
    this.root=null;
  }

  public void insertWord(String word,int id)
  {
    this.root=this.insert(this.root,word,id);
  }

  public void searchWord(int id)
  {
    this.search(this.root,id);
  }

  public void removeWord(int id)
  {
    this.root=this.removeNode(this.root,id);
  }

  public void viewNode()
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

  private void inorder(Node root)
  {
    if(root==null)
    {
      return;
    }
    inorder(root.getLeft());
    System.out.println(root.getData().getWord());
    inorder(root.getRight());
  }

  private void search(Node root,int id)
  {
    if(root==null)
    {
      return;
    }

    if(id>root.getData().getId())
    {
      search(root.getRight(), id);
    }
    else if(id<root.getData().getId())
    {
      search(root.getLeft(), id);
    }
    else 
    {
      System.out.println(root.getData().getWord());
    }
  }

  private Node removeNode(Node root,int id)
  {
    if(root==null)
    {
      return null;
    }

    if(id>root.getData().getId())
    {
      return root.setRight(removeNode(root.getRight(), id));
    }
    else if(id<root.getData().getId())
    {
      return root.setLeft(removeNode(root.getLeft(), id));
    }
    else 
    {
      if(root.getRight()==null&&root.getLeft()==null)
      {
        return null;
      }
      else if(root.getRight()==null)
      {
        return root.getLeft();
      }
      else if(root.getLeft()==null)
      {
        return root.getRight();
      }
      else 
      {
        Node temp=findMinNode(root.getRight());
        root.getData().setId(temp.getData().getId());
        root.getData().setWord(temp.getData().getWord());
        return root.setRight(removeNode(root.getRight(),temp.getData().getId()));
      }
    }
  }

  private Node findMinNode(Node root)
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

  private Node root;
}
