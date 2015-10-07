import java.util.Scanner;
public class MagicSum {
	
	public static void main(String[] args) {
		Scanner sb = new Scanner(System.in);
		int n = sb.nextInt();
		int a[][] = new int[n][n];
		a[0][n/2]=1;
		int i=2,j,k=-1,p=(n/2)+1;
		while(i<=n*n)
		{
			if(k>=0&&p<=n-1)
			{
				if(a[k][p]==0)
			      {
					a[k][p]=i++;
					k--;
					p++;
			      }
				else{
					
					k=k+2;
					p=p-1;
				}
			}
			else if(k<0&&p<=n-1)
			{
				if(a[n-1][p]==0)
				{
				a[n-1][p]=i++;
				k=n-1;
				k--;
				p++;
				}
				else{
					
					k=k+2;
					p=p-1;
				}
			}
			else if(k>=0&&p>n-1)
			{
				if(a[k][0]==0)
				{
					a[k][0]=i++;
					p=0;
					k--;
					p++;
				}
				else
				{
					
					k=k+2;
					p=p-1;
					
				}
				
			}
			else if(k<0&&p>n-1)
			{
				if(a[n-1][0]==0)
				{
					a[n-1][0]=i++;
					k=n-1;
					p=0;
					k--;
					p++;
				}
				else
				{
					k=k+2;
					p=p-1;
				}
				
			}
			
			
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.printf("%d ",a[i][j]);
			}
			System.out.printf("\n");
		}

	}

}
