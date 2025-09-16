import java.util.Scanner;


public class Palindrome {
public static boolean isPalindrome(String str) {
str = str.replaceAll("\\s+", "").toLowerCase();
int left = 0, right = str.length() - 1;
while (left < right) {
if (str.charAt(left) != str.charAt(right)) return false;
left++;
right--;
}
return true;
}


public static void run() {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string: ");
String input = sc.nextLine();
if (isPalindrome(input)) System.out.println("Palindrome");
else System.out.println("Not a palindrome");
}
}