import java.util.Scanner;
import java.lang.*;
public class Numbers {

	public static void main(String[] args) {
		Scanner sb = new Scanner(System.in);
		int i = sb.nextInt();
		int p = i;
		int n,s;
		for(n=0;p>0;n++)
		{
			p=p/10;
		}
		p=i;
		//System.out.println(p);
		int a[] = new int[n];
		for(s=0;s<n;s++)
		{
			a[s]=p%10;
			p=p/10;
		}
		/*for(s=0;s<n;s++)
		{
			System.out.println(a[s]);
			
		}*/
		int esum=0,osum=0; 
		
		for(s=0;s<n;s++)
		{
			if(s%2==0){
			esum=esum+a[s];
			}
			else
				{osum=osum+a[s];}
		}
		//System.out.println(esum + " " + osum);
		if(esum==osum)
		{
			System.out.println("sum of even place digits is equal to sum of odd place digits.");
		}
		else
		{
			System.out.println("sum of even place digits is not equal to sum of odd place digits");
		}
	}

}
