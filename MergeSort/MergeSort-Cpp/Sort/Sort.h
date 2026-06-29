#pragma once
#include <iostream>

void mergeSort(int arr[],int left,int right)
{
  if(left<right)
  {
    int mid=(right-left)/2;
    mergeSort(arr,left,mid);
    mergeSort(arr,mid+1,right);
    merge(arr,left,mid,right);
  }
}

void merge(int arr[],int left,int mid,int right)
{
  int n1=mid-left+1;
  int n2=right-mid;
  int L[n1];
  int R[n2];

  for(int i=0;i<n1;i++)
  {
    arr[i]=L[left+i];
  }
  for(int i)
}
