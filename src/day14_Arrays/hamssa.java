package day14_Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class hamssa {
    public static void main(String[] args) {

         //(String) Reverse
//Write a return method that can reverse  String
//Ex: Reverse("ABCD"); ==> DCBA
        String str = "ABCDEFGH";
        String reverseStr = "";
        char[] letters = str.toCharArray();
        char[] reverse = new char[letters.length];
        for (int i = 0; i < letters.length; i++) {
            reverse[i] = letters[letters.length - 1 - i];
            reverseStr = reverseStr + reverse[i];
        }
        System.out.println(str);
        System.out.println(reverseStr);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//(String) Same Letters
//Write a return method that check if a string is build out of the same letters as another string.
//Ex:  same("abc",  "cab"); -> true
//same("abc",  "abb"); -> false:
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter 2 word of same number of letters :");
        String str1 = userInput.nextLine();
        String str2 = userInput.nextLine();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean b = Arrays.equals(arr1, arr2);
        System.out.println("both words are same :" + b);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//(String) Remove Duplicates
//Write a return method that can remove the duplicated values from String
//Ex:  removeDup("AAABBBCCC")  ==> ABC
        System.out.println("Enter your String:");
        String word = userInput.nextLine();

        char[] wordArr = word.toCharArray();
        int j = 1;
        int l = 0;
        String newOut = "" + wordArr[0];
        String unique = "" + wordArr[0];
        while (j != wordArr.length) {
            if (wordArr[j] != wordArr[j - 1]) {
                newOut = newOut + wordArr[j];
            }
            j++;
        }
        System.out.println("String without dublicates: " + newOut);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//(String) Find the unique
//Write a return  method that can find the unique characters from the String
//Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
        for (int i = 0; i < wordArr.length; i++) {
            int count=0;
            for (int a = 0; a <wordArr.length ; a++) {
                if (wordArr[i] == wordArr[a]) {
                    count++;
                }
            }
            if (count == 1){
                unique=""+wordArr[i];
                System.out.println(unique);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//(Array) Find Maximum
//Write a method that can find the maximum number from an int Array
        System.out.print("Enter your array size: ");
        int size = userInput.nextInt();
        int[] num = new int[size];
        System.out.println("Enter " + size + " numbers for the array :");
        for (int i = 0; i < size; i++) {
            num[i] = userInput.nextInt();
        }
        System.out.println("the array is : " + (Arrays.toString(num)));
        Arrays.sort(num);
        System.out.println("the largest number is : " + num[num.length - 1]);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//(Array) Concat two arrays
//Write a return method that can concate two arrays
        System.out.print("Enter your first array size: ");
        int s1 = userInput.nextInt();
        String[] first = new String[s1];
        System.out.println("Enter " + s1 + " elements for the array :");
        for (int i = 0; i < s1; i++) {
            first[i] = userInput.next();
        }
        System.out.println("your first array is :" + (Arrays.toString(first)));
        System.out.print("Enter your second array size: ");
        int s2 = userInput.nextInt();
        String[] second = new String[s2];
        System.out.println("Enter " + s2 + " elements for the array :");
        for (int i = 0; i < s2; i++) {
            second[i] = userInput.next();
        }
        System.out.println("your second array is :" + (Arrays.toString(second)));
        String[] concat = new String[s1 + s2];
        for (int i = 0; i < s1; i++) {
            concat[i] = first[i];
        }
        for (int i = 0; i < s2; i++) {
            concat[s1 + i] = second[i];
        }
        System.out.println("your new array : " + (Arrays.toString(concat)));




//
//        10:25
//        ABCDEFGH
//                HGFEDCBA
//        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//                Enter 2 word of same number of letters :
//        hamsa
//                samha
//        both words are same :true
//        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//                Enter your String:
//        AAABBBCCDEF
//        String without dublicates: ABCDEF
//        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//                D
//        E
//                F
//        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//                Enter your array size: 4
//        Enter 4 numbers for the array :
//        92
//        58
//        61
//        70
//        the array is : [92, 58, 61, 70]
//        the largest number is : 92
//        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//                Enter your first array size: 3
//        Enter 3 elements for the array :
//        66
//        77
//        33
//        your first array is :[66, 77, 33]
//        Enter your second array size: 5
//        Enter 5 elements for the array :
//        31
//        61
//        78
//        90
//                -1
//        your second array is :[31, 61, 78, 90, -1]
//        your new array : [66, 77, 33, 31, 61, 78, 90, -1]












    }
}
