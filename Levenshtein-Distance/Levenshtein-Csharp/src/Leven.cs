using System.Collections.Generic;
using static System.Math;

namespace Leven
{
  class Leven
  {
    public int Ldistance(string a, string b)
    {
      int n=a.Length;
      int m=b.Length;

      int[,] dp=new int[n+1,m+1];

      for(int i=0;i<=n;i++){dp[i,0]=i;}
      for(int j=0;j<=m;j++){dp[0,j]=j;}

      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=m;j++)
        {
          if(a[i-1]==b[j-1])
          {
            dp[i,j]=dp[i-1,j-1];
          }
          else 
          {
            int deletion=dp[i-1,j];
            int insertion=dp[i,j-1];
            int substitution=dp[i-1,j-1];
            dp[i,j]=1+Min(deletion,Min(insertion,substitution));
          }
        }
      }
      return dp[n,m];
    }
  }
}
