using System;
using src;

class App
{
  static void Main()
  {
    Stack stack = new Stack();

    stack.push("Denniz");
    stack.push("Flores");
    stack.peek();
    stack.pop();
    stack.peek();
  }
}
