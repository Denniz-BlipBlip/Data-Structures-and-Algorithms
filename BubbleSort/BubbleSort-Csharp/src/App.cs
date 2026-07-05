using System.Collections.Generic;

namespace Sort
{
  class App
  {
    static void Main()
    {
      List<int>arr=new List<int>{9,8,7,6,5,4,3,2,1};

      Sort sort=new Sort();

      sort.bubble_sort(arr);
    }
  }
}
