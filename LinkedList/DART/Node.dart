import 'Data.dart';

class Node 
{
  Node(this._data);
  get data=>this._data;
  get next=>this._next;
  set next(Node? node){this._next=node;}
  Node? _next;
  final Data _data;
}
