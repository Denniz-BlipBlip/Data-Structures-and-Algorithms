using System;
using System.Collections.Generic;

namespace Sort
{
  class App
  {
    static void Main()
    {
      Sort sort=new Sort();
      List<int>arr=new List<int>{9,8,7,6,5,4,3,2,1};

      sort.selection_sort(arr);
      foreach(int i in arr)
      {
        Console.Write(i);
      }
    }
  }
}
