#pragma once
#include "Data.h"
#include<iostream>

class Node 
{
  public:
    Node(Data *data):
      right(nullptr),left(nullptr),data(data){}

    Data *getData(){return this->data;}
    Node *getRight(){return this->right;}
    Node *getLeft(){return this->left;}
    Node *setRight(Node *node){return this->right=node;}
    Node *setLeft(Node *node){return this->left=node;}

  private:
    Node *right;
    Node *left;
    Data *data;
};
