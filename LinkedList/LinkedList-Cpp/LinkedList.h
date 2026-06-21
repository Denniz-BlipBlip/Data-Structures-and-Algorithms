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

      Node *temp=this->front;
      this->front=this->front->getNext();
      if(!front)
      {
        this->rear=nullptr;
      }
      delete temp->getData();
      delete temp;
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
        delete this->front->getData();
        delete this->front;
        this->rear=nullptr;
        this->front=nullptr;
        this->size--;
        return;
      }

      Node *current=this->front->getNext();
      while(current->getNext()!=this->rear)
      {
        current=current->getNext();
      }
      
      delete this->rear->getData();
      delete rear;
      current->setNext(nullptr);
      this->rear=current;
      this->size--;
    }

    void deleteAt(int index)
    {
      if(index==0)
      {
        this->removeFront();
        return;
      }
      else if(index==this->size-1)
      {
        this->removeRear();
        return;
      }
      int count=0;
      Node *current=this->front;
      while(count<index-1)
      {
        current=current->getNext();
        count++;
      }

      Node *temp=current->getNext();
      current->setNext(temp->getNext());
      delete temp->getData();
      delete temp;
      this->size--;
    }

    void insertAt(std::string word,int index)
    {
      if(index==0)
      {
        this->addFront(word);
        return;
      }
      else if(index>=this->size)
      {
        this->addRear(word);
        return;
      }

      int count=0;
      Node *newNode=new Node(new Data(word));
      Node *current=this->front;
      while(count<index-1)
      {
        current=current->getNext();
        count++;
      }
      Node *temp=current->getNext();
      current->setNext(newNode);
      newNode->setNext(temp);
      this->size++;
    }

    void view()
    {
      if(this->isEmpty())
      {
        return;
      }

      Node *current=this->front;
      while(current)
      {
        std::cout<<current->getData()->getWord()<<std::endl;
        current=current->getNext();
      }
    }

    int getSize()
    {
      return this->size;
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
