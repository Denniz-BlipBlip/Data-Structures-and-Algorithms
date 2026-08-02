import 'Data.dart';
import 'Node.dart';

class Tree 
{
  void push(String data)
  {
    Node? node=new Node(new Data(data));
    node.next=this._top;
    this._top=node;
  }

  void pop()
  {
    if(this._isEmpty())return;
    this._top=this._top?.next;
  }

  void peek()
  {
    if(this._isEmpty())return;
    print(this._top?.data?.data);
  }

  bool _isEmpty()=>this._top==null;
  Node? _top;
}
