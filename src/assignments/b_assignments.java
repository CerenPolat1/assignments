package assignments;

import java.util.Scanner;

public class b_assignments {
    public static void main(String[] args) {



//Question 3
//Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
//Question 4
//Write a program to find the factorial value of any number entered through the keyboard.
//Question 5
//Two numbers are entered through the keyboard.
// Write a program to find the value of one number raised to the power of another.
// (Do not use Java built-in method)
//Question 6
//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
//For example, if the input is 12345, the output should be 54321.
//Question 7
//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
//Question 8
//Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.

//Note : prompt the user to input means : ask user to put input which you need a scanner class


//Question 1
//Write a program to print numbers from 1 to 10.

for(int a=1; a<=10; a++){
    System.out.println(a);
}
        System.out.println("//////////////");

//Question 2
//Write a program to calculate the sum of first 10 natural number.

        int sum=0;
 for(int b=1; b<=10; b++){
      sum+=b;
}
 System.out.println("the sum of first 10 natural number is= " + (sum));

        System.out.println("////////////////");

//Question 3
//Write a program that prompts the user to input a positive integer.
// It should print the multiplication table of that number.

        Scanner input = new Scanner(System.in);
        System.out.println("please enter positive integer: ");
        int v= input.nextInt();

        for(int k=4; k>=0; k--){
            v*=k;
            System.out.println(v*k);
        }












    }

}
