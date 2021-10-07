package day19_List;


import java.util.ArrayList;


public class c9_homework {

    public static void main(String[] args) {

        System.out.println("-----------------------------1-----------------------------");
//  /*
//     write a program that can print the list of integers in reversed order
//        ex:
//            list=> {1,2,3,4,5,6}
//            output: 6 5 4 3 2 1
//     */
        ArrayList<Integer> list = new ArrayList<>();

        //1. Method
        for (int i = 7; i >= 0; i--) {
            list.add(i);

        }
        System.out.println(list);

        System.out.println("-------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);

        System.out.println("list1 = " + list1);

        ArrayList<Integer> listNew = new ArrayList<>();

        for (int i = list1.size() - 1; i >= 0; i--) {
            listNew.add(list1.get(i));
        }
        System.out.println(listNew);


        System.out.println("reverse(list) = " + reverse(list));

        System.out.println("-----------------------------2-----------------------------");

        String str = "hello 5world a1b2c3";
        System.out.println("str = " + str);

        System.out.println(sum(str));    //sum methodunun icinde str'i hesaplamak icin boyle yaziyoruz



        System.out.println("-----------------------------3-----------------------------");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(3);
        list3.add(4);

        System.out.println("list3 = " + list3);
        ArrayList<Integer> uniqueListnew = unique(list3);
        System.out.println(uniqueListnew);

        System.out.println("-----------------------------4-----------------------------");

        System.out.println("combine() = " + combine());

        System.out.println("-----------------------------5/6-----------------------------");


        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(1);
        list4.add(5);
        list4.add(8);
        list4.add(3);

        System.out.println("list4 = " + list4);
        System.out.println("max() = " + max(list4));
        System.out.println("min() = " + min(list4));

        System.out.println("-----------------------------7/8/9-----------------------------");

        colors();

    }

    //3.Method with return
    public static ArrayList<Integer> reverse(ArrayList<Integer> reverseList) {

        ArrayList<Integer> newList = new ArrayList<>();

        for (int i = reverseList.size() - 1; i >= 1; i--) {
            newList.add(reverseList.get(i));
        }
        return newList;

    }

    /*
write a program that can return the sum of all the digits from a string
       ex:
           input: "hello 5world a1b2c3"
           output: 11
               (1+2+3 + 5=11)
       HINT: on ascii table, the characters between #48 ~ #57 are digits
*/
    public static int sum(String str) {

        //  boolean numbers=str.charAt(0)>=48 && str.charAt(0)<=57;

        int total = 0;
        for (int i = 0; i <= str.length() - 1; i++) {

            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {

                total += Integer.parseInt(str.substring(i, i + 1));

            }
        }
        return total;

    }

    /*
     write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques

       ex: list==> {1,1,2,3,3,4,5,6}
       uniques ==> {2,4,5,6}

       */
    public static ArrayList<Integer> unique(ArrayList<Integer> list3) {

        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (int i = 0; i <= list3.size() - 1; i++) {
            int count = 0;
            for (int j = 0; j <= list3.size() - 1; j++) {
                if (list3.get(i) == list3.get(j)) {
                    count++;
                }
            }
            if (count == 1) {
                uniqueList.add(list3.get(i));
            }
        }
        return uniqueList;

    }

    /*
         write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
         */
    public static ArrayList<String> combine() {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> newList = new ArrayList<>();

        for (int i = 0; i <= arr1.length - 1; i++) {
            newList.add(arr1[i]);
        }

        for (int j = 0; j <= arr2.length - 1; j++) {
            newList.add(arr2[j]);
        }
        return newList;

    }

    //write a return method that will print max number from arraylist
//write a retunr method that will print min number from arraylist

    public static Integer max(ArrayList<Integer> list4) {

        Integer max = list4.get(0);//just assume 0 is minimum number

        for (int i = 0; i <= list4.size() - 1; i++) {
            if (list4.get(i) > max) {
                max = list4.get(i);
            }
        }
        return max;

    }

    public static Integer min(ArrayList<Integer> list4) {

        Integer min = list4.get(0);//just assume 0 is minimum number

        for (int i = 0; i < list4.size(); i++) {
            if (list4.get(i) < min) {
                min = list4.get(i);
            }
        }
        return min;
    }

    // 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.

    public static void colors() {

        ArrayList<String> colorList = new ArrayList<>();

        colorList.add("pink");
        colorList.add("blue");
        colorList.add("red");
        colorList.add("black");

        System.out.println("colorList = " + colorList);
        System.out.println();

        //2. Write a Java program to iterate through all elements in an array list.
        System.out.println("Iteration of my color list:");
        for (String element : colorList) {
            System.out.println(element);
        }
        System.out.println();

        //4. Write a Java program to retrieve an element (at a specified index) from a given array list
        System.out.println("Retrieve Element");
        String retrieve = colorList.get(0);//pink
        System.out.println("Retrieve first element " + retrieve);


    }

}