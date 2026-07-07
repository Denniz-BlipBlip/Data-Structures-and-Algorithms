#include "Tree.h"

int main()
{
  
  Tree *bst=new Tree();

  bst->insert("Denniz",10);

  bst->inorder();

  return 0;
}
