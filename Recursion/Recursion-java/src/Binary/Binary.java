package Binary;

public class Binary 
{
  public int fibonacci(int n)
  {
    if(n==1||n==0)return n;

    return this.fibonacci(n-1)+this.fibonacci(n-2);
  }

  public void hanoi(int n,String a,String b,String c)
  {
    if(n<=0)return;

    this.hanoi(n-1, a, c, b);
    System.out.println(" from "+a+" put "+n+" to "+b);
    this.hanoi(n-1, c, b, a);
  }
}
