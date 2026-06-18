#pragma once
#include <iostream>

void bubbleSort(int array[])
{
  int n=sizeof(array)/sizeof(array[0]);

  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n-i-1;j++)
    {
      if(array[j]>array[j+1])
      {
        int temp=array[j];
        array[j]=array[j+1];
        array[j+1]=temp;
      }
    }
  }
}
