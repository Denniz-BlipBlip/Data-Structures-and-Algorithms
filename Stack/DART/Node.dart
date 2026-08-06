import 'Data.dart';

class Node 
{
  Node(this._data);

  set next(Node? node){this._next=node;}
  get next=>this._next;
  get data=>this._data;
  Node? _next;
  final Data _data;
}
