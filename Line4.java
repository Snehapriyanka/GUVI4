import java.util.Scanner;

public class Line4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n=s.nextLine();
		int count=0;
		char ch[]=n.toCharArray();
		for(int i=0;i<n.length();i++)
		{
			if(ch[i]=='.')
				count++;
			}
		System.out.println(count);
	}

}
