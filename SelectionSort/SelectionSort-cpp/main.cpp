#include <iostream>
#include <vector>

void selection_sort(std::vector<int>arr)
{
  int len=arr.size()-1;

  for(int i=0;i<len;i++)
  {
    int min=i;
    for(int j=i+1;j<len;j++)
    {
      if(arr[j]<arr[min])
      {
        min=j;
      }
    }
    int temp=arr[i];
    arr[i]=arr[min];
    arr[min]=temp;
  }

  for(int i:arr)
  {
    std::cout<<i;
  }
}

int main()
{
  std::vector<int>arr={9,8,7,6,5,4,3,2,1};

  selection_sort(arr);

  for(int i:arr)
  {
    std::cout<<i;
  }
}
