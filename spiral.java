import java.util.Scanner;
public class Spiral
{
   public static void printSpiral(int x[][],int m,int n)
   {
      int top=0,down=m-1,left=0,right=n-1;
      int dir=0;
      while(top<=down && left<=right)
      {
         if(dir==0)
          {
             for(int i=left;i<=right;i++)
                System.out.print(x[top][i]+" ");
              top+=1;
          }
         else if(dir==1)
          {
             for(int i=top;i<=down;i++)
                 System.out.print(x[i][right]+" ");
             right-=1;
          }
	  else if(dir==2)
          {
             for(int i=right;i>=left;i--)
                 System.out.print(x[down][i]+" ");
             down-=1;
          }
          else if(dir==3)
          {
	     for(int i=down;i>=top;i--)
                 System.out.print(x[i][left]+" ");
             left+=1;
          }
          dir=(dir+1)%4;
      }
   }
 
   public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int x[][],m,n;
       m=sc.nextInt();
       n=sc.nextInt();
       x=new int[m][n];
       
       for(int i=0;i<m;i++)
         for(int j=0;j<n;j++)
            x[i][j]=sc.nextInt();
       printSpiral(x,m,n);
    }
}
