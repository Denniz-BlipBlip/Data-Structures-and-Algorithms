#pragma once
#include "Node.h"
#include "Data.h"
#include <iostream>

class LinkedList 
{
  public:
    LinkedList():
      rear(nullptr),front(nullptr),size(0){}

    void addRear(std::string word)
    {
      Node *newNode=new Node(new Data(word));
      if(this->isEmpty())
      {
        this->rear=newNode;
        this->front=newNode;
      }
      else 
      {
        this->rear->setNext(newNode);
        this->rear=newNode;
      }
      this->size++;
    }

    void addFront(std::string word)
    {
      Node *newNode=new Node(new Data(word));
      if(this->isEmpty())
      {
        this->rear=newNode;
        this->front=newNode;
      }
      else 
      {
        newNode->setNext(this->front);
        this->front=newNode;
      }
      this->size++;
    }

    void removeFront()
    {
      if(this->isEmpty())
      {
        return;
      }
      this->front=this->front->getNext();
      if(!front)
      {
        this->rear=nullptr;
      }
      this->size--;
    }

    void removeRear()
    {
      if(this->isEmpty())
      {
        return;
      }
      
      if(this->front==this->rear)
      {
        this->rear=nullptr;
        this->front=nullptr;
        this->size--;
        return;
      }
      else 
    }

    void deleteAt(int &index)
    {

    }

    void insertAt(std::string word,int &index)
    {

    }

  private:
    bool isEmpty()
    {
      return !this->front;
    }

    Node *rear;
    Node *front;
    int size;
};
