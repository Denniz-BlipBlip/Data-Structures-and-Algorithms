package Recursion;

public class Fibo 
{
  public int fibonacci(int n)
  {
    if(n==1||n==0) return n;

    return fibonacci(n-1)+fibonacci(n-2);
  }

  public int fibona(int n)
  {
    if(n==0||n==1) return n;

    int current=0,prev=1,fibo=0;

    for(int i=2;i<=n;i++)
    {
      fibo=current+prev;
      current=prev;
      prev=fibo;
    }
    return fibo;
  }
}
