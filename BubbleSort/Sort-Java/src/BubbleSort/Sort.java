package Sort;

public class Sort
{
  public void bubbleSort(int[] array)
  {
    int n=array.length;

    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n-i-1;j++)
      {
        if(array[j]>array[j+1])
        {
          int temp=array[j];
          array[j]=array[j+1];
          array[j+1]=temp;
        }
      }
    }
  }
}
