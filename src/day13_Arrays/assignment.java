package day13_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class assignment {

    public static void main(String[] args) {

//Question 1
//Write Java statements that do the following:
//a) Declare an array numArray of 15 elements of type int.
//b) Output the value of the tenth element of the array alpha.
//c) Set the value of the fifth element of the array alpha to 35.
//d) Set the value of the ninth element of the array alpha to the sum of the sixth and thirteenth elements of the array alpha.

        int[] numArray = {12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27};

        System.out.println(numArray[10]);

        numArray[15] = 35;
        System.out.println(numArray[15]);
        numArray[9] = numArray[6] + numArray[13];
        System.out.println(numArray[9]);
        System.out.println("+++++++++++++++++++++++");

        //Question 2
//a) Write a statement that declares a string array initialized with the following strings:
//"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".
//b) Write a loop that displays the contents of each element in the array that you declared.


        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (int i = 0; i <= weekdays.length - 1; i++) {
            System.out.print(weekdays[i] + ",");
        }
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++");

        //Question 3
//Write a program that creates an array of some elements size.
// Your program should prompt the user to input numbers in array and then display the sum of all array elements.


        Scanner input = new Scanner(System.in);
        System.out.println("enter numbers");
        int[] kale = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int sum = 0;
        for (int kl = 0; kl < kale.length; kl++) {

            sum += kale[kl];
        }
        System.out.print("total= " + sum);
        System.out.println();

        System.out.println("+++++++++++++++++++++");

        //Question 4
        //The variable list1 and list2 are reference arrays that each have 5 elements.
        // Write code that copies the values in list1 to list2. Values in list1 are input by user.

        System.out.println("enter 5 elements");
        int[] list1 = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int[] list2 = {3, 5, 4, 1, 2};

        list2 = list1;
        System.out.println(Arrays.toString(list1));

        System.out.println("++++++++++++++++++++++++++++");

//Question 5
//Write a Java program to reverse the element of an integer array.

        String[] deniz = {"deniz", "ceren", "polat"};
        int lastindex = deniz.length - 1;

        for (int n = lastindex; n >= 0; n--) {


            System.out.print(deniz[n] + " ,");
        }
        System.out.println();
        System.out.println("+++++++++++++++++");


//Question 6
//Write a Java program to find the largest and smallest element of an array.
//  create a logic that will store 5 employees salaries (double) from scanner input
//and print each salaries

        int[] off = {40, 20, 10};
        int max= off[0];
        int min= off[0];

        for(int po= 0; po< off.length; po++){
            if(off[po] >max) {
                max = off[po];
            }
                if(off[po]<min){
                    min=off[po];

                }

        }

        System.out.println("largest element is "+ max);
        System.out.println("smallest element is " + min);

        System.out.println("+++++++++++++++++++++++++++");

            System.out.println("Enter the salaries of 5 employees");
            double[] salaries = {input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(),};

            for (int i = 0; i < salaries.length; i++) {
                System.out.println("Salaries are: " + salaries[i]);
            }

            System.out.println("++++++++++");

//task2
//write a program that can return the average number from an array of integers

            int[] ok = {20, 30, 40};
            int summ = 0;
            int average = 1;


            for (int i = 0; i < ok.length; i++) {
                summ += ok.length-1;
                average = ok.length / 3;

               // System.out.println("the average of numbers: " + ok[average]);
            }
            System.out.println("the average of numbers: " + ok[average]);

            System.out.println("++++++++++++++++");


//write a program that can return the sum of number from an array of integers
//            ex:
//                [20, 25, 15]
//                sum: 60


            int[] polat = {40, 50, 60};
            int summm = 0;

            for (int l = 0; l < polat.length; l++) {
                summm += polat[l];

            }
            System.out.print("sum of numbers= " + summm);

               System.out.println();



//write a program that can return the min number from an array of integers


        int [] cicek= {40,20,-5, -30,49};

        //assume min=cicek[0]
        int minn=cicek[0];

        for(int diken= 0; diken< cicek.length; diken++){

            if(cicek[diken]< minn){
             minn = cicek[diken];
            }
        }
        System.out.println("the min number of these numbers: "+ minn);
        System.out.println("+++++++++++++++++");

//write a program that can return the max  number from an array of integers


        int [] yuh= {50,60,340};

        int durma= yuh[0];

        for( int aga= 0; aga<yuh.length; aga++){

            if(yuh[aga]> durma){
                durma= yuh[aga];
            }
        }

        System.out.println("the max number of these numbers: "+ durma);

        }
    }

//             22
//             35
//             43
//             +++++++++++++++++++++++
//             Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,
//             +++++++++++++++++++++++++++++
//             enter numbers
//             4
//             3
//             7
//             8
//             total= 22
//             +++++++++++++++++++++
//             enter 5 elements
//             7
//             5
//             9
//             8
//             2
//             [7, 5, 9, 8, 2]
//             ++++++++++++++++++++++++++++
//             polat ,ceren ,deniz ,
//             +++++++++++++++++
//             largest element is 40
//             smallest element is 10
//             +++++++++++++++++++++++++++
//             Enter the salaries of 5 employees
//             50
//             100
//             150
//             200
//             250
//             Salaries are: 50.0
//             Salaries are: 100.0
//             Salaries are: 150.0
//             Salaries are: 200.0
//             Salaries are: 250.0
//             ++++++++++
//             the average of numbers: 30
//             ++++++++++++++++
//             sum of numbers= 150
//             the min number of these numbers: -30
//             +++++++++++++++++
//             the max number of these numbers: 340
//
//             Process finished with exit code 0
//

