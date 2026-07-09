using System.Collections.Generic;

namespace Sort
{
  class Sort
  {
    public void selection_sort(List<int>arr) 
    {
      int n=arr.Count;

      for(int i=1;i<n;i++)  
      {
        int key=arr[i];
        int j=i-1;
        while(j>=0&&arr[j]>key)
        {
          arr[j+1]=arr[j];
          j--;
        }
        arr[j+1]=key; 
      }
    }
  }
}
