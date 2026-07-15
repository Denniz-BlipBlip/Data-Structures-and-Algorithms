#pragma once
#include "Data.hpp"

class Node 
{
  public:
    Node(Data *data):
      data(data),right(nullptr),left(nullptr),height(1){}

  private:
    Node *right;
    Node *left;
    Data *data;
    int height;
};
