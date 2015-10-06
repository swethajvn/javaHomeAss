import java.util.Scanner;
public class FactorialCheck {
	public static void main(String[] args) {
	  Scanner sb = new Scanner(System.in);
	  int a = sb.nextInt();
	  int pro=1,c=0;
	  for(int i=1;i<=a/2;i++)
	  {
		  pro = pro*i;
		  if(pro==a)
		  {
			  c=1;
			  break;
		  }
	  }
	  if(c==1)
	  {
		  System.out.println("perfect factorial");
	  }
	  else
		  System.out.println("imperfect");
	  

	}

}
