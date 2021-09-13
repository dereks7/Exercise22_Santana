import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
/*
Enter the first number: 1
Enter the second number: 51
Enter the third number: 2
The largest number is 51.
 */

public class ex22_santana
{
    public static void main( String[] args )
    {
        System.out.println("Enter the first number: ");
        Scanner in1 = new Scanner(System.in);
        String num1 = in1.nextLine();
        int n1 = Integer.parseInt(num1);
        System.out.println("Enter the second number: ");
        Scanner in2 = new Scanner(System.in);
        String num2 = in2.nextLine();
        int n2 = Integer.parseInt(num2);
        System.out.println("Enter the third number: ");
        Scanner in3 = new Scanner(System.in);
        String num3 = in3.nextLine();
        int n3 = Integer.parseInt(num3);

        int largest = 0;

        if (n1 > n2)
        {
            largest = n1;
        }
        else if (n2 > n1)
        {
            largest = n2;
        }

        if (n3 > largest)
        {
            n3 = largest;
        }

        System.out.printf("The largest number is %d", largest);
    }
}
