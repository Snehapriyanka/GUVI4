import java.util.Scanner;

public class Swap7 {

	public static void main(String[] args) {
int x,y,temp;
Scanner s= new Scanner(System.in);
x=s.nextInt();
y=s.nextInt();
temp=x;
x=y;
y=temp;
System.out.println(x+" "+y);

	}

}
