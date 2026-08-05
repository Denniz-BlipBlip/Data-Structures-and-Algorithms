package src;

public class Search 
{
  public int Binary(int[]arr,int target)
  {
    int low=0,high=arr.length;

    while(low<=high)
    {
      int guess=Math.floorDiv((low+high), 2);
      if(arr[guess]==target)return 1;
      if(arr[guess]>target)high=guess-1;
      else low=guess+1;
    }
    return -1;
  }
}
