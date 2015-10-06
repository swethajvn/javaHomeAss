import java.util.Scanner;
public class Progression {

	public static void main(String[] args) {
		Scanner sb = new Scanner(System.in);
		int n = sb.nextInt();
		int a[] = new int[n];
		int i,ap=1,gp=1;
		for(i=0;i<n;i++)
		{
			a[i] = sb.nextInt();
		}
		for(i=0;i<n-2;i++)
		{
			if(a[i]*a[i+2]!=a[i+1]*a[i+1])
			{
				gp=0;
				break;
			}
		}
		for(i=0;i<n-2;i++)
		{
			if(a[i+2]-a[i+1]!=a[i+1]-a[i])
			{
				ap=0;
				break;
			}
			
		}
		if(ap==0&&gp==0)
			System.out.println("no progression followed!");
		else if(ap==1&&gp==1)
			System.out.println("both ap and gp");
		else if(ap==1)
			System.out.println("arithmetic progression");
		else
			System.out.println("geometric progression");

	}

}
