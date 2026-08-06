import src.Find;

public class App {
    public static void main(String[] args) {
      Find a=new Find();

      int[]arr=new int[1000];
      int len=arr.length;
      for(int i=0;i<len;i++){arr[i]=i;}

      int target=1100;
      System.out.println(a.interpolation(arr, target));
    }
}
