import 'Data.dart';

class Node 
{
  Node(this._data);

  get rigth=>this._right;
  get left=>this._left;
  get data=>this._data;
  get height=>this._height;
  set height(int n){this._height=n;}
  set data(Data data){this._data=data;}
  set right(Node node){this._right=node;}
  set left(Node node){this._left=node;}

  Data _data;
  Node? _right,_left;
  int _height=1;
}
