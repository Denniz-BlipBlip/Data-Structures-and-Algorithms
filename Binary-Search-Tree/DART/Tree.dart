import 'dart:math';

import 'Data.dart';
import 'Node.dart';

class Tree 
{
  int _height(Node? node){return (node!=null)?node.height:0;}
  int _balance_factor(Node? node){return (node!=null)?(this._height(node.left)-this._height(node.right)):0;}
  void _update_height(Node? node){node?.height(1+max(this._height(node?.left),this._height(node?.right)));}

  Node? rotate_left(Node? x)
  {
    Node? y=x?.right;
    Node? t2=y?.left;
    y?.left=x;
    x?.right=t2;
    this._update_height(x);
    this._update_height(y);
    return y;
  }

  Node? rotate_right(Node? y)
  {
    Node? x=y?.left;
    Node? t2=x?.right;
    x?.right=y;
    y?.left=t2;
    this._update_height(y);
    this._update_height(x);
    return x;
  }

  Node? _re_balance(Node? node)
  {
    this._update_height(node);
    int balance=this._balance_factor(node);
    if(balance>1)
    {
      if(this._balance_factor(node?.left)<0)
      {
        node?.left=this.rotate_left(node?.left);
      }
      return this.rotate_right(node);
    }

    if(balance<-1)
    {
      if(this._balance_factor(node?.right)<0)
      {
        node?.right=this.rotate_right(node?.right);
      }
      return this.rotate_left(node);
    }
    return node;
  }
}
