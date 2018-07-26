import java.util.Scanner;

public class Special6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n=s.nextLine();
		int count=0;
	for(int i=0;i<n.length();i++)
	{
		if((n.charAt(i)>='A' && n.charAt(i)<='Z')||(n.charAt(i)>='a' && n.charAt(i)<='z')||(n.charAt(i)>='0' && n.charAt(i)<='9')||n.charAt(i)==' ')
		{
			continue;
		}
		else
			count++;
			
	}

		System.out.println(count);
	}

}
