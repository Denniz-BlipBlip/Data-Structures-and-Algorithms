import 'Data.dart';
import 'Node.dart';

class Queue 
{
  void enqueue(String data)
  {
    Node node=new Node(new Data(data));
    if(this._empty())
    {
      this._front=node;
      this._rear=node;
    }
    else 
    {
      this._rear?.next=node;
      this._rear=node;
    }
  }

  void dequeue()
  {
    if(this._empty())return;

    this._front=this._front?.next;
    if(this._front==null)
    {
      this._rear=null;
    }
  }

  void peek()
  {
    if(this._empty())return;

    print(this._front?.data?.data);
  }

  bool _empty(){return this._front==null;}
  Node? _rear,_front;
}
