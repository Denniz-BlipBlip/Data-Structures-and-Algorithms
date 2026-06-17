#pragma once
#include "Data.h"
#include <iostream>

class Node 
{
  public:
    Node(Data *data):
      data(data),next(nullptr){}

    Node *getNext(){return this->next;}
    void setNext(Node *node){this->next=node;}
    Data *getData(){return this->data;}

  private:
    Data *data;
    Node *next;
};
