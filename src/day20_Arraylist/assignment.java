package day20_Arraylist;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class assignment {


        public static void main(String[] args) {
            System.out.println("Question one");
            //(String) Frequency of Characters
            //String -- Frequency of Characters
            //Write a return method that can find the frequency of characters
            System.out.println("(String) Frequency of Characters");

            Scanner input = new Scanner(System.in);
            System.out.println("Enter an string");
            String sentence1 = input.nextLine();

            int[] freq = new int[sentence1.length()]; // niye buraya new dedik niye direkt int yazip devam etmedik
            int i, j;

            char[] senChar = sentence1.toCharArray();

            for (i = 0; i < sentence1.length(); i++) {
                freq[i] = 1;
                for (j = i + 1; j < sentence1.length(); j++) {
                    if (senChar[i] == senChar[j]) {
                        freq[i]++;
                        senChar[j] = '0';
                    }
                }
            }

            for (i = 0; i < freq.length; i++) {
                if (senChar[i] != '0' && senChar[i] != ' ') {
                    System.out.println(senChar[i] + " -" + freq[i]);
                }
            }

            System.out.println("Question Two");

            //(String) Sum of Digits in a string
            //Write a method that can return the sum of the digits in a string

            String sen = " Meral 123Ali06";

            int sum = 0;
            char[] sen2 = sen.toCharArray();  //niye bunu yaptik
            for (char each : sen2) {
                if (Character.isDigit(each)) {
                    sum += Integer.parseInt("" + each);

                }
            }
            System.out.println(sum);


            System.out.println("Question 3");

            //(String) Sort Letters and Numbers from alphanumeric String
            //Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
            //sort the individual string and append them back together
            //Ex:
            //Input:  "DC501GCCCA098911"
            //OutPut: "CD015ACCCG011899"

            System.out.println("without using sort method ");

            String sentence = "DC501GCCCA098911";
            char numbers = ' ';

            char[] arr = sentence.toCharArray();
            System.out.println(Arrays.toString(arr));

            for (char each1 : arr) {

                if (Character.isDigit(each1)) {
                    numbers = each1;
                }
                System.out.print(numbers);
            }


            System.out.println("next step");

            char temp;

            for (int i1 = 0; i1 < sentence.length(); i1++) {
                for (int j1 = i + 1; j1 < sentence.length(); j1++) {

                    if (arr[i1] > arr[j1]) {
                        temp = arr[i1];
                        arr[i1] = arr[j1];
                        arr[j1] = temp;


                    }

                }
            }


            System.out.println(new String(arr)); ///it does not work


            System.out.println("QUESTION 4 //(String) Password Validation Task");
//1. Write a return method that can verify if a password is valid or not.

//requirements:
//1. Password MUST be at least have 6 characters and should not contain space
//2. PassWord should at least contain one upper case letter
//3. PassWord should at least contain one lowercase letter
//4. Password should at least contain one special characters
//5. Password should at least contain a digit
//if all requirements above are met, the method returns true, otherwise returns  false

            final int numUppercaseLetter = 1;
            final int numLowercaseLetter = 1;
            final int numSpecialCharacter = 1;
            final int numDijit = 1;

            int countUpper = 0;
            int countLower = 0;
            int countSpecial = 0;
            int countDijit = 0;


            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your password");
            String password = scan.nextLine();
            int passwordlenght = password.length();
            //Character; this will helps us to know if the char.is a digit,uppercase or lowercase

            if (passwordlenght < 6 || password.contains(" ")) {
                System.out.println("it needs more character and there should not be space");
            } else {

                for (int i5 = 0; i5 < passwordlenght; i5++) {
                    char ch = password.charAt(i5);

                    if (Character.isUpperCase(ch)) {
                        countUpper++;
                    } else if (Character.isLowerCase(ch)) {
                        countLower++;
                    } else if (Character.isDigit(ch)) {
                        countDijit++;
                    }
                }


                if (countDijit >= numDijit && countLower >= numLowercaseLetter && countUpper >= numUppercaseLetter &&
                        countSpecial >= countSpecial) {
                    System.out.println("Valid Password");
                } else {
                    System.out.println("The password did not enough of following");
                    if (countDijit < numDijit) {
                        System.out.println("dijit number is not enough");
                    }
                    if (countLower < numLowercaseLetter) ;
                    {
                        System.out.println("lowercase letter is not enough");
                    }
                    if (countUpper < numUppercaseLetter) ;
                    {
                        System.out.println("uppercase is not enough");
                    }
                    if (numSpecialCharacter < countSpecial) {
                        System.out.println("count special character is not enough");
                    }

                }
            }


            System.out.println("Question 6");
            //(Array) Move Zeros to the End
            // Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
            //Ex:
            //input:  {1,0,2,0,3,0,4,0};
            //output: [1, 2, 3, 4, 0, 0, 0, 0]

            ArrayList<Integer> numberslist = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

            ArrayList<Integer> newlist = new ArrayList<Integer>();

            for (Integer eachnumber : numberslist) {
                newlist.add(eachnumber);
            }
            System.out.println(newlist);

            int max = Integer.MIN_VALUE;


            for (int i4 = 0; i < numberslist.size(); i++) {
                if (numberslist.get(i) > max) {
                    max = numberslist.get(i);
                }
                System.out.println(numberslist);
            }

            System.out.println("QUESTION 7");

            factorial(5);
            System.out.println(factorial(5));


            System.out.println("QUESTION 8");

            System.out.println("fibonacci(10) = " + fibonacci(10));

        }

        //   QUESTION 7
        //(Numbers) Factorial Number
        //Write a return method that returns the factorial number of any given number
        //Ex:
        //Input: 5
        //outPut: 120

        public static int factorial(int num) {
            int number = 5;

            int fact = 1;

            for (int i = 1; i <= number; i++) {

                fact = fact * i;

            }
            return fact;
        }


        //QUESTION 8

        //(Numbers) Fibonacci numbers
//Write a return method that returns the  Fibonacci of any given number
/*:white_check_mark:
2
:+1::skin-tone-3:
1
:v::skin-tone-3:
1

*/

        public static int fibonacci(int number) {
            if (number == 1 || number == 2) {
                return 1;
            }
            return fibonacci(number - 1) + fibonacci(number - 2);

        }



}
