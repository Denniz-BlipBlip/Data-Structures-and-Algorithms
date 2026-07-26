using System

namespace src 
{
  class Tree 
  {
    public Tree(){this.root=null;}

    public void insert(string data,id){this.root=this.insert(this.root,data,id);}
    public void delete(int id){this.root=this.delete(this.root,id);}
    public void view(){this.traversal(this.root);}

    private Node insert(Node root,string data,int id)
    {
      if(root==null){return new Node(new Data(data,id));}

      if(id>root.data.id){return root.right=this.insert(root.right,data,id);}
      else if(id<root.data.id){return root.left=this.insert(root.left,data,id);}
      else{return root;}
      return this.rebase(root);
    }

    private Node delete(Node root,int id)
    {
      if(node==null){return null;}

      if(id>node.data.id){return root.right=this.delete(node.right,id);}
      else if(id<node.data.id){return root.left=this.delete(node.left,id);}
      else 
      {
        if(node.right==null&&node.left==null){return null;}
        else if(node.right==null){return node.left;}
        else if(node.left==null){return node.right;}
        else 
        {
          Node temp=this.find_min(node.right);
          root.data=temp.data;
          return root.right=this.delete(root.right,temp.data.id);
        }
      }
      return this.rebase(root);
    }

    private Node root;
  }

  private Node find_min(Node node)
  {
    if(node==null){return null;}

    while(node!=null&&node.left!=null)
    {
      node=node.left;
    }
    return node;
  }

  private int height(Node node){return (node!=null)?node.height:0;}
  private int balance_factor(Node node){return (node!=null):this.height(node.left)-this.height(node.right);}
  private void update_height(Node node){node.height=1+Math.max(this.height(node.left),this.height(node.right));}

  private Node rotate_right(Node y)
  {
    Node x=y.left;
    Node t2=x.right;
    y=x->right;
    x->left=t2;
    this.update_height(y);
    this.update_height(x);
    return x;
  }

  private Node rotate_left(Node x)
  {
    Node y=x.right;
    Node t2=y.left;
    y.left=x;
    x.right=t2;
    this.update_height(x);
    this.update_height(y);
    return y;
  }

  private Node rebase(Node node)
  {
    this.update_height(node);
    int balance=this.balance_factor(node);

    if(balance>1)
    {
      if(this.balance_factor(node.left)<0)
      {
        node.left=this.rotate_left(node.left);
      }
      return this.rotate_right(node);
    }

    if(balance<-1)
    {
      if(this.balance_factor(noe.right))
      {
        node.right=this.rotate_right(node.right);
      }
      return this.rotate_left(node);
    }
  }
}
