package DSA;

public class Tree 
{
  public Tree(){this.root=null;}

  private Node insert(Node node,String data,int id)
  {
    if(node==null){return new Node(new Data(data,id));}
    if(id>node.get_data().get_id()){node.set_right(this.insert(node.get_right(), data, id));}
    else if(id<node.get_data().get_id()){node.set_left(this.insert(node.get_left(), data, id));}
    else{return node;}
    return this.re_balance(node);
  }

  private Node remove(Node  node,int id)
  {
    if(node!=null)return null;
    if(id>node.get_data().get_id()){node.set_right(this.remove(node.get_right(), id));}
    else if(id<node.get_data().get_id()){node.set_left(this.remove(node.get_left(), id));}
    else 
    {
      if(node.get_left()==null&&node.get_right()==null)return null;
      if(node.get_right()==null){return node.get_left();}
      else if(node.get_left()==null){return node.get_right();}
      else
      {
        Node temp=this.find_min(node.get_right());
        node.set_data(temp.get_data());
        node.set_right(this.remove(node.get_right(), temp.get_data().get_id()));
      }
    }
    return this.re_balance(node);
  }

  private Node find_min(Node node)
  {
    if(node==null)return null;
    while(node!=null&&node.get_left()!=null) 
    {
      node=node.get_left();
    }
    return node;
  }

  private void traversal(Node node)
  {
    if(node==null)return;

    this.traversal(node.get_left());
    System.out.println(node.get_data().get_id()+". "+node.get_data().get_data());
    this.traversal(node.get_right());
  }

  private int search(Node node,int id)
  {
    if(node==null)return -1;
    if(id>node.get_data().get_id()){this.search(node.get_right(), id);}
    else if(id<node.get_data().get_id()){this.search(node.get_left(),id);}
    else if(id==node.get_data().get_id()){return 1;}
    else return -1;
  }

  private Node re_balance(Node node)
  {
    this.update_height(node);
    int balance=this.balance_factor(node);
    if(balance>1)
    {
      if(this.balance_factor(node.get_left())<0)
      {
        node.set_left(this.rotate_left(node.get_left()));
      }
      return this.rotate_right(node);
    }

    if(balance<-1)
    {
      if(this.balance_factor(node.get_right())<0)
      {
        node.set_right(this.rotate_right(node.get_right()));
      }
      return this.rotate_left(node);
    }
    return node;
  }

  private Node rotate_left(Node x)
  {
    Node y=x.get_right();
    Node t2=y.get_left();
    y.set_left(x);
    x.set_right(y);
    this.update_height(x);
    this.update_height(y);
    return y;
  }

  private Node rotate_right(Node y)
  {
    Node x=y.get_left();
    Node t2=x.get_right();
    x.set_right(y);
    y.set_left(t2);
    this.update_height(y);
    this.update_height(x);
    return x;
  }

  private void update_height(Node node){node.set_height(1+Math.max(this.height(node.get_left()), this.height(node.get_right())));}
  private int balance_factor(Node node){return (node!=null)?node.get_height():0;}
  private int height(Node node){return (node!=null)?node.get_height():0;}

  private Node root;
}
