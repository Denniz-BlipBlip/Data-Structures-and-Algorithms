#include "Sort/Sort.h"
#include <iostream>

int main()
{
  int array[]={9,8,7,6,5,4,3,2,1};
  int n=sizeof(array)/sizeof(array[0]);

  insertion_sort(array,n);

  for(int i:array)
  {
    std::cout<<i;
  }
  return 0;
}
