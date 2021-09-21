package day14_Arrays;

import java.util.Arrays;
import java.util.Scanner;


public class assignment2 {
    public static void main(String[] args) {


//(String) Reverse
//Write a return method that can reverse  String
//Ex: Reverse("ABCD"); ==> DCBA


        String word= ("ABCD");

        word=""+ word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);

        System.out.println(word);
        System.out.println("..................");


//(String) Same Letters
//Write a return method that check if a string is build out of the same letters as another string.
//Ex:  same("abc",  "cab"); -> true
//same("abc",  "abb"); -> false:

        Scanner input= new Scanner(System.in);
        System.out.println("enter 2 words that have same length");
        String s= input.nextLine();
        String t=input.nextLine();
        char[] brand= s.toCharArray();  //i will convert charArray
        char [] brands= t.toCharArray();

        Arrays.sort(brand); //it shows whether they have same letters or not. letter's order doesnt matter/
        Arrays.sort(brands);

        boolean b = Arrays.equals(brand, brands);
        System.out.println("2 words are same : " + b );

        System.out.println(".............");

//(String) Remove Duplicates
//Write a return method that can remove the duplicated values from String
//Ex:  removeDup("AAABBBCCC")  ==> ABC


        String gug="AAABBBCCC";




//(String) Find the unique
//Write a return  method that can find the unique characters from the String
//Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
            String string="AAABBBCCCDEF";
            String unique="";
   for (int j=0; j <string.length(); j++) {
       int count = 0;

       for (int bn = 0; bn < string.length(); bn++) {
           if (string.charAt(j) == string.charAt(bn)) {
               count++;

           }
       }
       if (count == 1) {
         unique=""+string.charAt(j);
           System.out.println(unique);
       }
   }

//(Array) Find Maximum
//Write a method that can find the maximum number from an int Array

        int[] nmbrs={50,100,150,200};

        Arrays.sort(nmbrs); //to get min to max
        System.out.println(Arrays.toString(nmbrs));

        int lastindexnumber=nmbrs.length-1;
        System.out.println(lastindexnumber); //3

        System.out.println("max number is : "+ nmbrs[3]);

        System.out.println("...........");

//(Array) Find Minimum
//Write a method that can find the min number from an int Array


    int [] min= {500,-10,0,20};

   Arrays.sort(min);
   System.out.println("min number is: " + min[0]);


        System.out.println("............");


  //(Array) Concat two arrays
//Write a return method that can concate two arrays

       int [] a={10,20,30};
       int [] d={40,50,60};

      //newlist size will be 6

        int [] newlist= new int [a.length+d.length]; //all list will be 0,0,0,0,0,0

        //i need to assign from a to newlist

        for( int m=0; m< a.length; m++){
            newlist [m] =a[m];  //it will continue until 4
        }

        // i just added 'a' to newlist, i need to do it for d

        for(int m=0; m<d.length; m++) {
            newlist[a.length + m] = d[m];   //it will continue until 4 //
                                            // i already added a, thats why, i used newlist[a.length+m]
        }

        System.out.println(Arrays.toString(newlist));



     }
}

//         DCBA
//        ..................
//        enter 2 words that have same length
//        deniz
//        ceren
//        2 words are same : false
//        .............
//        [50, 100, 150, 200]
//        3
//        max number is : 200
//        ...........
//        min number is: -10
//        ............
//        [10, 20, 30, 40, 50, 60]
//
//        Process finished with exit code 0

