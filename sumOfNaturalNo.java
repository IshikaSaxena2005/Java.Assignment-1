//Q1. Write a Java program to calculate the sum of natural numbers up to a given positive integer 'n'
package Loops;
import java.util.Scanner;

public class sumOfNaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n =sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum = sum+i;
        }
        System.out.println("The sum is");
        System.out.println(sum);
        sc.close();
    }
    
}
