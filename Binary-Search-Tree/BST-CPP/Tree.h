#pragma once
#include "Node.h"
#include<iostream>

class Tree 
{
  public:
    Tree():root(nullptr);

    void insert(std::string word,int &id)
    {
      this->root=inser(this->root,word,id);
    }

    void removeWord(int &id)
    {
      this->root=deleteNode(this->root,id);
    }

    void searchWord(int &id)
    {
      search(thois->root);
    }

    void inorder()
    {
      inorder(this->root);
    }

  private:

};
