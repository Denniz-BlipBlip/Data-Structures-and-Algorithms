#pragma once
#include "Data.h"
#include <iostream>

class Node 
{
  public:
    Node(Data *data):
      data(data),next(nullptr){}

    Data *getData(){return this->data;}
    Node *getNext(){return this->next;}
    void setNext(Node *next){this->next=next;}

  private:
    Data *data;
    Node *next;
};
