#include "Sort.h"
#include <iostream>

int main()
{
  int array[]={9,8,7,6,5,4,3,2,1};

  bubbleSort(array);

  for(int i:array)
  {
    std::cout<<i;
  }
  
  return 0;
}
