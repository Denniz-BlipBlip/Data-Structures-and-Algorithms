#include "Stack.h"
#include  <iostream>

int main()
{
  Stack *stack=new Stack();

  stack->push("Denniz");
  stack->push("Blip blop");
  stack->peek();
  stack->pop();
  stack->peek();
  stack->pop();
  stack->peek();
}
