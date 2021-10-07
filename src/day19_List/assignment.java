package day19_List;

import java.util.ArrayList;


public class assignment {
    public static void main(String[] args) {


//  /*
//     write a program that can print the list of integers in reversed order
//        ex:
//            list=> {1,2,3,4,5,6}
//            output: 6 5 4 3 2 1
//     */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        ArrayList<Integer> newone = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            newone.add(list.get(i));
        }
        System.out.println("reversed order: " + newone);

        System.out.println("............2...............");

//    write a program that can return the sum of all the digits from a string
//            ex:
//                input: "hello 5world a1b2c3"
//                output: 11
//                    (1+2+3 + 5=11)
//            HINT: on ascii table, the characters between #48 ~ #57 are digits
//     */

 /*
  write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques

    ex: list==> {1,1,2,3,3,4,5,6}
    uniques ==> {2,4,5,6}

    */

        ArrayList<Integer> arraylist= new ArrayList<>();

        arraylist.add(1);
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(3);

        ArrayList<Integer> unique= new ArrayList<>();

       for(int i=0; i < arraylist.size(); i++){
           int count=0;
           for(int k=0; k< arraylist.size(); k++){
           if(arraylist.get(i)==arraylist.get(k))
               count++;
           }
           if(count==1){
               unique.add(arraylist.get(i));
           }

       }
        System.out.println("unique list: "+ unique);

        System.out.println(".............");


/*
     write a program that can combine two String arrays into one arrayList
            ex:
                arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};
                list ==> {"A", "B", "C", "D", "E", "F", "G"}
     */
        String[] str = {"A", "B", "C"};
        String[] str2 = {"D", "E", "F", "G"};

        ArrayList<String> onearray = new ArrayList<>();

        for (int i = 0; i < str.length; i++) {
            onearray.add(str[i]);

        }
        for (int a = 0; a < str2.length; a++) {
            onearray.add(str2[a]);
        }

        System.out.println("arraylist: "+ onearray);

        System.out.println("...........3............");


//        4. Write a Java program to retrieve an element (at a specified index) from a given array list

        //write a return method that will print max number from arraylist
        ArrayList<Integer> listt = new ArrayList<>();
        listt.add(5);
        listt.add(2);
        listt.add(4);
        listt.add(3);

        Integer maxx = listt.get(0); //let's assume, i can put any index num from above bec. it is just assume

        for (int i = 0; i < listt.size(); i++) {

            if (listt.get(i) > maxx) {
                maxx = listt.get(i);
            }
        }
        System.out.println("maxx number: "+ maxx);

        System.out.println(".........4...........");


        //write a return method that will print min number from arraylist

        ArrayList<Integer> lisst = new ArrayList<>();

        lisst.add(5);
        lisst.add(2);
        lisst.add(4);
        lisst.add(3);

        Integer min= lisst.get(0); //assume


        for (int h = 0; h < lisst.size(); h++) {

            if ( lisst.get(h) < min)  {
                min= lisst.get(h);

            }

        }
        System.out.println("min number: "+ min);

        System.out.println("..........5...........");


        ArrayList<String> clist= new ArrayList<>();

        clist.add("blue");
        clist.add("pink");
        clist.add("green");
        clist.add("yellow");
        clist.add("black");

        System.out.println(clist);

        System.out.println("..........6..........");


//        2. Write a Java program to iterate through all elements in an array list.


        ArrayList<String> allelement= new ArrayList<>();

        for(int i=0; i<clist.size(); i++){
           allelement.add(clist.get(i));
        }
        System.out.println("iteration: " + allelement);
        System.out.println(".........7.......");


        // 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.


        ArrayList<String> colors= new ArrayList<>();

        colors.add("white");
        colors.add("violet");
        colors.add("brown");

        for(int i=0; i< colors.size(); i++){
           clist.add(colors.get(i));
        }
        System.out.println("added extra colors: "+clist);
        System.out.println("........8..........");



//       //4. Write a Java program to retrieve an element (at a specified index) from a given array list


        String retrieve = colors.get(2);
        System.out.println("retrieve: " + retrieve);




    }

}
//
//        reversed order: [6, 5, 4, 3, 2, 1]
//        ............2...............
//        unique list: [2]
//        .............
//        arraylist: [A, B, C, D, E, F, G]
//        ...........3............
//        maxx number: 5
//        .........4...........
//        min number: 2
//        ..........5...........
//        [blue, pink, green, yellow, black]
//        ..........6..........
//        iteration: [blue, pink, green, yellow, black]
//        .........7.......
//        added extra colors: [blue, pink, green, yellow, black, white, violet, brown]
//        ........8..........
//        retrieve: brown
//
//        Process finished with exit code 0