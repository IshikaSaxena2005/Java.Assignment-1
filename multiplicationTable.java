//Q2. Write a Java program to print a multiplication table for a given number 'n'.
package Loops;
import java.util.Scanner;
public class multiplicationTable {
    public static void main(String args[])
    {
    System.out.println("Enter the value of n:");
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    System.out.println("The TABLE:");
    for(int i=n;i<=n*10;i=i+n)
    {
        System.out.println(i);
    }
    sc.close();

}
}