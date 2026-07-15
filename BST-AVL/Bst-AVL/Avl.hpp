#pragma once
#include "Data.hpp"
#include "Node.hpp"
#include <iostream>

class Avl 
{
  public:
    Avl():
      root(nullptr){}

    void insert(std::string data,int id)
    {
      this->root=this->insert(this->root,data,id);
    }

    void remove(int id)
    {
      this->root=this->remove(this->root,id);
    }

    void traversal()
    {
      this->traversal(this->root);
    }

  private:
    Node *insert(Node root,std::string &data,int &id)
    {
      return root;
    }

    height(Node root)
    {

    }

    Node *root;
};
