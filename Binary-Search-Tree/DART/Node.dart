import 'Data.dart';

class Node 
{
  Node(this._data);

  get data=>this._data;
  set data(Data data){this._data=data;}
  get right=>this._right;
  set right(Node? node){this._right=node;}
  get left=>this._left;
  set left(Node? node){this._left=node;}
  get height=>this._height;
  set height(int n){this._height=n;}

  Node? _right,_left;
  int _height=1;
  Data _data;
}
