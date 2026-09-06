package Linear;

public class Linear 
{
  public int addUpTo(int n)
  {
    if(n<=0)return n;

    return n+this.addUpTo(n-1);
  }
}
