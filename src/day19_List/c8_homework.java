package day19_List;

import java.util.ArrayList;

public class c8_homework {

    public static void main(String[] args) {
        System.out.println("****Question 1**********");

        ArrayList<Integer> arr=new ArrayList<>();
        for (int i=1; i<=6; i++){
            arr.add(i);
        }
        System.out.println("Given array is "+arr);

        reversedOrder(arr);

        System.out.println("****Question 2**********");

        String sentence="hello 5world a1b2c3";
        int result=digitsFromString(sentence);
        System.out.println(result);
        System.out.println("****Question 3**********");

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        ArrayList<Integer> list1=uniqueArrayList(list);
        System.out.println(list1);

        System.out.println("****Question 4**********");
        String [] arr1={"A", "B", "C"};
        String [] arr2 = {"D", "E", "F", "G"};
        ArrayList<String> combinedone=combineArrays(arr1,arr2);
        System.out.println(combinedone);

        System.out.println("****Question 5**********");
        ArrayList<Integer> list2=new ArrayList<>();
        list.add(100);
        list.add(150);
        list.add(12);
        list.add(-3);
        list.add(30);
        list.add(47);
        int result1=maxNumber(list);
        System.out.println(result1);
        System.out.println("****Question 6**********");
        int result2=minNumber(list);
        System.out.println(result2);
        System.out.println("****Question 7**********");
        ArrayList<String> myColors=new ArrayList<>();
        myColors.add("blue");
        myColors.add("white");
        myColors.add("red");

        printArraylist(myColors);
        System.out.println("****Question 8**********");
        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(11);
        list3.add(150);
        list3.add(12);
        ArrayList<Integer> iterated=iterationArrayList(list3,1);
        System.out.println(iterated);
        System.out.println("****Question 9**********");

        retrieveElement(list3,0);
    }

    public static void reversedOrder(ArrayList<Integer> arrList){
        //  /*
//     write a program that can print the list of integers in reversed order
//        ex:
//            list=> {1,2,3,4,5,6}
//            output: 6 5 4 3 2 1
//     */

        System.out.print("The reverse order of given arrayList is : ");
        for (int i= arrList.size()-1; i>=0; i--){

            System.out.print(arrList.get(i)+" ");

        }
        System.out.println();

    }


    public static int digitsFromString(String sentence){
        /*
    write a program that can return the sum of all the digits from a string
            ex:
                input: "hello 5world a1b2c3"
                output: 11
                    (1+2+3 + 5=11)
            HINT: on ascii table, the characters between #48 ~ #57 are digits
     */
        int numbers=0;
        for (int i=0; i<sentence.length(); i++){

            if (sentence.charAt(i)>=48 && sentence.charAt(i)<=57){
                numbers+=Integer.parseInt(sentence.substring(i+0,i+1));

            }
        }
        return numbers;
    }



    public static ArrayList<Integer> uniqueArrayList(ArrayList<Integer> list){
        /*
  write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques

    ex: list==> {1,1,2,3,3,4,5,6}
    uniques ==> {2,4,5,6}

    */
        ArrayList<Integer> uniqueList=new ArrayList<>();
        for (int i=0; i<list.size(); i++){
            int count=0;
            for (int a=0; a< list.size(); a++){

                if (list.get(a)==list.get(i)){
                    count++;
                }
            }
            if (count==1){

                uniqueList.add(list.get(i));

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
    public static ArrayList<String> combineArrays(String [] arr1, String [] arr2){
        ArrayList<String> combinenList=new ArrayList<>();



        for (int i=0; i<arr1.length; i++ ){

            combinenList.add(String.valueOf(arr1[i]));
        }
        for (int i=0; i<arr2.length; i++ ){

            combinenList.add(String.valueOf(arr2[i]));
        }
        return combinenList;
    }


    public static int maxNumber(ArrayList<Integer> numbersList){
        //write a return method that will print max number from arraylist
        int maxnumber=Integer.MIN_VALUE;
        for (int i=0; i<numbersList.size(); i++){

            if (numbersList.get(i)>maxnumber){
                maxnumber=numbersList.get(i);
            }
        }
        return maxnumber;
    }

    public static int minNumber(ArrayList<Integer> numbersList){
        //write a retunr method that will print min number from arraylist

        int minnumber=Integer.MAX_VALUE;
        for (int i=0; i<numbersList.size(); i++){

            if (numbersList.get(i)<minnumber){
                minnumber=numbersList.get(i);
            }
        }
        return minnumber;
    }

    public static void printArraylist(ArrayList<String> collection){
    /*
1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
*/

        System.out.println("collection = " + collection);
    }

    public static ArrayList<Integer> iterationArrayList(ArrayList<Integer> list,int iteration){
      /*
            2. Write a Java program to iterate through all elements in a array list.
    */
        ArrayList<Integer> iteratedList=new ArrayList<>();
        for (int i=0; i<list.size(); i++){
            iteratedList.add((list.get(i))+iteration);

        }
        return iteratedList;
    }

    /*
    4. Write a Java program to retrieve an element (at a specified index) from a given array list
        */
    public static void retrieveElement(ArrayList<Integer> list, int indexOfElement) {

        System.out.println(list.get(indexOfElement));
    }
}