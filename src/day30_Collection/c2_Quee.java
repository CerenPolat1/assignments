
package day30_Collection;


import myMethods.myLibraryMethods;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class c2_Quee {

    //  //  second part of collection :QUEUE, first one is List, third one is Set ..and all of them is interface
    //
    //  Queue<String> q=new Queue<String>();  Quee is interface
    //    //   Queue(I):
    //    does not have index number ,
    //    size dynamic ,
    //    it accepts duplicates,
    //    1.rule: first in first out order. :FIFO (ilk giren ilk çıkar)
    //    Pool() Poll() method: removes the first object in the queue.

    public static void main(String[] args) {
        Queue<Integer> numbers=new PriorityQueue<>();
        //FIFO
        //it will sort in queue logic
        //it is not always going to sort from small to large
        //it has own sort logic

        numbers.add(20);
        numbers.add(20);
        numbers.add(1);
        numbers.add(11);
        numbers.add(200);
        numbers.add(15);
        numbers.add(3);


        System.out.println(numbers);//[1, 11, 3, 20, 200, 20, 15] //it will sort in quee logic.. randomly output verir
        //o yuzden cok kullanisli degil bu yuzden diyoruz //it has own sort logic and there is no index

        Integer number=numbers.poll(); // no index in quee it is going to pool first in number (FIFO)..ilk sayiyi cikarir
        System.out.println("number = " + number);
        System.out.println(numbers);

        myLibraryMethods.stars();


        Queue<Integer> numbers2=new ArrayDeque<>();//FIFO // no sort logic
        // ArrayDeque, listeni nasil olusturduysan o sirayl;a verir

        numbers2.add(20);
        numbers2.add(20);
        numbers2.add(1);
        numbers2.add(11);
        numbers2.add(200);
        numbers2.add(15);
        numbers2.add(3);
        numbers2.add(1);

        System.out.println(numbers2);//[20, 20, 1, 11, 200, 15, 3, 1] // ArrayDeque, listeni nasil olusturduysan o sirayla run eder

        Integer number2=numbers2.poll(); //ilk sayiyi cikarir : //FIFO (ilk giren ilk çıkar)

        System.out.println("number2 = " + number2);
        System.out.println(numbers2);

        //   what is the differences between list and queue?????
        //1-list has LIFO, queue has FIFO



    }
}
