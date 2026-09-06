package Multiple;

public class  Multiple
{
  public int stairs(int n)
  {
    if(n<=1)return 1;
    return this.stairs(n-1)+this.stairs(n-2);
  }

  public int tribonacci(int n)
  {
    if(n==0||n==1)return n;

    return this.tribonacci(n-1)+this.tribonacci(n-2)+this.tribonacci(n-3);
  }
}
