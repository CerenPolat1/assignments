package day20_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class assignment_1 {
    public static void main(String[] args) {

//(String) Frequency of Characters
//String -- Frequency of Characters
//Write a return method that can find the frequency of characters

        ArrayList<Integer> frequency= new ArrayList<>();

        frequency.addAll(Arrays.asList(5,10,15,15,15,20,20));





//(String) Sum of Digits in a string
//Write a method that can return the sum of the digits in a string

        String  a = "222225";
        String [] b=a.split("");
        System.out.println(Arrays.toString(b)); //en basindan sonuna kadar yazdir demek, tostring olmazsa hashcode verirdi
         int sum=0;

        for (int i = 0; i < b.length; i++) {   // arrayda lengthte parantez yok
            sum+=i;  // tum b'nin indexini toplamak icin
        }
        System.out.println(sum);

//(String) Sort Letters and Numbers from alphanumeric String

        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));










//Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
//sort the individual string and append them back together
//Ex:
//Input:  "DC501GCCCA098911"
//OutPut: "CD015ACCCG011899"

//(String) Password Validation Task
//1. Write a return method that can verify if a password is valid or not.
//requirements:
//1. Password MUST be at least have 6 characters and should not contain space
//2. PassWord should at least contain one upper case letter
//3. PassWord should at least contain one lowercase letter
//4. Password should at least contain one special characters
//5. Password should at least contain a digit
//if all requirements above are met, the method returns true, otherwise returns  false

//(Array) Move Zeros to the End
//Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
//Ex:
//input:  {1,0,2,0,3,0,4,0};
//output: [1, 2, 3, 4, 0, 0, 0, 0]

//(Numbers) Factorial Number
//Write a return method that returns the factorial number of any given number
//Ex:
//Input: 5
//outPut: 120

//(Numbers) Fibonacci numbers
//Write a return method that returns the  Fibonacci of any given number


    }
}

