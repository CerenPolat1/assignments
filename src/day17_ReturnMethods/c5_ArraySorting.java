package day17_ReturnMethods;

import myMethods.myLibraryMethods;

import java.util.Arrays;

public class c5_ArraySorting {



    public static void main(String[] args) {
        int [] numbers = {5,19,2,-3,10};
        Arrays.sort(numbers);
        //classname.method
        System.out.println(Arrays.toString(numbers));

        //classname.method
        myLibraryMethods.hello();  //sadece cagirmisiz

        int [] numbers2 = {3,10,5,7,20,100,0};
        descendingSort(numbers2); //LARGEST TO SMALLEST

        myLibraryMethods.descendingSort(numbers2); //BUNUN ICINE ATTIGIMIZDAN ORADAN CAGIRMAK ICIN YAZDI

        System.out.println("****************");
        System.out.println(Arrays.toString(descandingOrder2(numbers2)));
    }

    //create a method that will print array in descending order
    public static void descendingSort(int [] arr){  // descendingSort=azalan siralama
        //first sort the array
        //and reverse the array with loop
        Arrays.sort(arr);

        int [] descArr=new int[arr.length];
        int lastIndex= arr.length-1;  //to store descending array, we create this one

        for (int i=0 ; i <descArr.length ; i++){
            descArr[i]=arr[lastIndex];       //niye bunu yaptik??cunku descArr[i] ile int arr'in leghtiyle, arr[lastIndex] i birer birer arttirmak icin
            lastIndex--;                    // ama zaten lastindex'e -- dedik, descArr[i] arkarken lastindex azalacak.
                                            //boylelikle buyukten kucuge dogru saymis olacak
            /// descArr[0]=arr[lastIndex]; // descArr[0] yani 0.index, last indexle match edecek,boylelikle en buyuk sayi 0.indexe gelmis olacak
            /// descArr[1]=arr[lastIndex-1];
            /// descArr[2]=arr[lastIndex-2];
            /// descArr[3]=arr[lastIndex-3];

               //soyle dusun [0,0,0,0,0] -descArr olsun
               //ve    arr[]=[1,2,3,4,5] olsun  , lastindex yani5 , yukarida descArr[0] yani 0.indexle eslesecek
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