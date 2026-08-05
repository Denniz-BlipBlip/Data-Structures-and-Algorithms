import src.Search;

public class App 
{
    public static void main(String[] args) 
    {
      int[]arr=new int[100];
      for(int i=0;i<arr.length;i++)
      {
        arr[i]=i;
      }

      int target=89;
      Search a=new Search();
      System.out.println(a.Binary(arr, target));
    }
}
