using System;

namespace src
{
  class Tree
  {
    public Tree(){this.root=null;}

    public void insert(string data,id)
    {
      this.root=insert(this.root,data,id);
    }

    public void delete(int id)
    {
      this.root=delete(this.root,id);
    }

    public void traverse()
    {
      traverse(this.root);
    }

    private Node insert(Node root,string data,int id)
    {
      if(root==null){return new Node(new Data(data,id));}

      if(id>root.data.id)
      {
        return root.right=insert(root.right,data,id);
      }
      else
      {
        return root.left=insert(root.left,data,id);
      }
    }

    private Node delete(Node root,int id)
    {
      if(root==null){return null;}

      if(id>root.data.id)
      {
        return root.right=delete(root.right,id);
      }
      else if(id<root.data.id)
      {
        return root.left=delete(root.left,id);
      }
      else
      {
        if(root.right==null||root.left==null)
        {
          return null;
        }
        else if(root.right==null)
        {
          return root.left;
        }
        else if(root.left==null)
        {
          return root.right;
        }
        else
        {
          Node temp=findMin(root.right);
          root.data.data=temp.data.data;
          root.data.id=temp.data.id;
          return root.right=delete(root.right,temp.data.id);
        }
      }
    }

    private void traverse(Node root)
    {
      if(root==null){return;}

      traverse(root.left);
      Console.WriteLine(root.data.data);
      traverse(root.right);
    }

    private Node findMin(Node root) 
    {
      if(root==null){return null;}

      while(root!=null&&root.left!=null)
      {
        root=root.left;
      }
      return root;
    }
  }
}
