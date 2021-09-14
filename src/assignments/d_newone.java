package assignments;

import java.util.Scanner;

public class d_newone {
    public static void main(String[] args) {



//Create a Java Program to Print an Integer (Entered by the User)


        Scanner input=new Scanner(System.in);
        System.out.println("enter integer");
        int a= input.nextInt();
        System.out.println("**********");
//Create a Java Program to Add Two Integers

        int b=3;
        int c=4;
        System.out.println("added 2 ingeteres= " + b+ " and " +c);
        System.out.println("**********");

//Create a Java Program to Multiply two Floating Point Numbers

      float g= 10.1f;
      float f=4.1f;
      System.out.println("g and f multification= "+ g*f);
        System.out.println("**********");

//Create a Java Program to Find ASCII Value of a character

        char cha=97;
        System.out.println("this is Ascii value= " + cha);
        System.out.println("**********");


//Create a Java Program to Compute Quotient and Remainder

       int gb=556;
       int jk=4;
       int fff= gb%jk;
       int ddd= gb/jk;
        System.out.println("bg and jk Quotient= "+ ddd+ " and bg and jk Remainder= " + fff);
        System.out.println("**********");

//Create a Java Program to Swap Two Numbers
        int n =80;
        int m=90;
        n=m;
        m=80;
        n=90;

        System.out.println("**********");


//Create a Java Program to Check Whether a Number is Even or Odd


int y=60;

if(y%2==0) {
    System.out.println(y + " is even number");
}else{
    System.out.println(y+ " is odd number");
}

        System.out.println("**********");


//Create a Java Program to Check Whether an Alphabet is Vowel or Consonant

        char ch='a';

     if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o'||ch=='u'){
         System.out.println("this word is vowel");
     }else{
         System.out.println("this word is consonant");
     }

        System.out.println("**********");


//Create a Java Program to Find the Largest Among Three Numbers

     int pp=50;
     int hh=100;
     int ww=550;

     if(pp>hh && pp>ww){
         System.out.println("the largest number is " + pp);
     }else if(hh>pp && hh>ww){
         System.out.println("the largest number is " + hh);
     }else{
         System.out.println("the largest number is " + ww);
     }

        System.out.println("**********");


//Create a Java Program to Check Leap Year

     int uu= 1993;

     if (uu%4==0){
         if(uu%100==0)
             if(uu%400==0)
                 System.out.println(uu+ " is a leap year");
     }else{
         System.out.println(uu+ " is not a leap year");
     }


        System.out.println("**********");

 //Create a Java Program to Check Whether a Number is Positive or Negative

     int bb=-90;

     if(bb>0){
         System.out.println(bb+ " is a positive number");
     }else if(bb<0){
         System.out.println(bb+ " is a negative number");
     }else{
         System.out.println(bb+ " is 0");
     }

        System.out.println("**********");

        //Create a Java Program to Check Whether a Character is Alphabet or Not

        char jjj= '#';

        if(Character.isAlphabetic(jjj)){
            System.out.println(jjj + " is alphabetic");
        }else{
            System.out.println(jjj+ " is not alphabetic");
        }



        System.out.println("**********");



//Create a Java Program to Calculate the Sum of Natural Numbers


        Scanner abc= new Scanner(System.in);
        System.out.println("enter natural number");
        int aq=abc.nextInt();
        int gum=0;
        int sunn=0;

        for(int z=0; z<=aq; z++){
            sunn+=z;

        }
        System.out.println(sunn);


        System.out.println("**********");


//Create a Java Program to Find Factorial of a Number
        int ee=5;
        int factr=1;

         for(int i=1; i<=ee; i++) {

             factr *= i;


         }
        System.out.println(factr);


        System.out.println("**********");


//Create a Java Program to Generate Multiplication Table

        int ayna=5;

        for(int i=1; i<10; i++){

            System.out.println(ayna + " * "+i+ " = " + ayna*i);
        }

        System.out.println("**********");


        //on the other hand

      Scanner immput= new Scanner(System.in);
        System.out.println("multiplication table");

       int q= immput.nextInt();
       int multi=1;

       for(int s=1; s<=5; s++) {

           multi = q * s;

           System.out.println(q + " * " + s + " = " + multi);
       }
        System.out.println("**********");

 //Create a Java Program to Display Fibonacci Series

//Create a Java Program to Display Alphabets (A to Z) using loop


        System.out.print("English alphabet is: ");

        for(char gtb='A'; gtb<='Z';gtb++){
            System.out.print(""+gtb+",");

}
        System.out.println();

        System.out.println("**********");

//Create a Java Program to Count Number of Digits in an Integer

        int yeap=590999;
        int count= 0;


         while(yeap!=0){
           yeap/=10;
           count++;
        }
        System.out.println("count Number of Digits in an Integer= "+ count);

        System.out.println("**********");


 //Create a Java Program to Reverse a Number
//Create a Java Program to Calculate the Power of a Number
//Create a Java Program to Check Palindrome
//Create a Java Program to Check Whether a Number is Prime or Not
//Create a Java Program to Display Prime Numbers Between Two Intervals
//Create a Java Program to Check Armstrong Number
//Create a Java Program to Make a Simple Calculator Using switch...case

    }
}

//        enter integer
//        70
//        **********
//        added 2 ingeteres= 3 and 4
//        **********
//        g and f multification= 41.41
//        **********
//        this is Ascii value= a
//        **********
//        bg and jk Quotient= 139 and bg and jk Remainder= 0
//        **********
//        **********
//        60 is even number
//        **********
//        this word is vowel
//        **********
//        the largest number is 550
//        **********
//        1993 is not a leap year
//        **********
//        -90 is a negative number
//        **********
//        # is not alphabetic
//        **********
//        enter natural number
//        9
//        45
//        **********
//        120
//        **********
//        5 * 1 = 5
//        5 * 2 = 10
//        5 * 3 = 15
//        5 * 4 = 20
//        5 * 5 = 25
//        5 * 6 = 30
//        5 * 7 = 35
//        5 * 8 = 40
//        5 * 9 = 45
//        **********
//        multiplication table
//        4
//        4 * 1 = 4
//        4 * 2 = 8
//        4 * 3 = 12
//        4 * 4 = 16
//        4 * 5 = 20
//        **********
//        English alphabet is: A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,
//        **********
//        count Number of Digits in an Integer= 6
//        **********
//
//        Process finished with exit code 0
