import Sort.Sort;

public class App
{
  public static void main(String[] args) {
    Sort sort=new Sort();
    int[] array={9,8,7,6,5,4,3,2,1};
    
    sort.bubbleSort(array);

    for(int i:array)
    {
      System.out.print(i);
    }
  }
}
