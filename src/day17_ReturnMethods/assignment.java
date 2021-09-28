package day17_ReturnMethods;

import java.util.Arrays;

public class assignment {
    public static void main(String[] args) {

        int[] number = {5, 3, 4, 0, 1, 2};
        Ascending(number);

        System.out.println("++++++++2+++++++++");
        int[] numbers = {10, 5, 4, 9, 8};
        descend(numbers);
        System.out.println("+++++++++3+++++++++");
        newone();
        System.out.println("++++++++++4++++++++++");
        divisibleby15(100);
        divisibleby5(100);
        divisibleby3(100);
        System.out.println("++++++++++5++++++++++");
        oddandeven(200);
        oddandeven(201);
    }


public static void divisibleby15(int number) {

    //(Numbers) Divisible by 3, 5, 15
//Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
//if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
//if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
//if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
//ex:
//OutPut:
//Divisible By 15 15 30 45 60 75 90
//Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
//Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99

    for (int i = 1; i <= number; i++) {
        if (i % 3 == 0 && i % 5 == 00 && i % 15 == 0) {
            System.out.println("Divisibleby15: " + i);
        }
    }
    System.out.println("++++++++++++++++++");

}


public static void divisibleby5 (int number2) {


        for(int i=1; i<number2; i++){
            if(i%5==0 && i%15 !=0){
                System.out.println("Divisibleby5: " + i);
            }
        }
    System.out.println("++++++++++++++=");

}

public static void divisibleby3 (int number3) {


        for(int i=1; i <number3; i++){
           if( i%3==0 && i%15 !=0){
               System.out.println("Divisibleby3: " + i);
           }
        }
    System.out.println("++++++++++++++");

}


public static int oddandeven (int num1){
    //(Numbers) Odd & Even numbers
//Write  a method which can identifies given number is even or odd


        if (num1%2==0){
            System.out.println("num1 is even: "+num1);
        } else{
            System.out.println("num1 is odd: "+num1);
        }


 return num1;
}


    public static int[] Ascending(int[] arrr) {

        //(Array) Sort Ascending
//Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
//Ex:
//            int[] arr = {10, 9, 8, 7};
//
//             arr = Sort(arr);         ==>{ 7, 8, 9, 10};

        Arrays.sort(arrr);

        int [] yeni=new int[arrr.length];
        int firstindex = 0;     //niye olusturduk cunku 2 arrayi eslestirdigimizde  lazim olacak

        for(int i=0; i< yeni.length; i++) {

            yeni[i] = arrr[firstindex];
            firstindex++;

        }
        System.out.println(Arrays.toString(yeni));
           return yeni;
    }

    public static int[] descend(int[] arri) {
//(Array) Sort Descending
//Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
//Ex:  int[] arr = {10,20,7, 8, 90};
//////                 arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};


        Arrays.sort(arri); // code doesnt work without it
        int[] neww = new int[arri.length];     //neww provides new row with descending. why we care length bec.we wanna create same length
        int lastindex = arri.length - 1;

        for (int b = 0; b < neww.length; b++) { //  iye neww'in lengthini koyduk cunku onun uzunlugu o kadar olmasini istiyoruz

            neww[b] = arri[lastindex];
            lastindex--;  //neww arttikca arri geri geri sayacak ve buldugu en yuksek sayiyi yaklayip devam edecek neww

        }


        System.out.println(Arrays.toString(neww));

        return neww;


    }

public static void newone ( ) {
        //(Numbers) FINRA
//Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
// print "FIN" instead of the number and for numbers which are a multiple of 5,
// print "RA" instead of the number. for numbers which are a multiple of both 3 and 5,
// print "FINRA" instead of the number.

    for(int i=1; i< 30; i++){
        if(i%3==0 && i%5 ==0){
            System.out.print("FINRA,");
        }else if(i % 5 == 0 ){
            System.out.print("FIN,");
        }else if( i %3==0 ){
            System.out.print("RA,");
        }else{
            System.out.print("" + i+ " ,");
        }
    }

    System.out.println("+++++++4++++++");

    }

}

//        [0, 1, 2, 3, 4, 5]
//        ++++++++2+++++++++
//        [10, 9, 8, 5, 4]
//        +++++++++3+++++++++
//        1 ,2 ,RA,4 ,FIN,RA,7 ,8 ,RA,FIN,11 ,RA,13 ,14 ,FINRA,16 ,17 ,RA,19 ,FIN,RA,22 ,23 ,RA,FIN,26 ,RA,28 ,29 ,+++++++4++++++
//        ++++++++++4++++++++++
//        Divisibleby15: 15
//        Divisibleby15: 30
//        Divisibleby15: 45
//        Divisibleby15: 60
//        Divisibleby15: 75
//        Divisibleby15: 90
//        ++++++++++++++++++
//        Divisibleby5: 5
//        Divisibleby5: 10
//        Divisibleby5: 20
//        Divisibleby5: 25
//        Divisibleby5: 35
//        Divisibleby5: 40
//        Divisibleby5: 50
//        Divisibleby5: 55
//        Divisibleby5: 65
//        Divisibleby5: 70
//        Divisibleby5: 80
//        Divisibleby5: 85
//        Divisibleby5: 95
//        ++++++++++++++=
//        Divisibleby3: 3
//        Divisibleby3: 6
//        Divisibleby3: 9
//        Divisibleby3: 12
//        Divisibleby3: 18
//        Divisibleby3: 21
//        Divisibleby3: 24
//        Divisibleby3: 27
//        Divisibleby3: 33
//        Divisibleby3: 36
//        Divisibleby3: 39
//        Divisibleby3: 42
//        Divisibleby3: 48
//        Divisibleby3: 51
//        Divisibleby3: 54
//        Divisibleby3: 57
//        Divisibleby3: 63
//        Divisibleby3: 66
//        Divisibleby3: 69
//        Divisibleby3: 72
//        Divisibleby3: 78
//        Divisibleby3: 81
//        Divisibleby3: 84
//        Divisibleby3: 87
//        Divisibleby3: 93
//        Divisibleby3: 96
//        Divisibleby3: 99
//        ++++++++++++++
//        ++++++++++5++++++++++
//        num1 is even: 200
//        num1 is odd: 201
//
//        Process finished with exit code 0
