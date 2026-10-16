package AVL;

public class Tree 
{
  private Node find_min(Node node)
  {
    while(!this.isEmpty(node)&&!this.isEmpty(node.get_left()))node=node.get_left();
    return node;
  }

  private Node remove(Node node,int id)
  {
    if(this.isEmpty(node))return null;
    else if(id>node.get_data().get_id())node.set_right(this.remove(node.get_right(), id));
    else 
    {
      if(id<node.get_data().get_id())node.set_left(this.remove(node.get_left(), id));
      if(this.isEmpty(node.get_right())&&this.isEmpty(node.get_right()))return null;
      if(this.isEmpty(node.get_right()))return node.get_left();
      if(this.isEmpty(node.get_left()))return node.get_right();

      Node temp=this.find_min(node.get_right());
      temp.set_data(node.get_data());
      node.set_right(this.remove(node.get_right(), temp.get_data().get_id()));
    }
    return this.rebase(node);
  }

  private Node insert(Node node,String data,int id)
  {
    if(this.isEmpty(node))return new Node(new Data(data, id));
    if(id>node.get_data().get_id())node.set_right(this.insert(node.get_right(), data, id));
    if(id<node.get_data().get_id())node.set_left(this.insert(node.get_left(), data, id));
    return this.rebase(node);
  }

  private Node rebase(Node node)
  {
    this.update_heigth(node);
    int balance=this.balance_factor(node);
    if(balance>1)
    {
      if(this.balance_factor(node)<0)
      {
        node.set_left(this.rotate_left(node.get_left()));
      }
      return this.rotate_right(node);
    }

    if(balance<-1)
    {
      if(this.balance_factor(node)>0)
      {
        node.set_right(this.rotate_right(node.get_right()));
      }
      return this.rotate_left(node);
    }

    return node;
  }

  private Node rotate_left(Node x)
  {
    Node y=x.get_right(),t2=y.get_left();
    y.set_left(x);
    x.set_right(t2);
    this.update_heigth(x);
    this.update_heigth(y);
    return y;
  }

  private Node rotate_right(Node y)
  {
    Node x=y.get_left(),t2=x.get_right();
    x.set_right(y);
    y.set_left(t2);
    this.update_heigth(y);
    this.update_heigth(x);
    return x;
  }

  private void update_heigth(Node node)
  {
    node.set_height(1+Math.max(this.height(node.get_left()), this.height(node.get_right())));
  }

  private int balance_factor(Node node)
  {
    return !this.isEmpty(node)?(this.height(node.get_left())-this.height(node.get_right())):0;
  }

  private int height(Node  node){return !this.isEmpty(node)?node.get_height():0;}
  private boolean isEmpty(Node node){return node==null;}
  private Node root;
}
