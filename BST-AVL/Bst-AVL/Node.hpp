#pragma once

#include "Data.hpp"
struct Node 
{
  Node(Data *data):
    height(1),right(nullptr),left(nullptr),data(data){}

  Node *right;
  Node *left;
  Data *data;
  int height;
};
