#pragma once
#include <iostream>

class Node
{
  public:
    Node(Data *data):
      right(nullptr),left(nullptr),data(data){}

    Node get_right(){return this->right;}
    Node get_left(){return this->left;}
};
