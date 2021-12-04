package day26_owerwriting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class mixed_questions {
    public static void main(String[] args) {


        System.out.println("........1.question.........");

        //        (Numbers) Swap Numbers
        //        Swap two variable' values without using a third variable

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        Collections.swap(list, 4, 5);  //swap requires index instead of number.

        System.out.println(list);


        System.out.println("........2.question.........");

        //(Numbers) Divide without / operator
        //    Write a method that can divide two numbers without using division operator


        int a = 10;
        int b = 30;

        if (a % 10 == 0 && b % 10 == 0) {
            System.out.println(a + " and " + b + " numbers can divide 10.");
        } else {
            System.out.println("they cant divide 10.");
        }

        System.out.println("........3.question.........");


        mixed_questions num = new mixed_questions();

        System.out.println(num.reverse(-1));

        System.out.println("........4.question.........");


        //        (ArrayList) Remove "Ahmed"
        //        Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
        //        Write a java operation to remove all the names named Ahmed

        ArrayList<String> listt = new ArrayList<>();
        listt.addAll(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

      listt.removeAll(Arrays.asList("Ahmed")); //tum Ahmedleri cikarir
        //listt.remove("Ahmed"); ////ilk Ahmedi cikarir

        System.out.println(listt);


        System.out.println("........5.question.........");

        //        (ArrayList) Remove Some Values
        //        Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

        ArrayList<Integer> values = new ArrayList<>();
        values.addAll(Arrays.asList(1, 2, 3, 101, 120));


        for (int i = 0; i < values.size(); i++) {

            if (values.get(i) < 100) {
                System.out.print(values.get(i) + " ,");
            }
        }
        System.out.println();

        System.out.println("........6.question.........");


        //        (ArrayList) sorting in ascending
        //        Write a method that can sort the ArrayList in Ascending order without using the sort method




        //        (ArrayList) sorting in descending order
        //        Write a method that can sort the ArrayList in descending order without using the sort method




        //        (Number) Reverse Negative Number
        //        Write a return method that can reverse negative number and return it as int
    }

    public int reverse(int num2){

        if(num2<0 ){
            return num2;
        } else{
            return num2;
        }

    }


}



//
//........1.question.........
//        [1, 2, 3, 4, 6, 5]
//        ........2.question.........
//        10 and 30 numbers can divide 10.
//        ........3.question.........
//        -1
//        ........4.question.........
//        [John, Eric]
//        ........5.question.........
//        1 ,2 ,3 ,
//        ........6.question.........
//
//        Process finished with exit code 0
//
