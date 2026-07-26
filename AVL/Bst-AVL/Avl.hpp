#pragma once
#include "Data.hpp"
#include "Node.hpp"
#include <algorithm>
#include <cstddef>
#include <cstdio>
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
    Node *insert(Node *root,std::string &data,int &id)
    {
      if(!root){return new Node(new Data(data,id));}

      if(id>root->data->get_id())
      {
        return root->right=insert(root->right,data,id);
      }
      else if(id>root->data->get_id())
      {
        return root->left=insert(root->left,data,id);
      }
      else 
      {
        return nullptr;
      }

      return this->re_balance(root);
    }

    Node *remove(Node *root,int id)
    {
      if(!root)
      {
        return  nullptr;
      }

      if(id>root->data->get_id())
      {
        return root->right=remove(root->right,id);
      }
      else if(id<root->data->get_id())
      {
        return root->left=remove(root->left,id);
      }
      else 
      {
        if(!root->right)
        {
          Node *temp=root->left;
          delete root->data;
          delete root;
          return temp;
        }
        else if(!root->left)
        {
          Node *temp=root->right;
          delete root->data;
          delete root;
          return temp;
        }
        else 
        {
          Node *temp=this->findMin(root->right);
          root->data->set_data(temp->data->get_data());
          root->data->set_id(temp->data->get_id());
          return root->right=remove(root->right,temp->data->get_id());
        }
      }

      return re_balance(root);
    }

    Node *findMin(Node *root)
    {
      if(!root)
      {
        return nullptr;
      }

      while(!root&&root->left)
      {
        root=root->left;
      }
      return root;
    }

    int height(Node *root) const
    {
      return root ? root->height : 0;
    }

    int balance_factor(Node *root) const
    {
      return root ? this->height(root->left) - this->height(root->right):0;
    }

    void update_height(Node *right)
    {
      root->height=1+std::max(this->height(root->left),this->height(root->right));
    }

    Node *rotate_right(Node *y)
    {
      Node *x=y->left;
      Node *t2=x->right;

      x->right=y;
      y->left=t2;

      this->update_height(y);
      this->update_height(x);

      return x;
    }

    Node *rotate_left(Node *x)
    {
      Node *y=x->right;
      Node *t2=y->left;

      y->left=x;
      x->right=t2;

      this->update_height(x);
      this->update_height(y);

      return y;
    }

    Node *re_balance(Node *root)
    {
      this->update_height(root);
      int balance=this->balance_factor(root);

      if(balance>1)
      {
        if(this->balance_factor(root->left)<0)
        {
          root->left=this->rotate_left(root->left);
        }
        return this->rotate_right(root);
      }

      if(balance<-1)
      {
        if(balance_factor(root->right)<0)
        {
          root->right=this->rotate_right(root->right);
        }
        return this->rotate_left(root);
      }

      return root;
    }

    void traversal(Node *root)
    {
      if(!root)
      {
        return;
      }

      traversal(root->right);
      std::cout<<root->data->get_data()<<std::endl;
      traversal(root->right);
    }

    Node *root;
};
