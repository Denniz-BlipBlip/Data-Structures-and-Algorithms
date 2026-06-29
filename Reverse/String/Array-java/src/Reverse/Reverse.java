package Reverse;

public class Reverse 
{
  public void reverseString(String word)
  {
    int len=word.length();
    String reverse=" ";

    for(int i=len-1;i>=0;i--)
    {
      reverse=reverse+word.charAt(i);
    }
    System.out.println(reverse);
  }

  public void reverseArr(int[] arr)
  {
    int len=arr.length-1;
    int left=0;

    for(int i=len;i>=0;i--)
    {
      int temp=arr[left];
      arr[left]=arr[i];
      arr[i]=temp;
      left++;
    }

    for(int i:arr)
    {
      System.out.print(i);
    }
  }
}
