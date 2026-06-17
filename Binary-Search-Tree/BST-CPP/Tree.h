#pragma once
#include "Data.h"
#include "Node.h"
#include<iostream>

class Tree 
{
  public:

    Tree():root(nullptr){}

    void insert(std::string word,int id)
    {
      this->root=insert(this->root,word,id);
    }

    void removeWord(int id)
    {
      this->root=deleteNode(this->root,id);
    }

    void searchWord(int &id)
    {
      search(this->root,id);
    }

    void inorder()
    {
      inorder(this->root);
    }

  private:

    Node *insert(Node *root,std::string word,int &id)
    {
      if(!root){return new Node(new Data(word,id));}
      if(id>root->getData()->getId())
      {
        return root->setRight(insert(root->getRight(),word,id));
      }
      else 
      {
        return root->setLeft(insert(root->getLeft(),word,id));
      }
    }

    void inorder(Node *root)
    {
      if(!root){return;}
      inorder(root->getLeft());
      std::cout<<root->getData()->getWord()<<std::endl;
      inorder(root->getRight());
    }

    void search(Node *root,int &id)
    {
      if(!root){return;}
      if(id>root->getData()->getId())
      {
        return search(root->getRight(),id);
      }
      else if(id<root->getData()->getId())
      {
        return search(root->getLeft(),id);
      }
      else 
      {
        std::cout<<root->getData()->getWord()<<std::endl;
      }
    }

    Node *deleteNode(Node *root,int &id)
    {
      if(!root){return nullptr;}
      if(id>root->getData()->getId())
      {
        return root->setRight(deleteNode(root->getRight(),id));
      }
      else if(id<root->getData()->getId())
      {
        return root->setLeft(deleteNode(root->getLeft(),id));
      }
      else 
      {
        if(!root->getRight()&&root->getLeft())
        {
          return nullptr;
        }
        else if(!root->getRight())
        {
          Node *temp=root->getLeft();
          delete root->getData();
          delete root;
          return temp;
        }
        else if(!root->getLeft())
        {
          Node *temp=root->getRight();
          delete root->getData();
          delete root;
          return temp;
        }
        else 
        {
          Node *temp=findMin(root->getRight());
          root->getData()->setWord(temp->getData()->getWord());
          root->getData()->setId(temp->getData()->getId());
          return root->setRight(deleteNode(root->getRight(),id));
        }
      }
    }

    Node *findMin(Node *root)
    {
      if(!root){return nullptr;}
      while(root&&root->getLeft())
      {
        root=root->getLeft();
      }
      return root;
    }

    Node *root;
};
