#pragma once
#include "Node.h"
#include "Data.h"
#include <iostream>

class LinkedList 
{
  public:
    LinkedList():
      rear(nullptr),front(nullptr),size(0){}



  private:
    Node *rear;
    Node *front;
    int size;
};
