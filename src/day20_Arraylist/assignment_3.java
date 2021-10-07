package day20_Arraylist;

import java.lang.reflect.Array;
import java.time.OffsetTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class assignment_3 {
    public static void main(String[] args) {

//1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
        ArrayList<String> collection= new ArrayList<>();

        collection.addAll(Arrays.asList("blue, pink, white"));
        System.out.println(collection);

        System.out.println(".....2....");

//2. Write a Java program to iterate through all elements in an array list.

        ArrayList<Integer> list= new ArrayList<>();

        for(int i=0; i<6; i++){
          list.add(i);
        }

        System.out.println(list);
        System.out.println("......3.....");


//3. Write a Java program to insert an element into the array list at the first position.

    ArrayList<Integer> element= new ArrayList<>();

    element.addAll(Arrays.asList(100,200,300));
        System.out.println(element);

    element.add(0,50);
        System.out.println(element);
        System.out.println("........4.......");

//4. Write a Java program to retrieve an element (at a specified index) from a given array list.

        ArrayList<Integer> retrieved = new ArrayList<>();

        retrieved.add(10);
        retrieved.add(20);
        retrieved.add(30);
        System.out.println(retrieved);

        retrieved.remove(0); // just put index number for remove, but for removeAll just put element
        System.out.println(retrieved);
        System.out.println("..........5.........");

//5. Write a Java program to update specific array element by given element.

        ArrayList<Integer> specific = new ArrayList<>();

        specific.addAll(Arrays.asList(1,2,3,4,5,7,7));

        specific.set(5,6);  //it just puts 6 instead of 7
        System.out.println(specific);

        System.out.println(".........6......");

//6. Write a Java program to remove the third element from a array list.
        specific.remove(3);
        System.out.println(specific);
        System.out.println("........7......");

//7. Write a Java program to search an element in a array list.

ArrayList<Integer> specificc= new ArrayList<>();

specificc.addAll(Arrays.asList(100,50,150));
        System.out.println(specificc);

        System.out.println("specific has 200: "+ specific.contains(200));
        System.out.println(".....8......");

//8. Write a Java program to sort a given array list.


        Collections.sort(specificc);  //50,100,150
        System.out.println(specificc);
        System.out.println(".....9....");

//9. Write a Java program to copy one array list into another.

        ArrayList<Integer> original= new ArrayList<>();
        original.addAll(Arrays.asList(200,300,400));

        ArrayList<Integer> copy= new ArrayList<>();

        for(int i=0; i< original.size(); i++){
           copy.add(original.get(i));
        }
        System.out.println(copy);
        System.out.println(".....10.....");

//10. Write a Java program to shuffle elements in a array list.  hint :  Collections.shuffle(list_Strings);

        Collections.shuffle(original);  ///bigest to smallest
        System.out.println(original);
        System.out.println("......11.......");

//11. Write a Java program to reverse elements in an array list.

        ArrayList<Integer> reversed= new ArrayList<>();

        reversed.addAll(Arrays.asList(100,200,300));

        for(int i=reversed.size()-1; i>=0; i--){


        }

        System.out.println(reversed);
        System.out.println("..........12.......");

//13. Write a Java program to compare two array lists.

        ArrayList<Integer> one=new ArrayList<>();
        one.addAll(Arrays.asList(1,2,3));

        ArrayList<Integer> other= new ArrayList<>();

        other.addAll(Arrays.asList(4,5,6));

        System.out.println(one + " = "+ other + ":" + one.equals(other));
        System.out.println(".....13.....");


//14. Write a Java program of swap two elements in an array list.

   ArrayList<Integer> changes= new ArrayList<>();
   changes.addAll(Arrays.asList(5,5,7,7));
        System.out.println(changes);
   changes.set(0,4);
   changes.set(2,6);
        System.out.println(changes);
        System.out.println(".....14.....");

//15. Write a Java program to join two array lists.


//17. Write a Java program to empty an array list.

        changes.clear();
        System.out.println(changes);
        System.out.println(".....15.....");

//18. Write a Java program to test an array list is empty or not.

        System.out.println(changes.isEmpty()); //true
        System.out.println(".....16.....");

//21. Write a Java program to replace the second element of a ArrayList with the specified element.

       ArrayList<Integer> specify= new ArrayList<>();
       specify.addAll(Arrays.asList(3,4,5,6));
        specify.set(0,2);
        System.out.println(specify);
        specify.set(1,3);
        System.out.println(specify);
        System.out.println(".....17.....");

//22. Write a Java program to print all the elements of a ArrayList using the position of the elements.

        ArrayList<Integer> position= new ArrayList<>();

        position.add(7);
        position.add(8);
        position.add(9);

        for(int i=0; i< position.size(); i++){
            position.get(i);
        }
        System.out.println(position);
    }

}


//        [blue, pink, white]
//        .....2....
//        [0, 1, 2, 3, 4, 5]
//        ......3.....
//        [100, 200, 300]
//        [50, 100, 200, 300]
//        ........4.......
//        [10, 20, 30]
//        [20, 30]
//        ..........5.........
//        [1, 2, 3, 4, 5, 6, 7]
//        .........6......
//        [1, 2, 3, 5, 6, 7]
//        ........7......
//        [100, 50, 150]
//        specific has 200: false
//        .....8......
//        [50, 100, 150]
//        .....9....
//        [200, 300, 400]
//        .....10.....
//        [400, 200, 300]
//        ......11.......
//        [100, 200, 300]
//        ..........12.......
//        [1, 2, 3] = [4, 5, 6]:false
//        .....13.....
//        [5, 5, 7, 7]
//        [4, 5, 6, 7]
//        .....14.....
//        []
//        .....15.....
//        true
//        .....16.....
//        [2, 4, 5, 6]
//        [2, 3, 5, 6]
//        .....17.....
//        [7, 8, 9]
//
//        Process finished with exit code 0