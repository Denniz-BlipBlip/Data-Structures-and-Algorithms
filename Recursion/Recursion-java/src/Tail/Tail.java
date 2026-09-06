package Tail;

public class Tail 
{
  public void count(int n)
  {
    if(n<=0)return;
    System.out.println(n);
    count(n-1);
  }
}
