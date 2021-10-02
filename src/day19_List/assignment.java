package day19_List;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class assignment {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 7; i++) {
            list.add(i);
        }
        System.out.println("..........1..........");
        System.out.print("list = " + list);
        System.out.println();
        reversed(list);
        System.out.println(".........2..........");


        //or//
        ArrayList<Integer> listt = new ArrayList<>();

        listt.add(1);
        listt.add(2);
        listt.add(3);
        listt.add(4);
        listt.add(5);
        listt.add(6);
        System.out.println("list = " + listt);

        Integer reverse = listt.size();

        System.out.print("newlist: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            reverse = list.get(i);
            System.out.print(reverse + ",");
        }

        System.out.println();
        System.out.println("........4............");

        ArrayList<Integer> listneww = new ArrayList<>();
        listneww.add(1);
        listneww.add(1);
        listneww.add(2);
        listneww.add(2);
        listneww.add(3);
        listneww.add(4);
        listneww.add(6);
        listneww.add(6);
        ArrayList<Integer> unique = uniquelist(listneww);

        System.out.println("........5........");
        ArrayList<String> last = new ArrayList<>();
//
//       last.add(A);
//        last.add(B);
//        last.add(C);
//        last.add(D);
//        combine.add();
//        combine.add(4);
//        combine.add(6);
//        combine.add(6);
//


    }


 /*
    write a program that can return the sum of all the digits from a string
            ex:
                input: "hello 5world a1b2c3"
                output: 11
                    (1+2+3 + 5=11)
            HINT: on ascii table, the characters between #48 ~ #57 are digits
     */


//write a return method that will print max number from arraylist
//write a return method that will print min number from arraylist

//        1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
//
//        2. Write a Java program to iterate through all elements in an array list.
//
//        4. Write a Java program to retrieve an element (at a specified index) from a given array list
//

    //write a return method that will reversed

    public static ArrayList<Integer> reversed(ArrayList<Integer> numbers) {

        System.out.print("newlist= ");
        for (int i = numbers.size() - 1; i >= 0; i--) {

            System.out.print(+numbers.get(i) + ", ");

        }
        System.out.println();
        return numbers;
    }


 /*
  write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques

    ex: list==> {1,1,2,3,3,4,5,6}
    uniques ==> {2,4,5,6}
    */

    public static ArrayList<Integer> uniquelist(ArrayList<Integer> list) {

        ArrayList<Integer> unique = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {   //size() is like length
            int counting = 0;

            for (int d = 0; d < list.size(); d++) {
                if (list.get(i) == (list.get(d))) {    //comparing 2 for loops: i vs.d
                    counting++;
                }
            }

            if (counting == 1) {
                System.out.println(list.get(i));
            }

        }
        return list;

    }
//
//    public static ArrayList<String> combinedlist() {
///*
//     write a program that can combine two String arrays into one arrayList
//            ex:
//                arr1 = {"A", "B", "C"};
//                arr2 = {"D", "E", "F", "G"};
//                list ==> {"A", "B", "C", "D", "E", "F", "G"}
//     */
//
//        String[] str1 = {"A", "B", "C"};
//        String[] str2 = {"D", "E", "F", "G"};
//
//        //ArrayList<String> last = new ArrayList<>(srt1);
//
//
//    }






}
