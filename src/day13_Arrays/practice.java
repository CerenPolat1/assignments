package day13_Arrays;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {


// a set of variables referenced by using a single
// variable name combined with an index number

float [] f= {3.5f, 4.6778f};
            //0      //1


// floats are tricky b/c their syntax
        // remember syntax and structure

        // do you know how to access one index in the array?

        //.length() counts from 1, 2, 3, 4, but indexing starts from 0

        // print out the zero index
        System.out.println(f[0]);
        int b=f.length;
        // there is no .length method in the float data type


        //compiler must play with the same things in a for loop
        // at least for the start stop step - if one is an integer, the others must as well
        // before, the start was a 'float' and the stop was an integer
        // these two data types are incompatible within the loop's condition
        for(int i=0; i< f.length; i++){
            System.out.println(f[i]);
        }
//        System.out.println(("-------"));
//        Scanner input= new Scanner(System.in);
//        System.out.println( "enter number");
//       String names= input.nextline();
//
//
//        for( int c=0; c< names.length; c++){
//            System.out.println(names[c]);
        }

//







    }




