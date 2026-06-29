#pragma once
#include <iostream>
#include <vector>

void reverseString(std::string word)
{
  int len=word.size();
  std::string rev="";
  for(int i=len-1;i>=0;i--)
  {
    rev=rev+word[i];
  }
  std::cout<<rev<<std::endl;
}

void reverseArr(std::vector<int>&arr)
{
  int len=arr.size();
  int left=0;

  for(int i=len-1;i>0;i--)
  {
    int temp=arr[left];
    arr[left]=arr[i];
    arr[i]=temp;
    left++;
  }

  for(int i=0;i<len;i++)
  {
    std::cout<<arr[i];
  }
}
