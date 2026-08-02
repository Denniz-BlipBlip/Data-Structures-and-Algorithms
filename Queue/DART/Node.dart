import 'Data.dart';

class Node 
{
  Node(this._data);
  get data=>this._data;
  get next=>this._next;
  set next(Node? node){this._data=data;}
  Node? _next;
  Data _data;
}
