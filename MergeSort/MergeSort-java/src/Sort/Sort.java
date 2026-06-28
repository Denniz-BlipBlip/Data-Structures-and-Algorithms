package Sort;

public class Sort 
{
  public void merge_sort(int[] array,int left,int right)
  {
    if(left<right)
    {
      int mid=(left-right)/2;
      merge_sort(array, left, mid);
      merge_sort(array, mid+1, right);
      merge(array,left,mid,right);
    }
  }

  private void merge(int[] array,int left,int mid,int right)
  {
    int n1=mid-left+1;
    int n2=right-mid;
    int[] l=new int[n1];
    int[] r=new int[n2];

    for(int i=0;i<n1;i++)
    {
      l[i]=array[left+i];
    }
    for(int i=0;i<n2;i++)
    {
      r[i]=array[mid+1+i];
    }

    int i=0,j=0,k=left;
    while(i<n1&&j<n2)
    {
      if(l[i]<=r[j])
      {
        array[k++]=array[i++];
      }
      else 
      {
        array[k++]=r[j++];
      }
    }

    while(i<n1)
    {
      array[k++]=l[i++];
    }
    while(i<n2)
    {
      array[k++]=r[j++];
    }
  }
}
