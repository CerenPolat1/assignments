package day20_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class assignment_2 {
    public static void main(String[] args) {


//create 3 different arraylist : Double , Integer , String .

        ArrayList <Double> doubleone= new ArrayList<>();
        ArrayList<Integer> integerone= new ArrayList<>();
        ArrayList<String> stringone= new ArrayList<>();

        System.out.println(".....2.....");

        //use add method to add 5 data for each of arraylist(use add(data) also use add(index,data))

      ArrayList<Integer> data= new ArrayList<>();

       data.add(0,10);
       data.add(1, 20);
       data.add(2, 30);
       data.add(3,40);
       data.add(4,50);

        System.out.println(data);
        System.out.println("......3......");

//use remove method to remove 2 of them (use index number to remove or object name to remove)

        data.remove(0); // when removing 1st index -> [20,30,40,50]
        data.remove(2); // [20, 30, 50]
        System.out.println(data);
        System.out.println("......4......");

//print size of list

        System.out.println(data.size()); //3
        System.out.println(".......5......");

//use indexof method to print last index of arraylists

        System.out.println(data.indexOf(50));  //2
        System.out.println("........6.......");

//use contains method to check if your arraylist are contain the data that you passed

        System.out.println(data.contains(60)); //false
        System.out.println(".......7.......");

//use Collections.sort method to sort your arrray list and use get method to print them

        ArrayList<Integer> list= new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        Collections.sort(list);
        System.out.println(list);

        System.out.println("......8......");

//use clear method to clear all your list

        list.clear();
        System.out.println(list);
        System.out.println("........9......");

//check if they are empty by isEmpty method

        list.isEmpty();
        System.out.println(list);
        System.out.println("........10......");

//use bulk operations to add multiple data(10) to your arraylist

        ArrayList<Integer> multiple= new ArrayList<>();

        multiple.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(multiple);
        System.out.println("........11.......");

//use containsAll method to check if they are contain those data that you passed

        System.out.println(multiple.containsAll(Arrays.asList(1,2,3,4)));
        System.out.println(multiple.containsAll(Arrays.asList(20)));
        System.out.println(".......12........");

//use retainAll to retain ony 5 data in your lists

        multiple.retainAll(Arrays.asList(1,2,3,4,5));
        System.out.println(multiple);
        System.out.println("........13.......");

//use removeall method to remove 3 data in your list

     multiple.removeAll(Arrays.asList(1,2,3));
     System.out.println(multiple);


    }

}

//        .....2.....
//        [10, 20, 30, 40, 50]
//        ......3......
//        [20, 30, 50]
//        ......4......
//        3
//        .......5......
//        2
//        ........6.......
//        false
//        .......7.......
//        [1, 2, 3]
//        ......8......
//        []
//        ........9......
//        []
//        ........10......
//        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//        ........11.......
//        true
//        false
//        .......12........
//        [1, 2, 3, 4, 5]
//        ........13.......
//        [4, 5]