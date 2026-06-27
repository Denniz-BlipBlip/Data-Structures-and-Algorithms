package Sort;

public class Sort 
{
  public void merge_sort(int[] array,int left,int right)
  {
    if(right<left)
    {
      int mid=(right+left)/2;
      merge_sort(array,left,mid);
      merge_sort(array,mid+1,right);
      merge(array,mid,right,left);
    }
  }

  public void merge(int[] array,int mid,int right,int left)
  {
    int n1=mid-left+1;
    int n2=right-mid;
    int[] l=new int[n1];
    int[] r=new int[n2];

    for(int i=0;i<n1;i++)
    {
      l[i]=array[left+1];
    }
    for(int i=0;i<n2;i++)
    {
      r[n2]=array[right+1+i]
    }
  }
}
