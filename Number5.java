import java.util.Scanner;

public class Number5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n=s.nextLine();
		int count=0;
		char ch[]=n.toCharArray();
		for(int i=0;i<n.length();i++)
		{
			if(Character.isDigit(ch[i]))
				count++;
			}
		System.out.println(count);
	}

}
