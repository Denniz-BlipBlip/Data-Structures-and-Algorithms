import src.Search;

public class App {
    public static void main(String[] args) {
      Search a=new Search();

      int[]arr=new int[1000];
      int len=arr.length,target=600;
      for(int i=0;i<len;i++){arr[i]=i;}

      System.out.println(a.linear(arr, target));
    }
}
