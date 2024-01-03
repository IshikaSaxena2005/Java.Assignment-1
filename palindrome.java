//Q4. Write a Java program to check if a given string is a palindrome or not using a loop.
package Loops;
import java.util.Scanner;
public class palindrome {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the String: ");
        String input = sc.nextLine();
        if(isPalindrome(input))
        {
            System.out.println("The given string is Palindrome");
        }
        else
        {
            System.out.println("The given string is not a Palindrome");
        }
      sc.close();
    }
    private static boolean isPalindrome(String str)
    {
        for(int i=0,j=str.length()-1;i<j;i++,j--)
        {
            if(str.charAt(i)==str.charAt(j))
            {
            return true;
        }
        }
        return false;

}
}
