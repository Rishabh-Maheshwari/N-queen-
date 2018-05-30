import java.util.*;
public class Solution {
	
		
public static void placeNQueens(int n){
		
	
  int[][] a=new int[n][n];
		placing(0,a);

	}
  public static void placing(int i,int[][] a )
  {
    int n=a.length;
    //System.out.println(n);
    if(i==n)
    {
   //   System.out.println("hi");
      for(int h=0;h<n;h++)
      {
        for(int r=0;r<n;r++)
        {
          System.out.print(a[h][r]+" ");
        }
       
                  }
      System.out.println("");
     
    }
    else
    {   //Math.pow(n,n-i);
     int flag;
    		int j=i;
    	
      		for(int g=0;g<n;g++)
            { flag=1;
              for( int y=0;y<i;y++)
            {
            for(int d=0;d<n;d++)
            { 
             if(a[y][d]==1)
             {   // System.out.println("i="+i+"j="+j+"g="+g+"y="+y+"d="+d+"n="+n);
               if(Math.abs(j-y)==Math.abs(d-g) || d==g)
               { 	//System.out.println("breaked");
                 flag=0;
                 break;
               }
             }
            }
             if(flag==0)
             {
               break;
             }
            }
              if(flag==1)
              {
              a[j][g]=1;
        //        System.out.println("i===j=="+j+"===g==="+g);
              placing(i+1,a);
              a[j][g]=0;
              flag=0;
              }
            
            }
    	
    }
    
  }
	
}
