#include<iostream>

class Data 
{
  public:
    Data(std::string word,int &id):
      id(id),word(word){}

    std::string getWord(){return this->word;}
    int getId(){return this->id;}
    void setId(int id){this->id=id;}
    void setWord(std::string word){this->word=word;}

  private:
    std::string word;
    int id;
};

class Node 
{
  public:
    Node(Data *data):
      data(data),right(nullptr),left(nullptr){}

    Node *getRight(){return this->right;}
    Node *getLeft(){return this->left;}
    Node *setRight(Node *node){return this->right=node;}
    Node *setLeft(Node *node){return this->left=node;}
    Data *getData(){return this->data;}

  private:
    Data *data;
    Node *right;
    Node *left;
};

class Tree 
{
  public:
    void insert(std::string word,int &id)
    {
      this->root=insert(this->root,word,id);
    }

    void deleteWord(int &id)
    {
      this->root=deleteNode(this->root,id);
    }

    void inorder()
    {
      inorder(this->root);
    }

    void search(int &id)
    {
      find(this->root,id);
    }

  private:
    Node *root;

    Tree():root(nullptr){}

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

    Node *deleteNode(Node *root,int id)
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
        if(!root->getRight()&&!root->getLeft())
        {
          return nullptr;
        }
        else if(!root->getRight())
        {
          Node *temp=root->getLeft();
          delete root;
          return temp;
        }
        else if(!root->getLeft())
        {
          Node *temp=root->getRight();
          delete root;
          return temp;
        }
        else 
        {
          Node *temp=findMin(root->getRight());
          root->getData()->setId(temp->getData()->getId());
          root->getData()->setWord(temp->getData()->getWord());
          return root->setRight(deleteNode(root->getRight(),temp->getData()->getId()));
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

    void inorder(Node *root)
    {
      if(!root){return;}
      inorder(root->getLeft());
      std::cout<<root->getData()->getWord()<<std::endl;
      inorder(root->getRight());
    }

    void find(Node *root,int &id)
    {
      if(!root){return;}
      if(id>root->getData()->getId())
      {
        return find(root->getRight(),id);
      }
      else if(id<root->getData()->getId())
      {
        return find(root->getLeft(),id);
      }
      else 
      {
        std::cout<<root->getData()->getWord()<<std::endl;
      }
    }
};

int main()
{
  return 0;
}
