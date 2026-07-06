using System;

class App
{
  static void Main()
  {
    Console.WriteLine(fibo(7));
    Console.WriteLine(fibonacci(7));
  }

  public static int fibo(int n)
  {
    if(n==1||n==0){return n;}
    return fibo(n-1)+fibo(n-2);
  }

  public static int fibonacci(int n)
  {
    if(n==1||n==0){return n;}
    int current=0,prev=0,prev2=1;

    for(int i=2;i<=n;i++)
    {
      current=prev+prev2;
      prev=prev2;
      prev2=current;
    }
    return current;
  }
}
