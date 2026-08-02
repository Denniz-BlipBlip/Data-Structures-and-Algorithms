import 'dart:io';

import 'Node.dart';
import 'Data.dart';

class Link 
{
  void push_front(String data)
  {
    Node node=new Node(new Data(data));
    if(this._empty())
    {
      this._front=node;
      this._rear=node;
    }
    else 
    {
      node.next=this._front;
      this._front=node;
    }
    this._size++;
  }

  void push_back(String data)
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
    this._size++;
  }

  void push_at(int index,String data)
  {
    if(index<0)return;
    if(index==0)
    {
      this.push_front(data);
      return;
    }
    if(index==this._size)
    {
      this.push_back(data);
      return;
    }
    int n=0;
    Node node=new Node(new Data(data));
    Node? curr=this._front;
    while(n<index){curr=curr?.next;}
    curr?.next=node;
    node.next=curr;
    this._size++;
  }

  void remove_back()
  {
    if(this._empty())return;
    if(this._rear==this._front)
    {
      this._rear=null;
      this._front=null;
      this._size--;
      return;
    }

    Node? curr=this._front?.next;
    while(curr!=this._rear){curr=curr?.next;}
    curr?.next=null;
    this._rear=null;
    this._size--;
  }

  void remove_front()
  {
    if(this._empty())return;

    this._front=this._front?.next;
    if(this._front==null){this._rear=null;}
    this._size--;
  }

  void remove_at(int index)
  {
    if(this._empty())return;
    if(index<0||index>this._size)return;
    if(index==0)
    {
      this.remove_front();
      return;
    }
    if(index==this._size)
    {
      this.remove_back();
      return;
    }
    int n=0;
    Node? curr=this._front;
    while(n<index){curr=curr?.next;}
    curr?.next=curr.next?.next;
    this._size--;
  }

  void view()
  {
    if(this._empty())return;
    Node? curr=this._front;
    while(curr!=null)
    {
      print(curr.data?.data);
      curr=curr.next;
    }
  }

  void reverse()
  {
    Node? curr=this._front,prev,oVal=this._front;

    while(curr!=null)
    {
      Node? temp=curr.next;
      curr.next=prev;
      prev=curr;
      curr=temp;
    }
    this._front=oVal;
    this._rear=prev;
  }

  int search(String data)
  {
    if(this._empty())return -1;
    Node? curr=this._front;
    while(curr!=null)
    {
      if(curr?.data.data==data){return 1;}
      curr=curr?.next;
    }
    return -1;
  }

  bool _empty()=>this._front==null;
  Node? _rear,_front;
  int _size=0;
}
