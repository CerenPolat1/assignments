package day30_Collection;


// Data Structures
//        1 Array (fixed)
//        2 Collection (Dynamic)
//        3 Map

//   ***Collection is a data structure

//                  ******* *Arraylist is coming from collection.



import myMethods.myLibraryMethods;

import java.util.*;

public class c1_List {

    //  *******list is parent of arraylist, linkedlist and vector *********
    //    //list is an interface its not class so you cant create object from list

    //    //****differences between list types is way of creation
    // for exp"arraylist created single linked,

    //    //        Collection (I) (parent) : extended by List(I),Set(I),Queue(I) (child)
    ////
    ////        Lıst(I): implemented by ArrayList(C),LınkedList(C),Vector(C)
    ////
    ////        ArrayList(C): Internally uses array, singly linked
    ////                ---Singly linked == it (Singly linked) will retrieve data  faster than others (get)
    ////
    ////        LinkedList(C): each object are doubly linked.
    ////                ---Doubly linked == removing adding functions are faster

    //        LinkedList adds number faster than ArrayList but a few fast
    ////
    ////        Vector(C): array based class, is synchronized  ,only prefer in multi thread
    ////              ---Synchronized: used for achiving thread-safety
    ////                      adv=thread safe
    ////                      disadv= slower
    ////                 thread: process of operating system scheduling object
    ////             --extended by Stack(C) : array based class ,is synchorized, last in first out order
    ////  pop() method : LIFO (last in first out order), returns the last object from the stack and removes it from stack

    //Vector is  slowest one because of sencronised but there are not more differences
    //
    //    //list general points ;
    //    //1.List are allowing dublicate objects
    //    //2.order : list will keep the insertion order.
    //    //3.null elements : list will allow you to use  null elements;
    //    //4.list has dynamic size

    public static void main(String[] args) {

//        List<Integer> numberlist= new List<Integer>()
        //you cant create object from interfaces

        List<Integer> list=new ArrayList<>(); //polymorphism
        list.add(25);
        list.add(25);    //    //1. rule: List are allowing dublicate objects

        System.out.println(list);

        ArrayList <String> words =new ArrayList<>();
        words.add("Hello");
        words.add("Hello");
        words.add("Hello");
        words.add(null);
        words.add(null);
        words.add(null);
        words.add(null);
        words.add(null);    //    //3. rule: null elements : list will allow you to use any number of null elements;

        //istedigimiz kadar dublicate ve null ekleyebiliyoruz.

        System.out.println(words);

        List<Integer> list2=new LinkedList<>();
        list2.add(20);
        list2.add(10);
        list2.add(20);
        list2.add(15);
        list2.add(15);
        //    //4.rule:list has dynamic size.. eklemeler yapabiliyorsun
        list2.remove(0);
        // linked list removes faster than ArrayList, but Arraylist will get faster than LinkList..
        // that is the differences each other.

//    //    //2.order : list will keep the insertion order. run uaptiginda yukaridaki siraya gore run yapar sirayi degistirmez
        System.out.println(list2);

        myLibraryMethods.stars();

        List<Integer> list3=new Vector<>();
        list3.add(20);
        list3.add(20);
        list3.add(40);
        list3.add(40);

        System.out.println(list3);


        Stack<Integer> numbers=new Stack<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(5);
        numbers.add(5);
        System.out.println(numbers);


        ////  pop(): LIFO((last in first out order-son giren ilk çıkar), returns the last object from the stack and removes it from stack

        Integer number=numbers.pop(); //it will remove last object from stack list
        System.out.println("number = " + number);
        System.out.println(numbers);


        //list general points ;
        //    //1.List are allowing dublicates objects
        //    //2.order : list will keep the insertion order.
        //    //3null elements : list will allow you to use any number of null elements;
        //    //4.list has dynamic size


        System.out.println("---------------");


        System.out.println(firstLetterUpperCase("esra gonca kilic sarp"));






    }


    public static String firstLetterUpperCase(String name) {
        if ((name== null) || (name.trim().length() == 0)) {
            return name;
        }

        String namee="";
        String output ="";
        String[] nameOutput = name.split(" ");

        for(int j =0 ; j< nameOutput.length ; j++ ){
            if(j < nameOutput.length-1) {
                output= output.concat(nameOutput[j].substring(0,1).toUpperCase()+".");
            }
            else
                output= output.concat(nameOutput[j].substring(0,1).toUpperCase() + nameOutput[j].substring(1));
        }

        return output;




    }
}