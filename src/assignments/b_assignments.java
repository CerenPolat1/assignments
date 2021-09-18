package assignments;

import java.util.Scanner;

public class b_assignments {
    public static void main(String[] args) {


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

        for(int k=1; k<=5; k++){

            System.out.println( v+ " * "+ k+ " = " + v*k);

        }

        System.out.println("///////////////////");

//Question 4
//Write a program to find the factorial value of any number entered through the keyboard.

    int fact=1;
    int number=5;
    for(int i=1; i<=number; i++){
        fact*=i;
    }
        System.out.println(fact);
        System.out.println("/////////////");

         ///OR

        System.out.println("find the factorial value of any number");
        int fct= input.nextInt();
        int nmbr=1;

        for(int m=1; m<=fct; m++){
            nmbr*=m;
        }
        System.out.println(nmbr);

        System.out.println("///////////");


//Question 6
//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
//For example, if the input is 12345, the output should be 54321.

        int hd= input.nextInt();
        int reverse= hd;

        for( int f=reverse; f>=0; f--){
            reverse+=hd;
        }
        System.out.println(reverse);

        System.out.println("///////////////////");

//Question 7
//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

        System.out.println("enter some integers");
        int bak= input.nextInt();
        int hak= input.nextInt();
        int tak= input.nextInt();
        int sak= bak+hak+tak;

        System.out.println(sak);

        System.out.println("///////////");














        }

}
