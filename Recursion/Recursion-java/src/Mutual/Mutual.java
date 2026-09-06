package Mutual;

public class Mutual 
{
  public void even(int n)
  {
    if(n<=0)return;
    System.out.println(n+" is even");
    this.odd(n-1);
  }

  public void odd(int n)
  {
    if(n<=0)return;
    System.out.println(n+" is odd");
    this.even(n-1);
  } 
}
