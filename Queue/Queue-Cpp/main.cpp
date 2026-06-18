#include "Queue.h"
#include <iostream>

int main()
{
  Queue *data=new Queue();

  data->enqueue("Denniz");
  data->enqueue("Dog");
  data->peek();
  data->dequeue();
  data->peek();
}
