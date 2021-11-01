package day30_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class assignment {

    /*



 (ArrayList) sorting in descending order
Write a method that can sort the ArrayList in descending order without using the sort method

 */

    public static void main(String[] args) {

        //(Numbers) Swap Numbers
        //Swap two variable' values without using a third variable

        int a = 1;
        int b = 2;

        a = b / a;
        b = a / b;

        System.out.println("a=" + a + ", b=" + b);
        System.out.println("..........");

//        (Numbers) Divide without / operator
//        Write a method that can divide two numbers without using division operator


        int c = 100;
        int d = 100;

        if (c % 10 == 0 & d % 10 == 0) {
            System.out.println("both can divide 10");
        } else {
            System.out.println("failure");
        }

        System.out.println("..........");


//        (ArrayList) Remove "Ahmed"
//        Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
//        Write a java operation to remove all the names named Ahmed


        ArrayList<String> mylist=new ArrayList<>();
        mylist.addAll(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        mylist.removeAll(Arrays.asList("Ahmed"));
        System.out.println(mylist);

        System.out.println("..........");

//        (ArrayList) Remove Some Values
//        Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

        ArrayList<Integer> list= new ArrayList<>();

        list.addAll(Arrays.asList(90,100,110,80));




        for(int i=0; i<list.size(); i++){
            if(list.get(i)<=100) {
                System.out.print(list.get(i)+",");
            }
        }
        System.out.println("..........");

//        (ArrayList) sorting in ascending
//        Write a method that can sort the ArrayList in Ascending order


        ArrayList<Integer> newlist=new ArrayList<>();
        newlist.addAll(Arrays.asList(20,10,40,30));

       Collections.sort(newlist);
       System.out.println(newlist);


    }

    }

//         a=2, b=1
//        ..........
//        both can divide 10
//        ..........
//        [John, Eric]
//        ..........
//        90,100,80,..........
//        [10, 20, 30, 40]
//
//        Process finished with exit code 0