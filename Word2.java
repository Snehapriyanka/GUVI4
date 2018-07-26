import java.util.Scanner;

public class Word2 {

	public static void main(String[] args) {
Scanner c=new Scanner(System.in);
String s=c.nextLine();
String[] word=s.split(" ");
int count=0;
char ch[]=s.toCharArray();
for(int i=0;i<s.length();i++)
{
	if(ch[i]!=' ')
		count++;
}
System.out.println(word.length);
	}

}
