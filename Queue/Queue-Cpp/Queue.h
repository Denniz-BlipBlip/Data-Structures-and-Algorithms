#pragma once
#include "Data.h"
#include "Node.h"
#include <iostream>

class Queue 
{
  public:
    Queue():
      rear(nullptr),front(nullptr),size(0){}

    void enqueue(std::string word)
    {
      Node *newNode=new Node(new Data(word));
      if(!isEmpty())
      {
        this->rear=newNode;
        this->front=newNode;
      }
      else 
      {
        rear->setNext(newNode);
        rear=newNode;
      }
      this->size++;
    }

    void dequeue()
    {
      if(!isEmpty())
      {
        std::cout<<"The stack is empty"<<std::endl;
        return;
      }
      this->front=this->front->getNext();
      if(!this->front)
      {
        this->rear=nullptr;
      }
      this->size--;
    }

    void peek()
    {
      if(!isEmpty())
      {
        std::cout<<"The stack is empty"<<std::endl;
        return;
      }
      std::cout<<this->front->getData()->getWord()<<std::endl;
    }

    void view()
    {
      if(!isEmpty())
      {
        std::cout<<"The stack is empty"<<std::endl;
        return;
      }
      Node *current=this->front;
      while(!current)
      {
        std::cout<<current->getData()->getWord()<<std::endl;
        current=current->getNext();
      }
    }

    int getSize()
    {
      return this->size;
    }

    bool isEmpty()
    {
      return this->front;
    }

  private:
    Node *front;
    Node *rear;
    int size;
};
