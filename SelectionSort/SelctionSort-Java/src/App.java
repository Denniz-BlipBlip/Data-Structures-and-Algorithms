import Sort.Sort;

public class App 
{
  public static void main(String[] args)
  {
    Sort sort=new Sort();

    int[] arr={9,8,7,6,5,4,3,2,1};

    sort.selection_sort(arr);

    for(int i:arr)
    {
      System.out.print(i);
    }
  }
}
