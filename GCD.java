// Q3. Write a Java program to find the GCD (Greatest Common Divisor) of two numbers using a loop.
package Loops;
import java.util.Scanner;
public class GCD {
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the First number:");
        int a =sc.nextInt();
        System.out.println("Enter the Second number");
        int b = sc.nextInt();
        int gcd = findGCD(a,b);
        System.out.println("The GCD is:"+ gcd);
        sc.close();
    }
        private static int findGCD(int a,int b) 
        {
            while (b!=0) {
                int temp =b;
                b=a%b;
                a = temp;
            }
            return a;
        }
        











    }
    
