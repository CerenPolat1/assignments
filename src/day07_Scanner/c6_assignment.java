package day07_Scanner;


import com.sun.deploy.security.SelectableSecurityManager;
import sun.jvm.hotspot.gc_implementation.parallelScavenge.PSYoungGen;

import java.util.Scanner;

public class c6_assignment {

        public static void main(String[] args) {

//Question 1
//Even or Odd
//Write a program that asks the user to enter a number and displays whether entered number is an odd number or even number.

                Scanner input = new Scanner(System.in);
                System.out.println("Please enter even or odd number");
                int a = input.nextInt();
                if (a % 2 == 0) {
                        System.out.println(a + " is a odd number.");
                } else {
                        System.out.println(a + " is a even number.");
                }
                System.out.println("***************");
//Question 2
//Absolute value
//Write a program that asks the user to enter a number and displays the absolute value of that number.

                Scanner asdas = new Scanner(System.in);
                System.out.println("Please enter absolute number");
                int b= asdas.nextInt();
                if (b > 0) {
                        System.out.println("Absolute value is " + b);
                } else if (b < 0) {
                        System.out.println("Absolute value is " + (-b));
                } else {
                        System.out.println("Absolute value is not found");
                }
                System.out.println("**************");
//Question 3
//Discount and Revenue
//Revenue can be calculated as the selling price of the product times the quantity sold, i.e. revenue = price × quantity.
// Write a program that asks the user to enter product price and quantity and then calculate the revenue.
// If the revenue is more than 5000 a discount is 10% offered. Program should display the discount and net revenue.

                Scanner dep = new Scanner(System.in);

                System.out.println("Please enter product price");
                int product = dep.nextInt();

                System.out.println("Please enter product qty");
                int gty = input.nextInt();

                System.out.println("revenue  is equal " + product + "*" + gty);
                int rev = input.nextInt();

                if (rev > 5000) {
                        System.out.println("you will get 10% discount in " + rev);
                } else {
                        System.out.println("you will not get any discount in " + rev);
                }
                System.out.println("***************");

//Question 4
//Largest Number
//Write a program that asks the user to enter a numbers in three variables and then displays the largest number.

                Scanner cep = new Scanner(System.in);

                System.out.println("enter number");
                int ac = cep.nextInt();
                System.out.println("enter number");
                int bc = cep.nextInt();
                System.out.println("enter number");
                int dc = cep.nextInt();


                if ((ac > bc) && (ac > dc)) {
                        System.out.println(ac + " is the largest number in 3 of them");
                } else if ((bc > ac) && (bc > dc)) {
                        System.out.println(bc + " is largest number in 3 of them");
                } else if ((dc > ac) && (dc > bc)) {
                        System.out.println(dc + " is largest number in 3 of them");
                } else {
                        System.out.println("there is no largest number in 3 of them");
                }

                System.out.println("**************");
                // Question 5
//Positive, negative or zero
//Write a program that prompts the user to input a number.
// The program should then output the number and a message saying whether
// the number is positive, negative, or zero

                Scanner cyp = new Scanner(System.in);

                System.out.println("input a number");
                int rrr = cyp.nextInt();


                if ((rrr > 0)) {
                        System.out.println(rrr + " is a positive number");
                } else if ((rrr < 0)) {
                        System.out.println(rrr + " is a negative number");
                } else {
                        System.out.println(rrr + " is zero");
                }

                System.out.println(("*****************"));
//Question 6
//Valid Triangle
//A triangle is valid if the sum of all the three angles is equal to 180 degrees.
// Write a program that asks the user to enter three integers as angles and
// check whether a triangle is valid or not.

                Scanner dcp = new Scanner(System.in);
                System.out.println("enter first angle");
                int v = dcp.nextInt();

                System.out.println("enter second angel");
                int n = dcp.nextInt();

                System.out.println("enter third angle is ");
                int k = dcp.nextInt();

                if (v+n+k==180) {
                        System.out.println("This is a triangle");
                } else {
                        System.out.println("This is not triangle");
                }

                System.out.println("*************");



                //Question 7
//Leap Year
//Any year is input by the user. Write a program to determine whether the year is a leap year or not.
//Leap Years are any year that can be evenly divided by 4.
// A year that is evenly divisible by 100 is a leap year only if it is also evenly divisible by 400.



                Scanner adk = new Scanner(System.in);
                System.out.println("please enter a year");
                int dk= adk.nextInt();

                if ((dk%100==0) && (dk%400==0)) {
                        System.out.println(dk+ " is a leap year");
                }else{
                        System.out.println(dk+" is not a leap year");
                }

                System.out.println("*************");

//Question 8
//
//Telephone Bill
//Write a program to calculate the monthly telephone bills as per the following rule:
//Minimum Rs. 200 for up to 100 calls.
//Plus Rs. 0.60 per call for next 50 calls.
//Plus Rs. 0.50 per call for next 50 calls.
//Plus Rs. 0.40 per call for any call beyond 200 calls.

                   //  i didnt get that


//Question 9
//Grade Calculator
//The marks obtained by a student in 3 different subjects are input by the user.
// Your program should calculate the average of subjects. The student gets a grade as per the following rules:
//Average
//Grade
//
//90-100  A
//80-89   B
//70-79   C
//60-69   D
//0-59    F

                Scanner ap = new Scanner(System.in);
                System.out.println("Please enter first subject grade");
                int hh= ap.nextInt();

                System.out.println("Please enter second subject grade");
                int ll= ap.nextInt();

                System.out.println(" Please enter third subject grade");
                int aa= ap.nextInt();


                int grade= (hh+ll+aa)/3;
                System.out.println("Average of grade is " + grade);

                char s= 'A';
                char ss='B';
                char sss='C';
                char ss1='D';
                char ss2='F';

                if((hh>=90) && (hh<=100)){
                        System.out.println("Student's grade is " + 'A');
                } else if ((grade>=80) && (grade<90)){
                        System.out.println("Student's grade is " + 'B');
                } else if ((grade>=70)&& (grade<80)){
                        System.out.println("Student's grade is "+ 'C');
                }else if ((grade>=60)&& (grade<70)){
                        System.out.println("Student's grade is "+ 'D');
                } else if ((grade<=59) && (grade>=0)){
                        System.out.println("Student's grade is " + 'F');
                } else{
                        System.out.println("Invalid entry");
                }


                System.out.println("*****************");

// Question 10
//Meaning of Grade
//Write a program that prompts the user to enter grade.
// Your program should display the corresponding meaning of grade as per the following table
//
//Grade    Meaning
//A        Excellent
//
//B        Good
//
//C        Average
//
//D        Deficient
//
//F        Failing

//Question 11
//
//Descending Order Names
//Write a program that prompts the user to enter three names.
// Your program should display the names in descending order.


//i didnt get it


        }
}
//
//        Please enter even or odd number
//25
//        25 is a even number.
//        ***************
//        Please enter absolute number
//        62
//        Absolute value is 62
//        **************
//        Please enter product price
//        50
//        Please enter product qty
//        120
//        revenue  is equal 50*120
//        6000
//        you will get 10% discount in 6000
//        ***************
//        enter number
//        70
//        enter number
//        40
//        enter number
//        556
//        556 is largest number in 3 of them
//        **************
//        input a number
//        12
//        12 is a positive number
//        *****************
//        enter first angle
//        60
//        enter second angel
//        60
//        enter third angle is
//        60
//        This is a triangle
//        *************
//        please enter a year
//        1993
//        1993 is not a leap year
//        *************
//        Please enter first subject grade
//        80
//        Please enter second subject grade
//        90
//        Please enter third subject grade
//        95
//        Average of grade is 88
//        Student's grade is B
//        *****************
//
//        Process finished with exit code 0