#include "Sort/Sort.h"
#include <iostream>
#include <vector>

int main()
{
  std::vector<int> arr{9,8,7,6,5,4,3,2,1};

  quick_sort(arr, 0, arr.size()-1);

  for(int i:arr)
  {
    std::cout<<i;
  }
  return 0;
}
