#pragma once
#include "Data.h"
#include <iostream>

class Node 
{
  public:
    Node(Data *data):
      data(data),next(nullptr){}

    void setNext(Node *node){this->next=node;}
    Node *getNext(){return this->next;}
    Data *getData(){return this->data;}

  private:
    Data *data;
    Node *next;
};
