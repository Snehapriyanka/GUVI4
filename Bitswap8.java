import java.util.Scanner;
public class Bitswap8 {

	public static void main(String[] args) {
int m,n;
Scanner c=new Scanner(System.in);
m=c.nextInt();
n=c.nextInt();
m=m^n;
n=n^m;
m=m^n;
System.out.println(m+" "+n);
	}

}
