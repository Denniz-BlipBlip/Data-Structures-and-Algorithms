#pragma once
#include "Data.h"
#include "Node.h"
#include <iostream>

class Stack
{
  public:
    Stack():top(nullptr){}

    void push(std::string word)
    {
      Node *newNode=new Node(new Data(word));
      newNode->setNext(top);
      top=newNode;
    }

    void peek()
    {
      if(!this->top)
      {
        std::cout<<"The Stack is empty"<<std::endl;
        return;
      }
      std::cout<<this->top->getData()->getWord()<<std::endl;
    }

    void pop()
    {
      if(!this->top)
      {
        std::cout<<"The stack is empty"<<std::endl;
        return;
      }
      this->top=top->getNext();
    }

  private:
    Node *top;
};
