#pragma once

int fibo(int n)
{
  if(n==1||n==0)
  {
    return n;
  }

  return fibo(n-1)+fibo(n-2);
}

int fibon(int n)
{
  if(n==1||n==0)
  {
    return n;
  }

  int current=0,prev=0,next=1;

  for(int i=2;i<=n;i++)
  {
    current=prev+next;
    prev=next;
    next=current;
  }
  return current;
}
