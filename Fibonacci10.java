import java.util.Scanner;
public class Fibonacci10 {

	public static void main(String[] args) {
		int n,a,b=1,c=1;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(int i=1;i<=n;i++)
{
	a=b;
	b=c;
	c=a+b;
	System.out.println(a);
}
	}

}
