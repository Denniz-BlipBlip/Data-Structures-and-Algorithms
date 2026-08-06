package src;

public class Search 
{
  public int linear(int[]arr,int target)
  {
    int len=arr.length;

    for(int i=0;i<len;i++)
    {
      if(arr[i]==target)return 1;
    }
    return -1;
  }
}
