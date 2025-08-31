import java.util.Scanner;
public class Adding
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("write the 1 value = ");//a=7
	    int a = input.nextInt();
	    System.out.print("write the 2 value = ");//b=7
	    int b = input.nextInt();
	    int c = a + b;
		System.out.println("This is the final output = " + c);//7+7=14
	}
}