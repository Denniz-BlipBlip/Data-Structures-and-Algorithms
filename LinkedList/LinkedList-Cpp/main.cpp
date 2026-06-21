#include "LinkedList.h"
#include <iostream>

int main()
{
  LinkedList *list=new LinkedList();
  list->addRear("Denniz");
  list->addFront("Flores");
  int index=9;
  list->insertAt("Jojo", index);
  list->view();
  delete list;
}
