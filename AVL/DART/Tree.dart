import 'dart:math';

import 'Node.dart';
import 'Data.dart';

class Tree 
{
  int _height(Node? node)
  {
    return (node!=null)?node.height:0;
  }

  int _balance_factor(Node? node)
  {
    return (node!=null)?this._height(node.left)-this._height(node.rigth):0;
  }

  void _update_height(Node? node)
  {
    node?.height=1+max(this._height(node.left), this._height(node.rigth));
  }

  Node? rotate_rigth(Node? y)
  {
    Node? x=y?.left;
    Node? t2=x?.right;
    x?.right=y;
    y?.left=t2;
    this._update_height(y);
    this._update_height(x);
    return x;
  }
}
