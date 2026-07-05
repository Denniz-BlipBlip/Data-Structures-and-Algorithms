using System;
using System.Collections.Generic;

namespace Sort 
{
  class Sort 
  {
    public void bubble_sort(List<int>arr)
    {
      int n=arr.Count+1;

      for(int i=1;i<n;i++)
      {
        for(int j=0;j<n-i-1;j++)
        {
          if(arr[j]>arr[j+1])
          {
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
          }
        }
      }

      foreach(int i in arr)
      {
        Console.Write(i);
      }
    }
  }
}
