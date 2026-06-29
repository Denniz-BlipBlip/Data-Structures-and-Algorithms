import Reverse.Reverse;

public class App 
{
  public static void main(String[] args) {
    Reverse rev=new Reverse();

    String word="Apple";

    rev.reverseString(word);

    int[] arr={1,2,3,4,5,6,7,8,9};

    rev.reverseArr(arr);
  }
}
