package myMethods;

//buraya olusturdugumuz methodlari koyduk ki rahatlikla cagirabileleim.

import java.time.LocalDate;
import java.util.Arrays;

//neden public static void main yapmadik cunku bu package runn yapmak icin degil
//o yuzden class sekli de digerlerininkinden farkli
public class myLibraryMethods {

    //we will create our own reverse library method
    //this method will accept a string
    //as a result it should return reverse of the string
    public static void reverseString(String name){
        String result="";
        for (int i =name.length()-1 ; i >=0 ;i--){
            result += name.charAt(i);
        }
        System.out.println(result);
    }

    public static void hello(){//function of this method is to print hello
        System.out.println("Hello");
    }

    //create a method that will print java 10 times
    public static void printJava10(){
        for (int i =1 ; i <= 10 ; i++){
            System.out.println("Java");
        }
    }

    //create a method that will print even numbers between 1-100
//name this method evenNumbers100
    public static  void evenNumbers(int endpoint){
        //1 -100
        // 2 4  6 8 10 ...94 96 98 100
        for (int i =2 ; i<endpoint ; i +=2){
            System.out.print(i + " ");
        }
        System.out.println();

    }


    //create a method that will print array in descending order
    public static void descendingSort(int [] arr){  // descendingSort=azalan siralama
        //first sort the array
        //and reverse the array with loop
        Arrays.sort(arr);

        int [] descArr=new int[arr.length];
        int lastIndex= arr.length-1;  //to store descending array, we create this one

        for (int i=0 ; i <descArr.length ; i++){
            descArr[i]=arr[lastIndex];                //!!!!!ASK HIM!!!!!!!
            lastIndex--;
            // descArr[0]=arr[lastIndex];
            // descArr[1]=arr[lastIndex-1];
            // descArr[2]=arr[lastIndex-2];
            // descArr[3]=arr[lastIndex-3];

        }

        System.out.println(Arrays.toString(descArr));
    }

    ////create a return method that will print array in descending order
    ///logic is to take an array an return that array in descending order
    //that means my return is int []

    public static int [] descandingOrder2(int [ ] arr){
        System.out.println("hello descanding");

        //first sort the array
        //and reverse the array with loop
        Arrays.sort(arr);

        int [] descArr=new int[arr.length];
        int lastIndex= arr.length-1;

        for (int i=0 ; i <descArr.length ; i++){
            descArr[i]=arr[lastIndex];
            lastIndex--;
            // descArr[0]=arr[lastIndex];
            // descArr[1]=arr[lastIndex-1];
            // descArr[2]=arr[lastIndex-2];
            // descArr[3]=arr[lastIndex-3];

        }

        System.out.println(Arrays.toString(descArr));

        return descArr;
    }


    }











