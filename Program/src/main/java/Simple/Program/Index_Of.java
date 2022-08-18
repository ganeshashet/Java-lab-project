package Simple.Program;
/*
 * @Ganesha c
 * java program to print idex of specific word in the given String*/
import java.util.*;
import static java.lang.System.*;
public class Index_Of {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		out.println("enter the String ");
		String st=sc.nextLine();
		out.println("enter the word to know the position String");
		String word=sc.nextLine();
		out.println(st);
		out.println("element to find the position is  "+word);
		out.println("element found in position is  "+st.indexOf(word));
	}

}
