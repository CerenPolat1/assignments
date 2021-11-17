package day16_Methods;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Locale;
import java.util.Scanner;

import java.util.Arrays;

public class assignment {
    //// write a method that will take 3 parameters
//    // 2 numbers and one operator
//    // it will do the calculation
//
//    //ex : 200 100 +
//    //result 300
//
//    //ex 15 3 *
//    //result 45


public static void calculation (int one, int two) {


    int sum = one + two;

    System.out.println(sum);
    System.out.println(".............");
}

public static void main (String [] args) {
    calculation(40, 50);
    palindrome();

    //write a program that can return the count of "java" and "javascript" anywhere in the sentence
    //String sentence = "I like java and javascript,java is best, java and javascript,java ";

    String sentence1 = "I like java and javascript,java is best, java and javascript,java ";

    //i wanna get some words(java-javascript).thats why, i need to divide words.
    // thats why, firstly i use array[] to stora sentence, then, i need to divide words.
    //thats why, i need to use split, then i need to use array.tostring to store like string

    String[] news= sentence1.split(" "); // put space bec i wanna divide words

    System.out.println(Arrays.toString(news));
    System.out.println("#######");
    String word1="java";
    String word2="javascript";
    int count=0;  // why i use int bec. i wanna see how many java included in this sentence
    int count2=0; //why i put 0, bec it start to sum with 0,0+1,0+2...

    for(String each:news){
        if(each.contains(word1)){     //if use equal, or equalignorecase they wont work properly.
            count++;
        }
        if(each.contains(word2)){
            count2++;
        }

    }

    System.out.println("java count "+ count + " times.");
    System.out.println("javascrip count "+ count2 + " times.");

    System.out.println("..........");

//Write a program that can print out the unique values from a String Array
//            Ex:
//                if arr -> {"A", "A", "B", "C", "C"}
//                output: B
//
//                if arr -> {"A", "B", "B", "C"}
//                output:  A
//                         C


 String stringg="A, A, B, C, C";
 String [] string2= stringg.split(" ");


 for(String each:string2){
     if(each.contains("B")){

         continue;
     }
     System.out.print(each);
 }
    System.out.println();


}


//write a method that can identify if a string is palindrome
//            ex: palindrome("mom")  ==> true
//                palindrome("hello") ==> false

//A palindrome is a string, which, when read in both forward and backward ways is the same.
    //   Example: madam, lol, pop, radar, etc.//


    public static void palindrome(  ) {

        String bak = "ceren madam radar";
        String yeni = ""; // niye yeni bir tane yarattik cunku reverse'u bununla yapicaz


        for (int i = bak.length() - 1; i >= 0; i--) {
            yeni += bak.charAt(i);

        }

        System.out.println(yeni);


        System.out.println("..........");



        String news1="madam";
        String reversednew="";
        int lastindex=news1.length()-1;
        for (int i=lastindex; i>=0; i-- ){
            reversednew+=+news1.charAt(i); // we could  put "" if news1 is not string


        }
        System.out.println(reversednew);

        boolean bo=news1.equals(reversednew); //true

        if (news1.equals(reversednew)){ // burada == kullanamayayiz eger kullanirsak her seyin bire bir esit olmasi lazim
                                        //heep memory and stack memory olayindan dolayi.equlada sadece letter'larin esit olmasi yetiyor
            System.out.println(news1+" is a polindrome : "+ bo);
        }else {
            System.out.println(news1+" is not a polindrome : "+ !bo);
        }

        System.out.println("...........");
    }
}

//        90
//        .............
//        madam
//        madam is a polindrome
//        [I, like, java, and, javascript,java, is, best,, java, and, javascript,java]
//        count java: 4, count javascript: 2
//        ..................
//        A,A,C,C
//
//        Process finished with exit code 0
