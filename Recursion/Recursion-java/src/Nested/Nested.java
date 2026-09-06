package Nested;

public class Nested 
{
  public int ackerman(int m,int n)
  {
    if(m==0){return n+1;}
    if(n==0){return this.ackerman(m-1, n);}
    return this.ackerman(m-1,this.ackerman(m, n-1));
  }
}
