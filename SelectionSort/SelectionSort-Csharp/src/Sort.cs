using System;
using System.Collections.Generic;

namespace Sort 
{
  class Sort 
  {
    public void selection_sort(List<int>arr)
    {
      int n=arr.Count;
      
      for(int i=0;i<n;i++)
      {
        for(int j=i+1;j<n;j++)
        {
          int min=i;
 
          if(arr[j]<arr[min])
          {
            min=j;
          }

          int temp=arr[i];
          arr[i]=arr[min];
          arr[min]=temp;
        }
      }
    }
  }
}
