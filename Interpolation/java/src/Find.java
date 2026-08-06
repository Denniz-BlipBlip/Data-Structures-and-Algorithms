package src;

public class Find 
{
  public int interpolation(int[]arr,int target)
  {
    int low=0,high=arr.length-1;

    while(low<=high)
    {
      int guess=low+((target-arr[low])*(high-low)/(arr[high]-arr[low]));
      if(guess>high)guess=high;
      if(guess<low)guess=low;
      if(arr[guess]==target)return 1;
      if(arr[guess]>high)high=guess-1;
      else low=guess+1;
    }
    return -1;
  }
}
