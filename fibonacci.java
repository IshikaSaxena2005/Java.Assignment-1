//Q5. Write a Java program to generate and print the first 'n' terms of the Fibonacci series.
package Loops;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("The Fibnacci series is:");
        int a =0, b=1;
        for(int i=0;i<=n;i++)
        {
            System.out.print(a+ " ");
            int temp = a+b;
            a=b;
            b= temp;
        }
        sc.close();
    }
}
