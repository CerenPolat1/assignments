package assignments;

import java.util.Scanner;
public class c_assignment {
    public static void main(String[] args) {

/// the one of previous assignments


        //Task 1:
//    Write a Java program to display the middle character of a string in uppercase
//        --> If the length of the string is even number  String will have two middle characters.
//        --> If the length of the string is odd number String  will have one middle character.

        Scanner abc = new Scanner(System.in);
        System.out.println("enter word:");
        String b = abc.nextLine();

        if(b.length()%2==0){
            System.out.println(b.substring(b.length()/2-1,b.length()/2+1 ).toUpperCase());
        } else if (b.length()%2 !=0){
            System.out.println(b.substring(b.length()/2, b.length()/2+1).toUpperCase());
        }else{
            System.out.println("invalid");
        }

        System.out.println("...........");
//#3 - Ask user to enter two words. Then add them together and print.
// But if the last letter of the first word and the first letter of the last letter is the same, print that character once.
//                    Input:
//                        one
//                        eight
//                    Output:
//                       oneight

        Scanner mmm = new Scanner(System.in);
        System.out.println("enter two words");
        String userWord1 = mmm.nextLine();
        String userWord2 = mmm.nextLine();

        int word1LastIndex=userWord1.length()-1;
        String word1LastIndex1=""+userWord1.charAt(word1LastIndex);

        String wordFirstIndex2=""+userWord2.charAt(0); // why we put ""

        if (word1LastIndex1.equals(wordFirstIndex2)){
            System.out.println(userWord1.concat(userWord2.substring(1)));
        } else{
            System.out.println("invalid");
        }

        System.out.println("...........");



        //OR???



//
//        if(userWord1.substring(userWord1.length()-1)==userWord2.substring(0,1)) {
//                System.out.println(userWord1.substring(userWord1.length()-1).concat(userWord2.substring(0,1)));
//                } else{
//                System.out.println("invalid");
//                }
//
//




        //task 4. write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5


        for (int v = 1; v < 100; v++) {

            if (v % 3 == 0 && v % 5 ==0 && v%2 !=0) {

                System.out.println("this is odd number " + v);


            }

        }

        System.out.println("***********************");

        //task 5. write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5


        for (int t = 1; t < 100; t++) {

            if (t % 2 == 0 && t % 3==0 && t%5==0) {
                System.out.println("this number is even number  " + t);

            }

        }


    }
}

//    enter word:
//        hope
//        OP
//        ...........
//        enter two words
//        blue
//        ending
//        bluending
//        ...........
//        this is odd number 15
//        this is odd number 45
//        this is odd number 75
//        ***********************
//        this number is even number  30
//        this number is even number  60
//        this number is even number  90

