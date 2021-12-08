package importantThings;

import day22_CustomClasses_StaticVariables.bankAccount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class informations {

    public static void main(String[] args) {


        //we have 2 type of primitive casting

        //1.implicit casting (done automaticly from java) ---

        byte b1 = 20; // -128 to 127
        long l1 = b1; // this is impilicit casting (done autamticly by java)

        //2.explicit casting (needs to be handle manually) ---

        int i1 = 10;
        byte b2 = (byte) i1;//explicit casting . This will done by you manually.

        // ////////////////////////////////////////////////////////////////////////////////

    /*
       escape sequences:
   \t: paragraph space
  \n: new line
  \": prints double quote " on the console
  \\: prints \ on the console
  \': prints single quote
   ' : prints single quote

    */

        // ////////////////////////////////////////////////

        //    There are eight primitive data types in Java:

        //   Data Type            Size           Description

//        byte             1 byte              Stores whole numbers from -128 to 127
//       short             2 bytes            Stores whole numbers from -32,768 to 32,767
//        int              4 bytes             Stores whole numbers from -2,147,483,648 to 2,147,483,647
//        long             8 bytes             Stores whole numbers from -9,223,372,036,854,775,808 toStores whole numbers from -2,147,483,648 to 2,147,483,647


//        float            4 bytes            Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//        double           8 bytes            Stores fractional numbers. Sufficient for storing 15 decimal digits

//        boolean          1 bit              Stores true or false values
//        char             2 bytes            Stores a single character/letter or ASCII values   'a'

        //    byte number2=128; this will give you error  because its out of range
        //    byte b1=2.5; this will also give you error beacuse its decimal number
        //    char c3='hh'; //error char can only store a single character

        int i = 97; //this stores numbers
        char ch = 97; // store characters, ascii

        System.out.println(i);//97
        System.out.println(ch); // a

        System.out.println(i + ch);//194
        int i2 = 'c'; // c will have 99 from ascii table

// //////////////////////////////////////////////////////////////////////////

        // string is non primitive data type

        //if you want to copy previous line
        // use ctrl + D for windows
        //use command + D for mac

        ///////////////////////////////////////////////

        //unary (tekli) Operators: sum and cikarma islemi

        // relationalOperators:

        int k1 = -15;
        int k2 = +i1; // +(-15) = -15
        int i22 = i1 + -i1;// -15 + +15 ==00
        int i3 = -i1; // -(-15) = +15

///////////////////////////////////////////////////////////////////


        //       post / Pre Conditions....

        //System.out.println(++);//pre condition will increase your number by one immediately
        //System.out.println(y++);//post condition will increase the number on next step

        // pre : this will change the value of number immediately
        // post : first wont gonna change anyhthing on the variable , at the end it will change it


        int xyz = 123;
        //data type     // variable      //value


///////////////////////////////////////////////////////////////////////


        //            How to create a string object?
        //           There are two ways to create String object:
//
//            1.By string literal :
        String str1 = "Hello";

        //create an string object 1.By string literal
        //Java String literal is created by using double quotes. For Example:
        //
        //String str1="Hello";
        //Each time you create a string literal, the JVM checks the "string constant pool" first.
        // If the string already exists in the pool, a reference to the pooled instance is returned.
        // If the string doesn't exist in the pool, a new string instance is created and placed in the pool.
        // in the pool memory java will create new string under pool memory

        String str2 = "Hello";// 1.By string literal this wont create a new instance under pool memory
        //because if string already exist in the pool , a reference to the pooled instance will be returned
        //to reason of java use string literal logic is to make java memory more efficient

        //           2.By new keyword :
        String str3 = new String("Hello");  ////it will create an object called Hello under java heap memory (non -pool )


        System.out.println(str1 == str2); //true
        System.out.println(str1 == str3); //false
        //we have 2 different objects and those 2 object created under different memory


        //what is the difference between == and equals


        String s1 = "New York"; //placed under string pool
        s1 = "Virginia"; //new object will be placed as virginia
        //s1 references will change to virgina


        //in java  string objects are immutable
        //immutable means object is uncahangabel (can not be modify)


        String word2 = "";

        // boolean b1=word2.isEmpty();

        String word3 = " ";
        // boolean b2= word3.isEmpty();

        System.out.println(b1);//true
        System.out.println(b2);//false  space has indec in the string so string is not empty


/////////////////////////////////////////////////////////////////////////////////////////////////////////

        //How do you split a sentence based in specific character?
        String sentence = "Hello java is planet ,java is beautful java is best ";

        //to split from second java
        int indexOfPlanet = sentence.indexOf("java is b"); // java is beautful java is best  //run ediyor


////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//break statment
        //anytime java will reach to break statment it will stop current condition that you have
        //if java cathcs break inside the loop
        //loop will be stopped from running
        //anything after break statemtn wotn be excuted
        for (int l = 1; l <= 5; l++) {//1 2 3
            System.out.println("Hello");//1 2 3

            if (l == 3) {//3
                System.out.println("Stop Hello");//3
                break;//loop will be stopped by running here
                //anything after here wont be excuted for loop
            }

            System.out.println("Hello Again");//1 2
        }

//continue statement:

        for (int m = 0; m < 5; m++) { //0
            System.out.println("Before continue " + i);//0 1 2 3 4

            if (m == 2) {
                continue; //2'ye geldiginde after contınue run etmezö before contınue ya doner ve 3çyu run etmeye baslar
            }  //yanı sadece 2iyı atlar geri kalan sira normal olarak devam eder.
            System.out.println("after Continue " + i);//0 1  3  4
        }
        System.out.println("***************");

        //////////////////////////////////////////////////////////////////////////////////

        //toString method is used to convert wrapper objects to string

        Integer myInt5 = 155;
        String str = myInt5.toString(); //"155"


        //////////////////////////////////////////////////////////////////////////////////

        //while loop : while loopp will be keep running as long as while condition is true
        //initilization(baslangic) will be outside of while loop***********
//        while (100 > 95){//condition here
//            System.out.println("Hello world");
//            //iteration
//        }
        //since condition is always true loop will be infinitive

        int q = 0; // initilization

        while (q < 11) {// condition//0 1
            System.out.println("Hello World" + q);//0 1
            q++;// iteration

        }


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //for loop
        //while loop
        //it will run as long as your condition is true
        //it will stop running when your condition turns to false
        //do while loop
        //it will run once at the begininng no mather your while condition is true or false
        //it will continue to run if while is true

        int number = 10;
        //infinitive do while
//        do {
//            System.out.println("hello");
//        }while (number==10);


        int number4 = 0; //starting point

        do {
            if (number4 % 2 == 0) {
                System.out.print(number4 + " , ");
            }
            number4++; // iteration

        } while (number4 <= 100);//condition end point

////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//your class is orange that means you didnt add to git
//if it is green you add it to git  but you didnt commit it
//blue means you commit it but you made changes after commit

////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Write a do-while loop that asks the user to enter two numbers.
        // The numbers should be added and the sum displayed.
        // The loop should ask the user whether he or she wishes to perform the operation again.
        // If so, the loop should repeat; otherwise it should terminate.
        // if user says y or Y continue
        // if user says n or N stop the loop


        int number1, number2;
        char choice; //y or n
        Scanner input = new Scanner(System.in);

        do {
            //ask user to enter a number
            System.out.println("Enter First Number ");
            number1 = input.nextInt();
            System.out.println("Enter Second Number ");
            number2 = input.nextInt();

            // The numbers should be added and the sum displayed.
            int sum = number1 + number2;
            System.out.println("Sum of " + number1 + " + " + number2 + " is : " + sum);

            // The loop should ask the user whether he or she wishes to perform the operation again.
            // If so, the loop should repeat; otherwise it should terminate.
            // if user says y or Y continue
            // if user says n or N stop the loop
            System.out.println("Do you want to sum 2 new numbers y/n");
            choice = input.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');


////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//nested loop : loop inside another loop
        for (int y = 1; y <= 3; y++) {
            System.out.println("* * * * *");
        }
        System.out.println("++++++++++++++++++");
        //bu sekli kisa yoldan da yapabiliriz ,asagidaki gibi uzun da.
        //* * * * *
        //* * * * *
        //* * * * *

        int totalRow = 3;
        int totalColumn = 5;

        for (int p = 1; p <= totalRow; p++) { // totalRow

            for (int j = 1; j <= totalColumn; j++) { //  totalColumn
                System.out.print("* ");

            }
            System.out.println();
        }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //nested if :: if inside another if
        //nested loop : loop inside another loop

        //example :
        //while inside for loop
        //for loop inside for loop
        //do while inside for loop
        // .....  any loop can be inside of any loop

        for (int a = 0; i < 3; a++) { //0 1 2
            System.out.println("Hello"); //0 1

            //i=0 , 1 ,2
            for (int j = 1; j < 5; j++) { // 01 02 03 04  ,, 11 12 13 14 , 21 22 23 24
                System.out.println("Java");
            }

        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //        //create a condition that will print min and max number from given array

        int[] listOfNumbers = {10, 0, 100, 200, 500, 5, -5, 20};

        //max == 500
        //min == - 5

        //just assume
        int max = listOfNumbers[0];//10
        int min = listOfNumbers[0];//10


        for (int p = 0; p < listOfNumbers.length; p++) { // 0 1 2 3 ... lastindex

            if (listOfNumbers[p] > max) { //[2]=100 > 10   // [3] 200 >100 //[4] 500 >200
                max = listOfNumbers[p];//this will reassign new max values the max variable
            }

            if (listOfNumbers[p] < min) {
                min = listOfNumbers[p];
            }
        }

        System.out.println("Max number is " + max);
        System.out.println("Min number is " + min);


////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //we have a method to convert from hashcode to string and that will return you whole array !!!!!!!!!!!!!
        //Arrays is librarry inside java and it has different methods
        //tostring method will ask and array and convert whole array to string

        String[] names = {"azmar", "hasim", "korkmaz", "shilan"};

        System.out.println(Arrays.toString(names));//[azmar, hasim, korkmaz, shilan]

////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Q5 Can you pass the negative number in Array size?

//        No, you can not pass the negative number as Array size.
//         If you pass a negative number in Array size then you will not get the compiler error.
//        Instead, you will get the NegativeArraySizeException at run time.

//Q7 Where does Array stored in JVM memory ?

        // Array is an object in java. So, Array is stored in heap memory in JVM.


//Q8  // What is ArrayStoreException ? When this exception is thrown ?
        //  ArrayStoreException is a runtime exception. Array must contain the same data type elements.
//
//        This exception is thrown to indicate that an attempt has been made to store the wrong type of object into an array of objects.
//        In other words, if you want to store the integer Object in an Array of String you will get ArrayStoreException.

//Q9    Q10 What is the difference between ArrayStoreException and ArrayOutOfBoundsException ?
//
//        ArrayStoreException is thrown if you are trying to add incompatible data type. For example, if you try to add an integer object to String Array, then ArrayStoreException is thrown.
//
//        ArrayOutOfBoundsException is thrown when an attempt is made to access the Array with illegal index. For example, illegal index means if the index is either negative or greater than or equal to the size of the Array.
//

// Q14    What is an Anonymous Array in Java ? Give example?
//
//        An array without any name (or reference) is called an Anonymous Array. They are useful for the scenarios where we need one time usage of Array. For example,
//
//        Anonymous int array :
//        new int[] {2,3,4,5,6,7};
//
//        Anonymous String array :
//        new String[]{"Java", "Hungry"};


// Q17    Write a program to check whether two given Arrays are equal, given both contains same data type and same length ?
//
//        To check whether two given arrays are equal or not , we can use Arrays.equals() method. Check the program below :
//
//        import java.util.*;
//   public class JavaHungry {
//
//    public static void main(String args[]) {
//
//        int[]  arr1 = {2, 3, 4};
//        int[]  arr2 = {1, 2, 3};
//
//        System.out.println(Arrays.equals(arr1 , arr2));


        //        Q19 Write a program to throw ArrayOutOfBoundsException?
//
//public class JavaHungry {
//
//    public static void main(String args[]) {
//
//        int[]  rollNumber = { 23, 17, 20, 29, 30 };
//    /* Index below is greater than the size
//    of the given Array */
//        int element = rollNumber[6];
//        for (int temp : rollNumber)
//            System.out.print(temp+" ");
//    }
//}
//
//Output:
//        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 6
//        at JavaHungry.main(JavaHungry.java:8)
//
        //        Q20 Write a program to throw ArrayStoreException ?
//
//public class JavaHungry {
//
//    public static void main(String args[]) {
//
//        Object x[] = new String[3];
//        x[0] = new Integer(0);
//    }
//}
//
//Output:
//        Exception in thread "main" java.lang.ArrayStoreException: java.lang.Integer
//        at JavaHungry.main(JavaHungry.java:6)


//Q42      How to convert HashSet to Array in java ? (solution)
//
//        You can convert HashSet to Array using toArray() method.

//Q44     How to convert Array to ArrayList in java ? (solution)
//
//        The easy way to convert Array to ArrayList is using Arrays class asList() method. You need to pass the Array to the asList() method as argument. For example,
//
//        String[] cityNames ={"Boston", "Chicago", "San Francisco", "New York"};
//        /* One liner - Array to ArrayList conversion*/
//        ArrayList<String> cityList= new ArrayList<String>
//
//   (Arrays.asList(cityNames));
//There is another way to convert Array to ArrayList using addAll() method.


//  Q45   How to convert Array to TreeSet in java ? (solution)
//
//           To convert Array to TreeSet in java, first we need to convert Array to List using Arrays class asList() method. After converting Array to List,  pass the list object to TreeSet constructor. That's it , Array has been converted to TreeSet. You can confirm by printing out the values of TreeSet object.
//

//  Q46   How to convert ArrayList to String Array in java ? (solution)
//
//        There are two ways to convert ArrayList to String Array in java. First method is using ArrayList get() method and second is using toArray() method. You can check both of the methods here.
//

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //create a condition that will reverse given sentence
//        //ex: Java is fun
//        //output should be fun is java

        String sentnce = "Java is fun ";
        //fun is java
        String[] splitedSentence = sentnce.split("  ");//[Java, is, fun]
        System.out.println(Arrays.toString(splitedSentence));

        String reverseSentence = "";//store result from last index to first index

        for (int m = splitedSentence.length - 1; m >= 0; m--) {
            reverseSentence += splitedSentence[m] + " ";
            System.out.println("in the loop " + reverseSentence);
        }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //How do you split a sentence based in specific character?
        String sntnce = "Hello java is planet ,java is beautful java is best ";

        //to split from second java
        int indxOfPlanet = sntnce.indexOf("java is b");
        String splitedSentnce = sntnce.substring(indexOfPlanet);
        System.out.println(splitedSentnce);


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        //how can you reverse a string
        //input   hello
        //output  olleh

        Scanner inpt = new Scanner(System.in);

        System.out.println("Enter your word ");
        String wordd2 = inpt.nextLine();
        //since we dont know the word we need get last index of word to be able to reverse string from last char
        //to get last index number length -1
        System.out.println("Lentg of your word " + wordd2.length());
        int lastIndex = wordd2.length() - 1;

        String reverseWord2 = "";

        //what is starting point for loop
        //starting point last index
        //ending point will be 0
        //iteration --
        for (int a = lastIndex; a >= 0; a--) { // last index lastindex-1 ......0 (11 10 9 ..0)
            //11
            reverseWord2 += wordd2.charAt(a); //11
            System.out.println(reverseWord2);
        }
        System.out.println(reverseWord2);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //arr2 [2][1]
        //first bracket [] is always container number
        //second one index number of your variable

        //this will give you specific length of container
        //System.out.println(arr2[0].length);

        int[][] number2D = {{1, 2}, {2, 3, 4}, {4}};
        System.out.println(Arrays.toString(number2D));//hashtag  [[I@5cad8086, [I@6e0be858, [I@61bbe9ba]
        System.out.println(Arrays.toString(number2D[0]));//one container [1, 2]
        System.out.println(Arrays.deepToString(number2D));//[[1, 2], [2, 3, 4], [4]]

        int[] numberList = {33, 0, 2, 4, 6, 7, 5, 3, 100, 25, 30, 200};

        //output will say 6 even numbers
        //4 odd numbers

        int evenCount = 0;
        int oddCount = 0;

        for (int numbr : numberList) {
            if (number % 2 == 0) {
                evenCount++;
            } else {//odd numbers
                oddCount++;
            }
        }

        System.out.println("Even count is " + evenCount);
        System.out.println("odd count is " + oddCount);

        System.out.println("///////////////////////////");


        int[][] arr2d = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9, 10}};

        for (int[] each1D : arr2d) { //this will store each child container

            for (int eachNumber : each1D) { //this will store each number from each container
                System.out.print(eachNumber + " ");
            }
        }


        //from 2d array
        //create a java logic that will print odd and even numbers
        //count of even and odd
        //also it will print sum of oddnumbers and sum of even numbers

        int[][] nmber2D = {
                {1, 2, 3, 4},
                {5, 6, 7, 20},
                {8, 9, 10, 11}
        };

        int countOdd = 0;
        int countEven = 0;
        int sumEven = 0;
        int sumOdd = 0;

        for (int[] each1d : nmber2D) {

            for (int eachNumber : each1d) {
                if (eachNumber % 2 == 0) {
                    countEven++;
                    sumEven += eachNumber;
                    System.out.println(eachNumber + " is even number");
                } else { //odd numbers
                    countOdd++;
                    sumOdd += eachNumber;
                    System.out.println(eachNumber + " is odd number");

                }

            }
        }

        System.out.println("Count of even numbers : " + countEven + " sum of even numbers " + sumEven);
        System.out.println("Count of odd numbers : " + countOdd + " sum of odd numbers " + sumOdd);


        //write a program that can return the count of "java" and "javascript" anywhere in the sentence
        //String sentence = "I like java and javascript,java is best, java and javascript,java ";

        String sentence1 = "I like java and javascript,java is best, java and javascript,java ";
        String[] news = sentence1.split(" "); // put space bec i wanna divide words

        System.out.println(Arrays.toString(news));
        System.out.println("#######");
        String word1 = "java";
        String wrd2 = "javascript";
        int count = 0;  // why i use int bec. i wanna see how many java included in this sentence
        int count2 = 0; //why i put 0, bec it start to sum with 0,0+1,0+2...

        for (String each : news) {
            if (each.contains(word1)) {     //if use equal, or equalignorecase they wont work properly.
                count++;
            }
            if (each.contains(wrd2)) {
                count2++;
            }

        }

        System.out.println("java count " + count + " times.");
        System.out.println("javascrip count " + count2 + " times.");

        System.out.println("..........");

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //decleration of the method
        // public               static           void               main        (String [] args){
        // Access-modifer       specifier        return-type        methodName  (paramater)
        //statments ,code


        //Access-Modifer =public, protected ,default ,priavate
        //specifier   : static ,final ,abstract ,synchronized
        //return type : void , any datatype(int,string,char , int [] .......)

        //why we create new method?
        //technically, you dont have to create a method bec. you can handle everything in main method
        //methods specify what is the function of method. you can call this method
        //instead of each time typing main method, you can prefer to call that function that you created

        //what is the benefit of creating method?
        //instead of typing everything in main method, you can create and store some in your method

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*

        public static void main(String[] args) {
            //hello method is void method without parameters
            hello();
            hello();
            //asagidakilerin hepsi parameter cunku int degeri aldilar,bi tane daha agecatogory yazmaya calistiginda
            // int oldugunu gosteriyoe
            ageCategory(10); //bunun icine numara vermezsen calismaz cunku buna bagli olarak kurduk denklemi
            // senden yas yazmani istiyor ki run etsin
            ageCategory(25);
            ageCategory(3);
            ageCategory(85);
            ageCategory(-25);


            //eger yukaridaki gibi deger verip gormek istemezsen yine main method icinde scanner kullanarak yapabilirsin

            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter your age");
            int age=scanner.nextInt();

            ageCategory(age); // bu,  verilen degerin run etmesi icin yazildi

        }


        public static void ageCategory(int age){

            String result="";
            if (age>=0 && age <5){
                result= age+ " is a baby";
            }else if (age>=5 && age <18){
                result = age + " is young ";
            }else if (age>=18 && age < 80){
                result = age + " is mature";
            }else if (age >= 80){
                result = age + " is old";
            }else {
                result = age + " is not excist!!!!";
            }
            System.out.println(result);
        }


        public static void reverseString(String name){
            String result="";
            for (int i =name.length()-1 ; i >=0 ;i--){
                result += name.charAt(i); // char kullandik cunku her bir harfi yazdiracak
                //peki neden name.charAt(i) kullandik da error vermedi, cunku name.charAt(i)'den once "" yazmak gerekirdi
                //cunku zaten result icine "" dahil ettigimizden bir daha yazmamiza gerek kalmadi.
            }
            System.out.println(result);
        }

   */


        int[] numberrf = {1, 2, 3};
        System.out.println(Arrays.toString(numberrf));

        //2D
        int[][] numberr2D = {{1, 2}, {2, 3, 4}, {4}};
        System.out.println(Arrays.toString(number2D));//hashtag  [[I@5cad8086, [I@6e0be858, [I@61bbe9ba]
        System.out.println(Arrays.toString(number2D[0]));//one container [1, 2]
        System.out.println(Arrays.deepToString(number2D));//[[1, 2], [2, 3, 4], [4]]***************************

//        ***************************************************************************************************


        //create a java program that will print count off odd numbers and even numbers from int array

        int[] nummberList = {33, 0, 2, 4, 6, 7, 5, 3, 100, 25, 30, 200};

        //output will say 6 even numbers
        //4 odd numbers

        int evennCount = 0;
        int odddCount = 0;

        for (int nummber : numberList) {
            if (nummber % 2 == 0) {
                evennCount++;
            } else {//odd numbers
                odddCount++;
            }
        }

        System.out.println("Even count is " + evennCount);
        System.out.println("odd count is " + odddCount);

        //for loop
        //starting point ending and iteration
        for (int u = 0; u < numberList.length; u++) {
            if (numberList[u] % 2 == 0) {
                evenCount++;
            } else {//odd numbers
                oddCount++;
            }

        }


        int[][] arrn2d = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9, 10}};

        for (int[] each1D : arrn2d) { //this will store each child container

            for (int eachNumber : each1D) { //this will store each number from each container
                System.out.print(eachNumber + " ");
            }
        }


        //create a java program that will ask for 5 string  name to store in the array
        //and print first and last letter from each string

        //example
        //input : berkan , firas ,merve ..
        //output : bn , fs ,me


        //Scanner
        //String [] names
        //loop
        //charat

        Scanner inpuut = new Scanner(System.in);

        //to store 5 names
        String[] nameList = new String[5];

        // nameList[0]=input.next();  5 times

        for (int ii = 0; ii <= nameList.length - 1; ii++) {
            System.out.println("Enter Name " + (ii + 1)); //neden i+1 bec. to enter name1; name2, name3 gibi icin
            nameList[ii] = inpuut.next();
        }

        System.out.println(Arrays.toString(nameList));

        String firstAndLAstLetter = "";

        for (String eachName : nameList) {

            firstAndLAstLetter = "" + eachName.charAt(0) + eachName.charAt(eachName.length() - 1);
            System.out.println(firstAndLAstLetter);
        }


        //string
        //tochararray split--to check each letter. slit i kullanmak daha usefull oldugundan omu kullandik
        //count variable int
        //for each

        String sentennce = "Java is best , JavA is fun , Python is Also fun, Hello world";
        //sentence.toLowerCase();

        String[] letters = sentennce.split("");

        System.out.println(Arrays.toString(letters));


        int countLetterA = 0;

        for (String eachLetter : letters) {
            if (eachLetter.equalsIgnoreCase("a")) {
                countLetterA++;
            }
        }

        System.out.println("Count of A is " + countLetterA);


        //PAY ATTENTION//
        //length() ile length fark ne???
        //length(), string method, length parantezsiz oldugunda Array olur.


        calculate(5, 10, '+');
        calculate(5, 5, '*');
        calculate(5, 5, '/');
        calculate(5, 5, '-');
        calculate(5, 5, '%');
        calculate(5, 5, '@');
        //calculate('-',5,5);
    }

    // write a method that will take 3 parameters
    // 2 numbers and one operator
    // it will do the calculation

    //ex : 20 10 /
    //result 2

    //ex 30 3 *
    //result 90

    public static void calculate(double number1, double number2, char operator) {
        //+ - * / %
        //invalid operators

        switch (operator) {
            case '+':
                System.out.println(number1 + number2);
                break;
            case '-':
                System.out.println(number1 - number2);
                break;
            case '*':
                System.out.println(number1 * number2);
                break;
            case '/':
                System.out.println(number1 / number2);
                break;
            case '%':
                System.out.println(number1 % number2);
                break;
            default:
                System.out.println("Invalid Operator : " + operator);
        }
    }


    //Access-Modifer =public, protected ,default ,private
    //specifier  : static ,final ,abstract ,synchronized
    //    //return type : void , any datatype(int,string,char , int [] .......)r


    //create a method that will print array in descending order
    public static void descendingSort(int[] arr) {  // descendingSort=azalan siralama

        //first sort the array
        //and reverse the array with loop
        Arrays.sort(arr);

        int[] descArr = new int[arr.length];
        int lastIndex = arr.length - 1;  //to store descending array, we create this one

        for (int i = 0; i < descArr.length; i++) {
            descArr[i] = arr[lastIndex];       //niye bunu yaptik??cunku descArr[i] ile int arr'in leghtiyle, arr[lastIndex] i birer birer arttirmak icin
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

//
//    Integer myIntt5=155;
//    String strr=myIntt5.toString(); //"155"
//        System.out.println("str = " + strr);  //text olarak var suan 155


    //Type Casting
    //   1.Autoboxing:
    //Converting a primitive value into an object of the corresponding wrapper class is called autoboxing.
    //   2.Unboxing:
    //Converting an object of a wrapper type to its corresponding primitive value is called unboxing.
    // Byte myBytte=25;
    //        byte b1=myBytte; //unboxing

    //	methods:
//     parse methods: converts string of text to the primitives, returns primitive values////// String-> primitive


    String str = "3555";
    //String str="zzzzz3555"; exception error

    ////sadece icinde numara olursa dogru calisir, eger yazi varsa error verir ustteki gibi

    String sstr = "3555";
    int number = Integer.parseInt(sstr);

    //            valueOf methods: converting string to wrapper class value, returns wrapper class values

    String sttr = "55";
    Integer number2 = Integer.valueOf(str); //wrappe ceviriyor; Integer var

//    String strw2= "55.5";
//    Double dd1=Double.valueOf(strw2);
//        System.out.println(dd1+5);

    //3.array is data structure and arraylist is part of collection data structure

//  ***************************************************************************************************

    //create a list of Integers
    //add 4 numbers
    //return maximum number
//
//    ArrayList<Integer> numberrList = new ArrayList<>();
//        numberrList.add(200);
//        numberrList.add(100);
//        numberrList.add(0);
//        numberrList.add(55);
//        numberrList.add(290);
//        numberrList.add(-100);
//
//    //int maximum = numberrList.get(0);
//    //create a for loop to compare my list with maximum number
//    //if its bigger i will reassigned to max
//
//        for(int f = 0; f<numberrList.size();f++){
//        if (numberrList.get(f) > maximum) {
//            maximum = numberrList.get(f);
//        }
//
//    }
//
//     System.out.println(maximum);


    ////return type kullanmak istersen public static olarak kullan


    //creating a method that will print the arraylist in reversed order  8 to 1

    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> numbers) {
        //last index to first index

        ArrayList<Integer> reversedList = new ArrayList<>();  //we are creating new arraylist bec. reverse stocks here.
        for (int i = numbers.size() - 1; i >= 0; i--) {
            reversedList.add(numbers.get(i));   //neden add ekledik cunku icinde kac tane varsa(bunu get yapar) add yapsin diye
        }

        return reversedList;
    }


//*************************************************************************************************************

    //    public static void main(String[] args) {
//        System.out.println("****Question 1**********");
//
//        ArrayList<Integer> arr=new ArrayList<>();
//        for (int i=1; i<=6; i++){
//            arr.add(i);
//        }
//        System.out.println("Given array is "+arr);
//
//        reversedOrder(arr);
//
    public static void reversedOrder(ArrayList<Integer> arrList) {
        //  /*
//     write a program that can print the list of integers in reversed order
//        ex:
//            list=> {1,2,3,4,5,6}
//            output: 6 5 4 3 2 1
//     */

        System.out.print("The reverse order of given arrayList is : ");
        for (int i = arrList.size() - 1; i >= 0; i--) {

            System.out.print(arrList.get(i) + " ");

        }
        System.out.println();

    }

    //*************************************************************************************************************
    public void aq() {
        ArrayList<Integer> numbers = new ArrayList<>();//size is 0


        numbers.add(5);//0
        numbers.add(10); //1
        numbers.add(100); //2

        System.out.println(numbers);//[5, 10, 100]

        numbers.add(0, 20);//[20,5, 10, 100]
        //   0= index number, 20=element

        numbers.add(2, 30);//[20,5,30, 10, 100]
        System.out.println(numbers);
    }
    //set(index , data) //reassigning your data   //!!!direkt istedigi indexin yerini alir ve eskisini kaldirir!!!!

    // numbers.set(1,500); bunun yerinde yer alan 5'di ama biz 500 koyup 5'i kaldirdik

//
//      letters.remove("A");  .........object olarak yaziyorsun

//        System.out.println(letters);//[B, E, A]
//        letters.remove(0); ..... index olarak yaziyorsun
//
//        System.out.println("........"+letters);//[E, A]

//clear method will clear eveything in your list
//        letters.clear();


    //indexof(Object) will print index number of the object that you are passing
    //if that object is present in your list you will get index number
    //if object is not present you will get index as -1
//        System.out.println(list.indexOf(100));//0
//        System.out.println(list.indexOf(-25));//2
//        System.out.println(list.indexOf(500));//-1
//        System.out.println(list.indexOf(1));//-1


    ///arrays .sort
    //Collections is an library which is very useful with arraylist    //sana rakamlari kucukten buyuge dogru siralayarak verir
    //Collection is data structure
//    Collections.sort(list);
//*************************************************************************************************************

//    Bulk Operations:
//    contailsAll(CollectionType):
//    addAll(CollectionType):
//    removeAll(CollectionType):
//    retainAll(CollectionType):

    public void aqq() {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(2, 3, 4, 5, 6, 10, 0, 11, 500));

        // containsAll  this will check if objects are ccontains in the list
        System.out.println("numbers.contains(0) = " + numbers.contains(0));
        System.out.println("numbers.containsAll = " + numbers.containsAll(Arrays.asList(0, 1, 2, 333)));//false
        System.out.println("numbers.containsAll = " + numbers.containsAll(Arrays.asList(0, 1, 2, 3)));//true

        // removeall this will remove all the objects from the arraylist
//remove will only remove first matching one

        ArrayList<Double> numbers2 = new ArrayList<>();
        numbers2.addAll(Arrays.asList(1.0, 1.0, 1.0, 2.5, 3.5, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 10.3));
        System.out.println("numbers2 = " + numbers2);
        Double num = 1.0;
        numbers2.remove(num); //this will remove first 1.0
        numbers2.remove(num); ////this will remove second 1.0

//retainall  will search for given data and it will keep them . others will be removed

        ArrayList<Integer> list5 = new ArrayList<>();
        list5.addAll(Arrays.asList(1, 1, 2, 2, 3, 4, 5, 5, 6, 7, 10));
        System.out.println("list5 = " + list5);

        list5.retainAll(Arrays.asList(5, 3));


//(String) Sum of Digits in a string
//Write a method that can return the sum of the digits in a string

        String a = "222225";
        String[] b = a.split("");
        System.out.println(Arrays.toString(b)); //en basindan sonuna kadar yazdir demek, tostring olmazsa hashcode verirdi
        int sum = 0;

        for (int i = 0; i < b.length; i++) {   // arrayda lengthte parantez yok
            sum += i;  // tum b'nin indexini toplamak icin
        }
        System.out.println(sum);

//(String) Sort Letters and Numbers from alphanumeric String

        ArrayList<Integer> numberrs = new ArrayList<>();
        numberrs.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));


//use Collections.sort method to sort your arrray list and use get method to print them

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        Collections.sort(list);
        System.out.println(list);


        //Arrays.sort is used for Array but ******* Collections.sort is used for Arraylist

        //3. Write a Java program to insert an element into the array list at the first position.

        ArrayList<Integer> element = new ArrayList<>();

        element.addAll(Arrays.asList(100, 200, 300));
        System.out.println(element);

        element.add(0, 50);
        System.out.println(element);

        // 5. Write a Java program to update specific array element by given element.

        ArrayList<Integer> specific = new ArrayList<>();

        specific.addAll(Arrays.asList(1, 2, 3, 4, 5, 7, 7));

        specific.set(5, 6);  //it just puts 6 instead of 7
        System.out.println(specific);

        //21. Write a Java program to replace the second element of a ArrayList with the specified element.

        ArrayList<Integer> specify = new ArrayList<>();
        specify.addAll(Arrays.asList(3, 4, 5, 6));
        specify.set(0, 2);
        System.out.println(specify);
        specify.set(1, 3);
        System.out.println(specify);

//*************************************************************************************************************

        //write a java program that will return dublicate datas from an arraylist
        //input list1 {1,2,3,4,5,1,2,10}
        //output 1,2
        //input list2 {a,b,c,d,c,x,e ,c ,d ,x,x}
        //c ,d ,x

        //to be able to print dublicate data i will need to check count of data
        //whihc has to be bigger then 1 count >1 --- this will be dublicate

        //if count == 1 unique


        ArrayList<String> letters = new ArrayList<>();
        letters.addAll(Arrays.asList("a", "b", "c", "d", "c", "x", "e", "c", "d", "x", "x"));
        //    //c ,d ,x as a results

        ArrayList<String> dublicatedList = new ArrayList<>(); // we will store dublicate ones in this list
        //we needed to create nested loop bec. we compare each of loops and find dublicates
        //if count is more then 1 that means data is dublicated

        for (int i = 0; i < letters.size(); i++) {//"a","b","c","d","c","x","e" ,"c" ,"d" ,"x","x"

            int count = 0;
            for (String each : letters) {////"a","b","c","d","c","x","e" ,"c" ,"d" ,"x","x"  // yukardakiyle bunlar mac ederse sayacak

                if (each.equals(letters.get(i))) {
                    count++;//1 2 3
                }
            }

            if (count > 1 && !dublicatedList.contains(letters.get(i))) { //true && true
                // eger bunu  (count>1) yazip, sonra dublicadedList.add(letters.get(i); yazsaydik
                // hangi letterdan kac tane var onu yazdirirdi mesela c,d,c,x,c,d,x,x, gibi
                // bunu istemedigimizden !dublicatedList.contains(letters.get(i)) yazdik

                System.out.println(letters.get(i) + " count is " + count);
                dublicatedList.add(letters.get(i));//c d  x
                System.out.println("dublicatedList = " + dublicatedList);
            }

        }

        System.out.println(dublicatedList);

        //collectrion sadece arraylisttype (String,Double,Integar ,Boolean)  ile calisir

        ///All of those collections method will work any arraylisttype String,Double,Integar ,Boolean ....
        // Collections Class:
        //
        //        sort(CollectionType): this will sort any given collectionType
        //
        //        frequency(CollectionType, Object): this will return the frequency of the given object
        //        from the given collectionType
        //
        //        max(CollectionType): this will return the biggest object from collectiontype
        //
        //        min(CollectionType): this will return the smallest object from collectiontype
        //
        //        swap(CollectionType, index1, index3): this will swap the index1 and index 3
        //
        //        replaceAll(CollectionType, oldData, newData):


        ArrayList<Integer> numberss = new ArrayList<>();
        numberss.addAll(Arrays.asList(4, 5, 1, 2, 3, 10, 400, -25, 1000));

        System.out.println(Collections.max(numbers)); // 1000
        System.out.println("Collections.min(numbers) = " + Collections.min(numbers)); //-25

        //        swap(CollectionType, index1, index3): this will swap the index1 and index 3
        //swap --> degis tokus demek

        Collections.swap(numberss, 0, 2);

        //    //        replaceAll(CollectionType, oldData, newData):

        Collections.replaceAll(numberss, 10, 20);


//local variables : local variables that we declared with in block(main method,other methods ,static block)
//instance variables : object variables that we create inside of class
//instance variables can not have static specifier
//needs to be declared outside of methods or blocks


        //    practice task:
//    create a custom class for bank account
//    attrubutes: accountHolder(String), accountNumber(long), balance(double)
//    actions: totalBalance(), withDraw( amount ), deposit( amount )
//    toString()

      /*
    create a class called bankAccountObject to call BankAccount methods,variables.
    Ex : if i deposit 50 dollars my balance should increase 50 dollars
   : if i withdraw 100 dollars my balance should decrease for 100 dollars
   : to check the balance use totalBalance method
  */
    }

    String accountholder;
    long accountNumber;
    double balance;
    double amount;


    public void customer(String accountholder, long accountNumber) {

        this.accountholder = accountholder;
        this.accountNumber = accountNumber;

        System.out.println("Customer: " + accountholder + " , accountNumber: " + accountNumber);
    }

    public void totalBalance(double balance) {    // if there is no static method, you dont need to create object for instance

        this.balance = balance;
        System.out.println(accountholder + "'s total balance: " + balance);

    }

    public void withDrawal(double amount) {

        this.amount = amount;

        balance -= amount;

        System.out.println("New balance after withdraw:" + balance);
    }

    public void deposit(double amount) {

        this.amount = amount;
        balance += amount;

        System.out.println("after deposit , current balance:" + balance);
    }


//
//        public static void main(String[] args) {
//            bankAccount info=new bankAccount();
//
//            info.customer("Ceren Polat", 12345678);
//            info.totalBalance(1500);
//
//            info.withDrawal(100);
//            System.out.println("current balance:" + info.balance);
//
//            info.deposit(50);
//            System.out.println(info.balance);
//
//
//        }
//
//    }

//        Customer: Ceren Polat , accountNumber: 12345678
//        Ceren Polat's total balance: 1500.0
//        New balance after withdraw:1400.0
//        current balance:1400.0
//        after deposit , current balance:1450.0
//        1450.0
//
//        Process finished with exit code 0


////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    // instance ve static variable ortak ozeeligi her ikisi de block disinda yani method or blocks disinda yazilir

//instance variable :declared outside of the blocks
//instance variable can have multiple copy from object  //her assign yaptiginda degerleri ayri ayri alir
//they need to be called through object   //OBJECT YARATMAN GEREKIR YOKSA CALISMAZ

//static variables :declared outside of any block with static keyword
//static variable can only have one copy from object     ////her assign yaptiginda degerleri ayri ayri almaz, hepsini bir kabul eder
//they can also be called with classname itself  //OBJECTE GEREK YOK blogun icinde DIREKT CAliSIR

// instance ve static variable ortak ozeeligi her ikisi de block disinda yani class disinda yazilir
//static variables know as global variable SO YOU DONT NEED TO CREATE AN OBJECT

//         STATIC -method

//      1-  a method is declared with static keyword, it is known as static method.

//        exp: public static void main(String[] args)  public static void abc ()

//      2- if classes have both static methods, classes do not need to use objects.

//      3- static variables know as global variable SO YOU DONT NEED TO CREATE AN OBJECT

//      4- static variable can only have one copy from object


//        INSTANCE method

//
//     1-since method is instance, we dont need to create an object inside this method.
//
//      exp: public void abcd(){}, public String toString(){} ....
//
//     2- if one of them is static and other one is instance, we need to create an object to run our code.
//
//       exp: let say, we have an Instance method and a static method :top of the page
//
//     3- There is no keyword for instance
//
//     4- instance variable can only have multiple copies from object
////
//
//    What is the execution order of blocks, static blocks, constructors, and methods in Java?
//    Initialization blocks (blocks and static blocks) and constructors in a Java class are executed in following sequence:
//
//  1. static block
// 2. block
// 3. constructor
// 4. method
//
//    The rules are for determining the execution order are -
//
//            1. Static blocks get executed at the time of class loading.
//            2. Instance blocks get executed only when object is created using new keyword.
//3. Constructors get executed only when object is created using new keyword.
//

    //can we overload constroctor methods //// this is also interview question
    //yes // yani briden fazla c6_ConstructorIntro olusturabildik

//    public Car() {   parantez ici bos oldugunda default oluyor
//    } //constructor method
//
//    public Car(String brand, int year, double price, String color) {      //contructor method

//
//
//1-Within same class: It can be done using ----this()---- keyword for constructors in same class
//2-From base class: by using --super()-- keyword to call constructor from the base class.-- we will see this later
//
//Why do we need constructor chaining ?
//This process is used when we want to perform multiple tasks in a single constructor
//rather than creating a code for each task in a single constructor we create a separate constructor for each task
//and make their chain which makes the program more readable.

//constructor'i main method icinde calistirmak icin object olusturman lazim cunku contructor instance method
    //you can only call one constructor from another one
//methodun icine 1'den fazla this() koyamiyorsun

//this ( ) keyword has to be first line in your constructor
//sadece methodun hemen altina yazabilirsin baska yere yazarsan error verir

    //    constructor calls:(chainning) by using this() keyword
//            1. only constructor can call other constructor
//            2. constructor cannot be called by its name,  this() is used for calling
//            3. constructor call needs to be at the first step
//            4. One constructor can only call one constructor
//            5. Contructor cannot call itself or contain itself
    //creating constructor
    //what we need?
    //1- access modifier and  2- class name

//daha once diger constructor'la eslesmis olani tekrardan call etmeye kalkarsan error verir
// yani her bir constructor sadece bir kere call edilir.


/// ...............constructor nasil calisir???????.............

    /*
    1-oncelikle constructor'in calismasi icin main methodun icinde olmali
    2- daha sonra onlara object olusturmalisin cunku instance variable bunlar
    3-daha sonra hangisini cagirmak istiyorsan objectin icine tikla hangi connstructori gormek istiyorsan var olan degerlere gore gir
    4- java objecting icine yazdigimiz degerin oldugu cunstroctora gider :

    sen main methodun icine custructer'i yazarak object olusturursun, daha sonra objectrin icine var olan
    constructorlardan birinin parametresini girersin, girdigin degerin custroctirina gider ama onu run etmez,
    direkt chain yaptigina gider orayi okur sonra kendine donup kendini okutur.

super ve this keywordlerini kullanarak run edebilirsin println ile:
  System.out.println("this.number = " + this.number);//50, this, ayni class'dakini alir o yuzden 50'yi aldi.
        System.out.println("super.number = " + super.number); //100, from other class


    public c1_CostructorChainningPractice(int num,int num2){
        // 4. One constructor can only call one constructor
        this(true,10.5);
        System.out.println("num = " + num);
        // this();
        System.out.println("int const");
    }
    public c1_CostructorChainningPractice (String str, int b){
        System.out.println("xxxx");
    }

    public c1_CostructorChainningPractice(boolean b ,double d){
        this("last chain",1);
        ////            5. Contructor cannot call itself or conatin itself
        // this(true,5.5); boyle yaparsan direkt kendini cagirmis olur bu da kabul edilmiyor

        System.out.println("constr with double and boolean ");
    }

        public static void main(String[] args) {

        c1_CostructorChainningPractice obj1=new c1_CostructorChainningPractice(10,10);
        }
xxxx
constr with double and boolean
num = 10
int const
xxxx
constr with double and boolean

once int num, int num'a gitti oradan boolean, double'a gitti, oradan boolean, double'in chainine gitti onu yazdirdi
dondu kendini yazdirdi sonra bi geriye daha gitti int num, int num'u yazdirdi.

    public static void main(String[] args) {

        c2_ConstructorSuper obj1=new c2_ConstructorSuper(); //neden objectin icine bir sey yazmadik cunku bu default olan
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                   WHO RUN FIRST???????

1.STATIC BLOCK (METHOD DEGIL DIKKAT ET)
2-MAIN METHOD
3-INSTANCE BLOCK
4-CONSTRUCTOR
5- KALAN KISIM DA (STATIC VEYA INSTANCE 'METHOD')FARKETMEKSIZIN MAIN METHOD'DAKI SIRAYA GORE ISLER.


    //			Access modifiers sunlar oluyor: 1- public, 2-protected, 3-default, 4-private
    // access modifiers explain your access level to the variable ,method or class

   //Private: The access level of a private modifier is only within the class.  //SADECE ICINDE BUKUNDUGU CLASS'I KAPSAR
    //private her seyi private yapar sadece class icindedir

    //Default: The access level of a default modifier is only within the package. //SADECE PACKAGE'I KAPSAR
    // It cannot be accessed the package  from outside
    // If you do not specify any access level, it will be the default.

 //Protected: The access level of a protected modifier is within the package     ////SADECE PACKAGE'I KAPSAR
    // and outside the package through child class.
    // If you do not make the child class, it cannot be accessed from outside the package.
    //ayni package different class ama cagirabilmek icin child claslar olmali--protected=child class

        //Public: The access level of a public modifier is everywhere.

           private int priavteVariable=25;
    int defaultVrble=35;  //EGER HERHANGI BIR SEY BELIRTMEDIYSEN ONU DEFAULT OLARAK ALIR INT'IN ONUNDE ACCESS MODIFIER YOK
    protected  int protectedVariable=5;


     // UNIQUE OLUP OLMADIGINI NEREDEN ANLIYORUZ, EGER STATICSE UNIQUE OLUR NEDEN CUNKU ONDA ONE COPY OLUYOR.
    //EGER INSTANCE ISE O UNIQUE OLMAZ CUNKU INSTANCE DA MULTUPLE COPY ALIYORSUN VE HER SEFERINDE COPYLER DEGISIYOR O YUZDEN UNIQUE OLMUYOR

     public static boolean isHuman=true; // public unique variable
      public String name;  // public not unique CUNKU BU INSTANCE

      ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

   OOP PRINCIPLES : object oriented programing language

   //we have 4 different OOP consept
•Encapsulation :(Data Hiding) •Encapsulation diger bir degisle data hiding'tir  = private
•Inheritance   :
•Abstraction   :
•Polymorhism

IN MY WORD, ENCAPSULATION means THE VARIABLES OF THE CLASS WILL BE HIDDEN FROM THE OTHER CLASS AND
 THEY CAN BE ACCESS ONLY THROUGH THE METHODS OF THEIR CURRENT CLASS
Therefore, it is also known as data hiding.


   -------- To achieve encapsulation in Java −------

1.Declare the variables of a class as private.--hiding yaptik
2.Provide public setter and getter methods to modify and view the variables values from outside of class.

 //1.to hide data
    private String name;
    private long idNum;
    private int age;

        public void setName(String name){
        this.name=name;   //private'daki name'i cekti // EncapObject'de bunu kullanabildi nasil? object yaratti setName'i kullandi ve yazdi
    }
    public String getName(){   //parantez icine eger string name olusturmazsak, bir daha this. yapmaya gerek kalmaz eslestirilecek bir sey olmaz cunku
        return name;
    }

    public void setIdNum(long idNum){
        this.idNum=idNum;
    }
    public void setAge(int age){
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public long getIdNum(){
        return idNum;
    }


yani encapsulation yapak icin her bir variable'in getter ve setter'i alinir
setter void ile kurulur, getter ise data variable ile

exp: public void setAge(int age){          public int getAge(){
       this.age=age;                          return age;
     }                                     }

Inheritance:

Important terminology:

1-Super Class: //parent//base class//superclass
The class whose features are inherited is known as superclass(or a base class or a parent class).

2-Sub Class:
The class that inherits the other class is known as a subclass(or a derived class, extended class, or child class).
The subclass can add its own fields and methods in addition to the superclass fields and methods.

3-Reusability:
 Inheritance supports the concept of “reusability”, i.e. when we want to create a new class
 and there is already a class that includes some of the code that we want, we can derive our new class
 from the existing class. By doing this, we are reusing the fields and methods of the existing class.
How to use inheritance in Java
The keyword used for inheritance is extends.


diyelim senin bir ana konun var mesela animals, ve sub claslarin vaf bird, cat, dog gibi, bunlarin hayvan olarak ortak ozellikleri var
bu ortak ozellikleri her seferinde tek tek yazmak yerine inharitance olusturuyoruz.
//commen features
//age
//name
//weight
//color ,size ,type

public class ProtectedTest extends ProtectedExample {  //ProtectedExample:parent class

    public static void main(String[] args) {
        ProtectedExample obj1 = new ProtectedExample();
        obj1.publicNumber = 10;//everywhere
        // obj1.priaveNumber=20;//extended olup olmasi fark etmez, private ayni isler just works only same class
        obj1.protecNumber = 20;//it uses in same package or if it is extended or if variable is static variable

////!!!!!!!protected, eger static olmazsa ve main methodun icinde olmazsa kullanamiyoruz
 //it can be used if it is extended, static variable and inside main method

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//   *********** overriding olmasi icin su kurallar lazim: ****************
// 1-her seyiyle birebir ayni methodlar olmali (same method name, same parameter, same return-type)
// 2-methodlardan biri sub class olmali yani biri parent'da biri child classda olmali
// 3- sadece instance method overriden olabilir
// 4-override annotation methodta yer almali

@Override // bunun icin ayni isimli method olmali biri parent'da biri child'da olmali ki overriding olsun


//why we need overriding: to implement different functions to the same method
//				reusable
//				flexible
//              easy to memorize
//				less memory----most important thing , her class icin yeni bir  tostring olusturdugunu dusun cok
//				               fazla sayida bu methodtan olacak ve memory'de cok yer kaplayacak


class test5{
    int number ;
    public void method2(){
        System.out.println("Method 2");
    }

    static{  //static block only works inside a class

    }
}


ayni class'in icinde overriding yapamazsin!!!

overriding yapabilmek icin once overrididing yapmak istediginn methodun oldugu class'i(parent) extend yapmalisin,
daha sonra child classda olusturdugun methodusu overriding yaparsin

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //        (Numbers) Swap Numbers
        //        Swap two variable' values without using a third variable

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        Collections.swap(list, 4, 5);  //swap requires index instead of number.

        System.out.println(list); //123465

 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        //*** Exemptions and Errors both are subclasses of Throwable class.

    / The error indicates a problem that mainly occurs due to the lack of system resources***
// and our application should not catch these types of problems.
// Some of the examples of errors are system crash error and out of memory error.
// Errors mostly occur at runtime that's they belong to an unchecked type.

//Exemptions are the problems which can occur at runtime and compile time.
// It mainly occurs in the code written by the developers.
// Exemptions are divided into two categories such as checked Exemptions and unchecked Exemptions.

ERROR:it comes from system errors. that is a problem for your system.
you cant handle error because it occurs from system problems

EXCEPTION: is kinda warning that comes from java
it is just something that java gives you warning and you can handle Exemptions

class ExemptionsExample{

    public static void main(String[] args) {

        int number1=100;
        int number2 = 0;

        //int result = number1 / number2 ;
        //ArithmeticExemption // you cant divide numbers by zero
    }
}

  while (number != 0 ){      //this is unchecked Exemptions
            number = number+1;//6
            method(number);//6  //StackOverflowError
        }
    }

       //EXCEPTIONS

    //1-RuntimeException (in the console)    2-  IOException (compiler exception)
//in selenium -->runtimeexception, mostly time we face it
    //diyelim sen exceptiondan kurtulmak istiyorsun sorunun 1 mi 2 mi oldugunu bilmiyorsun,
    // o zaman direkt EXCEPTION (PARENT) yazarsin cunku o parent oldugundan hepsini karsilar


***Runtimeexemption class is the parent of all exemptions

there two types of exception:

1.unchecked (unexpected event):it reflects some error inside the program logic occures during run time


2.checked (unwanted events):checked exemptions. it occurs during the compile time. needs to be handled immediately

 // eger exeption, compile zamaninda yani sen uretirken oluyorsa buna checked (unwanted events) denir
    //ama eger sadece run ettginde exeptions ile karsilasiyorsan buna unchecked (unexpected event) denir


        String name="Bahast";
       System.out.println(name.charAt(100));//////////StringIndexOutOfBoundsexemption, cunku max 5 yazabilirdik

 int [ ] arr = {10,20,30};
        //System.out.println(arr[5]);///////ArrayIndexOutOfBoundsexemption
        //runtime and uncheked

         //Thread.sleep(5000); /////////////Interruptedexemption;



    File  file1=new File("Hello.txt");
        // FileInputStream fileInputStream=new FileInputStream(file1);//java.io.FileNotFoundexemption;
        //checked exception

              try{

            Thread.sleep(5000);  //checked exception(.InterruptedException;)

        }catch (InterruptedException e){ //buradaki e, object  //java interrupt istemez cunku surekli calismak ister
        e.printStackTrace();

        }


            //Exception is the parent of all the exception types
            //you can use Exception to catch


    eger exception ismini bilmiyorsan (InterruptedException)
    bunun  yerine direkt Exception ya da RuntimeException yazarsin

           try {
            System.out.println("list.get(20) = " + list.get(20));//unchecked  IndexOutOfBoundsException

        }catch (IndexOutOfBoundsException a){
            a.getStackTrace();//bu exception hakkinda sana fikir veriyo consolda
            a.getMessage();//sana bilgi veriyor: a.getMessage() = Index: 20, Size: 10

        }


        //in try and catch solves issue definataly, you never see same issue in your code in any
         but in throws method you can face it bec. you just throw anywhere


 try {
            System.out.println(10/0);//arithemetic exception // uncheked

        }catch (NoSuchElementException exc){
            System.out.println("no such element");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array excep");
        }catch (ArithmeticException e){
            System.out.println("arithmetic exccep");
        }catch (RuntimeException e){
            System.out.println("runtime");
        }catch (Exception e){
            System.out.println("exception");
        }
 buradaki sorun arithemetic exception ilgili oldugundan o run etti
        // peki neden dogru oldugu halde (RuntimeException ve Exception) run etmedi
        // cunku eger catchlerden biri once run ettiyse digerlerini yazdirmaya gerek duymaz



  try {
            System.out.println(10/0);//arithmetic exception // unchecked

        }catch (NoSuchElementException exc){
            System.out.println("no such element");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array excep");
        }catch (ArithmeticException e){
            System.out.println("arithmetic excep");
        }catch (RuntimeException e){
            System.out.println("runtime");
        }catch (Exception e){
            System.out.println("exception");
        }finally {
            System.out.println("Finally block ");
        }

   //yukarida dogru olan ne olursa olsun her zaman ve sadece finally block run eder
        //soyle sorular da gelebilir what is the final keyword and finally keyword gibi
//finally'den sonra  catch falan yazamiyorsun izin vermez
//how finally blocks works
//finally block will get executed no matter where try -catch will catch exception.


     //there is 2 way to handle exceptions so they dont stop compiler from running
        //1- you can use try/catch blocks to handle
        //2- you can use throws keyword to handle

          NoSuchElementException obj = new NoSuchElementException(); //bu exception'lari object olarak kullanabilirsin
        //  throw obj;

             try {
            throw new ArithmeticException(); //throw create ArithmeticException exception
            //neden code'un icine exception atiyoruz, bazen gerekli durumlarda kullanilabiliyor.
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());

        //throw vs throws
        //throw will throw exception to your code... throw gives a problem to your code
        //throws will handle exceptions
        //so 2 of them do totally different things

     */
    /*
    final int instanceVrble2=100;
    final static int staticVtble2=200;

     c8_FinalVariables obj1=new c8_FinalVariables();
       //obj1.instanceVrble2=20; ///olmaaaz
        //staticVtble2=400;//   olmaaaaz, final keyword will make variable not changable,


 what is difference between import and extend?
//import is importing from java libraries or packages that you created before..ama bunlar farkli packagelerdan olur aynisindan olmaz
//extend is calling parent class

//peki final varken neden static kullaniyoruz cunku belki ilerleyen adimlarda staticgi degistirmek isteyeceksin
//or: diyelim kurum adi TD bunun hep kalacagindan eminden direkt final kullan ama
//eger ilerleyen adimlarda bunu degiatirmeyi duusnursen static yap o zaman unique olmaktan cikarbiilirsin

//extra note:
// static icin surekli unique diyoruz
//ama bunu unique olmaktan cikarabiliyoruz nasil?
//objectler yaratarak yapiyoruz ama uzun is oluyor

overrriding yaptiginda abstract class'da degil child class'da degisim olur, cunku abstract'i extend yapiyosun

    //abstract classes can have regular method and abstract method

       //you cant have abstract methods in regular class
    //that is why extended abstract are need be overriding

        //we can use implements keywords from abstract class, and also regular class to call interface

    //AYRICA, EGER REGULAR OR ABSTRaCT CLASS'DAN INTERFACE CAGIRACAKSAN SADECE IMPLEMENTS KULLANABILIRSIN EXTEND OLMAZ


     //abstract methods

    abstract void calling();
    abstract void texting();

child class:

  @Override
    void calling() {
        System.out.println(brand+ " provides calling.");

    }

    @Override
    void texting() {
        System.out.println(brand+ " provides texting.");

    }

     //abstract classes are meant to be inherited
    //can not be final
        //those methods can not be final,static or private.--cunku overriding yapiyorsun,
        overriding sadece instance ile calisir

         //2 ways to achive abstraction
    //1.Abstract Class , abstract methods
    //2.Interface




    .............INTERFACE............

   there is only one access modifier allowed in interface ==> public *******



 // you can implement inheritance in the interfaces by using implements keyword (instead of extend)
    // you can implement multiple interfaces

    //what is differences between abstract class and interface *******interview question
    //A class can inherit from one class only (extends)
    //A class can inherit multiple interfaces (implements)

    //what we can have in interface?
    //variable: static & final by default
    //bir sey soylemezsen default olarak static ve final'i alir

    //!!!!!!!methods: abstract methods, static methods, default method
    //sadece instance kabul etmez hem method hem varible'da


    //    what we cannot have in interface?
    //interface'de kullanilmayanlar!!!!!!!!!!!!!!!!

//    constructor
//    instance variable
//    instance methods
//    blocks



 niye interface kullaniriz????

    to achive total abstraction
    java doesnt support mulltiple inheritance of class, but using interface we can achive multiple inheritance
    interface are used to implement abstruction.
    abctruct'i kullanmak icin neden interface'e ihtiyacimiz var????
    cunku abstruct'da final variable yok, kullanmak icin onu kullaniriz gibi

     we can only call interface class from regular and abstract class using implements keyword..
      also we can use extends keyword in 2 interface classes.
     //AYRICA, EGER REGULAR OR ABSTRUCT CLASS'DAN INTERFACE CAGIRACAKSAN SADECE IMPLEMENTS KULLANABILIRSIN EXTEND OLMAZ

  default  void method1(){}
  static void method2(){}
   public abstract void method3();    bunlarin ucu de interface icindeydi.

   interfaceler de tipki abstractlar gibi overriding olur, regular veya abstruct classtan bunlari extends ettiginde
   kullanirsin interface methodlari


................................POLYMORPHISM...........................

        Animal animal2=new Fish("fish2" , 'f' ,5);

        animal2.eat();//result comes from fish.. ama methodlar animal'dan gelir.sadece bilgiler fish'den tamamlanir
        animal2.growing();//result comes from fish
        animal2.animalMethod();//result comes from animal

        neden bu yontemi kullaniyoruz???????????
        polymorphism allows us to perform the same action in many different ways.



  //why oop?????????????

    //Reusability
    //flexible
    //easy to update  --- easy to maintain our code, chance something from parent.. it is easy to do it.
    //memory -- it will reduce memory
    //easy to read and remember functions that you created


   polymorphism allows us to perform the same action in many different ways.

    //alttakilerin ornegine gore bir seyi farkli seyler icin kullanabilme..bu alttaki ornegi interviweda verebilirsin

    //    ////WebDriver driver=new ChromeDriver();
    //    ////WebDriver driver=new FirefoxDriver();

//webdriver'da neden object yaratilmiyor?
    //cunku webrdriver bir inferface.. interface'de object yaratilmiyor



.............................LIST................................



// DAta Structures
//        1 Array (fixed)
//        2 Collection (Dynamic)
//        3 Map

//   ***Collection is a data structure
 Collection (I) (parent) : extended by List(I),Set(I),Queue(I) (child)


                  ******* *Arraylist is coming from collection.

list is parent of arraylist, linkedlist and vector
list is an interface its not class so you cant create an object from list
****differences between list types are  types of creation*****
 expample: arraylist created single linked,

    LIST: ArrayList,LinkedList,Vector(C)

   ArrayList(C): Internally uses array, singly linked
 Singly linked == it (Singly linked) will retrieve data  faster than others (get)

   LinkedList(C): each object are doubly linked.
 Doubly linked == removing adding functions are faster

LinkedList adds number faster than ArrayList but little

  Vector(C): array based class, is synchronized  ,only prefer in multi thread
 -Synchronized: used for achiving thread-safety

 pop() method : LIFO (last in first out order), returns the last object from the stack and removes it from stack

    //Vector is  slowest one because of sencronised but there are not more differences


    //    //list general points ;
    //    //1.List are allowing dublicate objects
    //    //2.order : list will keep the insertion order.
    //    //3.null elements : list will allow you to use  null elements;
    //    //4.list has dynamic size

        List<Integer> list=new ArrayList<>(); //polymorphism
        list.add(25);
        list.add(25);    //    //1. rule: List are allowing dublicate objects

              ArrayList <String> words =new ArrayList<>();
        words.add("Hello");
        words.add("Hello");
        words.add(null);
        words.add(null);    //    //3. rule: null elements : list will allow you to use any number of null elements;

        //istedigimiz kadar dublicate ve null ekleyebiliyoruz.


        List<Integer> list2=new LinkedList<>();
        list2.add(20);
        list2.add(10);
        list2.add(20);
        list2.add(15);
        list2.add(15);  //4.rule:list has dynamic size.. eklemeler yapabiliyorsun

 //2.order : list will keep the insertion order. run uaptiginda yukaridaki siraya gore run yapar sirayi degistirmez

 LIFO((last in first out order-son giren ilk çıkar),


 ....................................QUEUE...................................

 //FIFO
        //it will sort in queue logic
        //it is not always going to sort from small to large
        //it has own sort logic
       //acceps dublicate value
        Queue<Integer> numbers=new PriorityQueue<>();
        numbers.add(20);
        numbers.add(20);
        numbers.add(1);
        numbers.add(11);
        numbers.add(200);
        numbers.add(15);
        numbers.add(3);


        System.out.println(numbers);//[1, 11, 3, 20, 200, 20, 15] //it will sort in quee logic.. randomly output verir
        //o yuzden cok kullanisli degil bu yuzden diyoruz //it has own sort logic and there is no index



Queue<Integer> numbers2=new ArrayDeque<>()

        System.out.println(numbers2);//[20, 20, 1, 11, 200, 15, 3, 1] // ArrayDeque, listeni nasil olusturduysan o sirayla run eder

         //   what is the differences between list and queue?????
        //1-list has LIFO, queue has FIFO
        2-list keeps insertion order but in queue run randomly

        // var olan liste sirasina gore run eder:List, ArrayDeque
        //from small to large:LinkedHashSet, TreeSet



        ...............................SET..............................

           //all type of sets are not going to accept dublicates

        //if you have the list of numbers that you dont want to store dublicate ones  which collection type you will use ?
        //answer is: set will be prefered

        Set<String> letters=new HashSet<>();

        //Hashset
        //accept null values
        //it doesnt accept dublicates
        //it has sort logic but it is not always from small to large
        letters.add("a");
        letters.add("a");
        letters.add("b");
        letters.add("e");
        letters.add("c");
        letters.add("d");
        letters.add("a");
        letters.add(null);  //dublicateleri run etmez ve karisik run eder

                Set<String > letters2=new LinkedHashSet<>();  // var olan liste sirasina gore run eder.
        //linkhasset
        //it doesnt accept dublicates
        //it does not sort
        //accept null values
        letters2.add("a");
        letters2.add("a");
        letters2.add("b");
        letters2.add("e");
        letters2.add("c");
        letters2.add("d");
        letters2.add("a");
        letters2.add(null);


        Set<String> letters3=new TreeSet<>();  //kucukten buyuge gore siralanir

        //Treset
        //it doesnt accept dublicate values
        //it does not accept null values..........
        //it is going to sort from small to large

        letters3.add("a");
        letters3.add("a");
        letters3.add("b");
        letters3.add("e");
        letters3.add("c");
        letters3.add("d");
        letters3.add("a");
        //letters3.add(null);

        System.out.println(letters3);//[a, b, c, d, e]

        // //i want to store list of numbers in one collection type
        //             //that is not going to accept dublicates
        //             //also it will sort (from smallest to largest)
///////////////////////////////////////////////////////////////////////////////////////////////////////
        //ideas ://treeset , arraylist (-) , priortyquee (-) ,hashset

        //arraylist : is not going to work . Because it accepts dublicate values
        //priortyquee : is not going work . Because it accept dublicate values
        //hashset  : may work but not always beacuse it has own sort logic

        //accept dublicate and keep insertion order
        //set wont work (set doesnt accept dublicates)
        //list and quee accept dublicates
        //any type of list will work and you can also use Dequee (not preferd)

        //i want to store list of numbers in one collection type
        //that is not going to accept dublicates
        //it will accept one null keyword

        //ideas : treeset , hashet ,linkhasset
        //since i dont want to accept dublicates only option left is set
        //and treset not accepting null
        //result is : hashset or linkhasset



List and Set both are interfaces. They both extends Collection interface.
The important differences between set and list are: *****************

****1.Duplicate Objects
The main difference between List and Set is that List allows duplicates while
 Set doesn't allow duplicates.

****2.Order
List is an ordered collection it maintains the insertion order,
which means upon displaying the list content it will display the elements in the same order in
which they got inserted into the list.
Set is an unordered collection, it doesn’t maintain any order.
 There are few implementations of Set which maintains the order
 such as LinkedHashSet (It maintains the elements in insertion order).
 treeset will sort
 hashset will sort in hashset logic

****3.Null elements
List allows any number of null elements. Set can have only a single null elements at most.
--Treseet wont allow even one null


// 1. write a program that can remove the duplicated characters from String
        // and store them into variable

 //bu yontem varken niye digerlerini ogrendik cunku interviewda method, collection kullanmadan coz diyebilirler o yuzden

 LinkedHashSet<String> result= new LinkedHashSet<>(Arrays.asList(letters));

 //hashset sirayla verir ve dublicaate olmadan
//i cant use other sets because they will sort it

        //fisrt you will need to remove dublicate values so you can compare them
        //second make sure to sort them  from smallest to largest so you can compare if they are equal

        String str1="abcabccabd";
        String str2="dcbaccc";

        String [] arr1=str1.split("");
        String [] arr2=str2.split("");

        System.out.println(Arrays.toString(arr1));//[a, b, c, a, b, c, c, a, b, d]
        System.out.println(Arrays.toString(arr2));//[d, c, b, a, c, c, c]

        TreeSet<String> result1=new TreeSet<>(Arrays.asList(arr1));
        TreeSet<String> result2=new TreeSet<>(Arrays.asList(arr2));
        //treseet will take arrays and remove dublicates and sort them from small to large


......................................MAP...............................

   //Data Structure :
    //    Array (fixed, primitives & objects)
    //    Collection (dynamic, only objects)
    //    Map (dynamic, only objects)


//Map Interface: accepts key and value. cannot be primitives.
    //                key MUST be unique

        //Map methods:
    //    put(key, value): inserts key and value to map
    //    get(key): returns the value of the given key
    //    remove(key): removes the given key and it's value from the map
    //    size():
    //    containsKey(key): checks if the key is contained in the map. boolean
    //    containsValue(Value): checks if the value is contained in the map. boolean
    //    clear(): clears everything
    //    isEmpty(): boolean
    //    keySet(): returns all the keys from the map as Set
    //    values(): returns all the values from the map as Collection
    //    setEntry():


//HASH KARISIK DEMEK
     // HashMap: does not keep the insertion order
    //         accepts null
    // HashTable: is synchronized, thread-safe ==> one thread at a time
    //             slower
    //             does not accept null
    // LinkedHashMap: keeps the insertion order as it's.
    //             put & remove are faster
    //             accepts null
    // TreeMap: sorts the keys in ascending (sorted map)
    //         does not accept null


        Map<String,Integer> studentInfo=new LinkedHashMap<>();
        //key :will be String that we will use for student names
        //key has to be unique

        //value : will be Integer and we will use for student numbers
        //only accepts object types

        //    put(key, value): inserts key and value to map
        studentInfo.put("Sercan",125); //key yani buradaki durumuyla isimler unique olmali, value dublicate olabilir ondan sorun yok
        studentInfo.put("Sercan",20);//burada ayni isimle yine key girdiginde 2.gordugunu alir.yani "Sercan",125 run etmez
        studentInfo.put("Triska" ,125);
        //boyle ayri ayri yazariz ama iksini tek bir map icinde verir

//if you want to use map you will need to have 2 parameters
        //first one will be key and has to be unnique
        //second one will be value and this can be dublicate

        //LinkedHashMap<String , double> // map only accept objects(Integer, Double,Byte vs.) not primitives (int, double)
        LinkedHashMap<String , Double> studentAges=new LinkedHashMap<>();
        //add new members
        studentAges.put("Ozge", 25.5);
        studentAges.put("Musab",35.5);
        studentAges.put("bahast",11.2);
        studentAges.put("Esther",22.2);
        studentAges.put("Esther",18.0); //bunu okur ustteki yerine
        studentAges.put("Ozer",18.0);


          //get method will only accept key
        //and if key is present in your map you will see the value of the key
        //if key is not presnet in your map result will be null


        //    containsKey(key): checks if the key is contained in the map. boolean
        //    containsValue(Value): checks if the value is contained in the map. boolean


                // //we will create a map that will has student name and exam score
        //        //key == student name    String
        //        //value == score           Integer
        //we want to keep insertion order
        LinkedHashMap<String , Integer> studentsScore=new LinkedHashMap<>();

        studentsScore.put("Firas", 87); // B
        studentsScore.put("derya", 81); // B
        studentsScore.put("bawer", 75); //C
        studentsScore.put("ridvan", 65); //C
        studentsScore.put("recep",92); // A
        studentsScore.put("yad",100); // A
        studentsScore.put("esra",95); // A

        //scores more than 90 will be as Score : A
        //scores between 80-90 will be Score : B
        //scores less than 80 will be : C

        LinkedHashMap<String,Integer> scoreA=new LinkedHashMap<>();
        LinkedHashMap<String,Integer> scoreB=new LinkedHashMap<>();
        System.out.println("scoreA = " + scoreA);// {} neden boyleler  cunku listeler bos burada
        System.out.println("scoreB = " + scoreB);// {}

        ////    //    keySet(): returns all the keys from the map as Set
        //        //keyset will return the keys from the map

        for (String eachStudent : studentsScore.keySet()){  //keyset student namelerine ve scorelarini verecek.
            int eachStudentScore= studentsScore.get(eachStudent);
            //use get method to ask for key and return their values

            if (eachStudentScore >= 90){
               scoreA.put(eachStudent,eachStudentScore);
            }else if (eachStudentScore >= 80 && eachStudentScore <90){
                scoreB.put(eachStudent,eachStudentScore);
            }

      LinkedHashMap<String , String> gmailCredentials=new LinkedHashMap<>();
        gmailCredentials.put("username1","password1");
        gmailCredentials.put("username2","password2");
        gmailCredentials.put("username3","password3");
        gmailCredentials.put("username4","password4");
        gmailCredentials.put("username5","password4");
        gmailCredentials.put("username6","password4");
        gmailCredentials.put("username1","password4"); //neden bu degil de ilki run etti cunku
        //cunku loop bastan okudugundan yani siradan gittiginden ilk on u aldi sonuncuyu birakti

        //keys can not be dublicated . It will reassigned the value

        System.out.println("gmailCredentials = " + gmailCredentials);
        //keyset will return all key from map
        for (String eachKey : gmailCredentials.keySet() ){
            System.out.println("eachKey = " + eachKey);
        }
        //values will return all value from map
        for (String eachValue : gmailCredentials.values() ){
            System.out.println("eachValue = " + eachValue);
        }

        //i want to store all usernames in arraylist
        ArrayList<String> usernames=new ArrayList<>(gmailCredentials.keySet()); //keyset method gives all info from map
        ArrayList<String> passwords=new ArrayList<>(gmailCredentials.values());



        ............................garbage collector..................

         //garbage collector,heap memeoryide yer alan pool'da kullanilmayanlari, referans gosterilmeyenleri,
         cagirilmayanlari siler neden, daha temiz bir hafiza icin

        String str =new String("Hello"); // this one will be collected from memory by java garbage collector
        str = new String("World");
        //after i removed reference from hello by reassing str to "World"
        //java garbage collacter will remove hello from the memory

        // String str2=new String("Hello");// bu kullanilmadiginda silinecek, ne zaman silinir sure olarak bilmiyoruz ama
        //referans gosterilmediginde mesela bir object;de falan siliniyor


           Integer number=new Integer(123); // will be collected by java garbage collacter
        number = new Integer(10); //bu kalir

        c4_GarbageCollector garbage1=new c4_GarbageCollector(); //object de kullanilmasa bu da silinecek

        new c4_GarbageCollector(); // this will be collected by java garbage collacter
        //java garbage collacter will make java memory more  reausable


        Byte b1=new Byte((byte) 101);// this will be collacted
        b1=null; //bunlar neden silinmiyor cunku bunlar cagrildi ve kullanildi

        c4_GarbageCollector obj2=new c4_GarbageCollector();
        // obj2.finalize();

          obj2.finalize();


          //differenses between final, finally, finalize??????????

          //final:unchangeable variable
          //finally:used inside try catch
          //finalize:used by garbage collector
          1

        //finalize method is called by garbage collacter to sent our object to garbage

 // ********finalize method, collector'u beklemeden garbage gonderir der.

//The final keyword can be used with class method and variable. A final class cannot be instantiated,
// a final method cannot be overridden and a final variable cannot be reassigned.
//
//The finally keyword is used to create a block of code that follows a try block.
// A finally block of code always executes, whether or not an exception has occurred.
// Using a finally block allows you to run any cleanup-type statements that you just wish to execute,
// despite what happens within the protected code.
//
//The finalize() method is used just before object is destroyed and can be called just
// prior to object creation.


..................................String vs StringBuilder vs StringBuffer.........................


    //		String: Immutable (sabit) version char sequences
    //
    //		StringBuilder: mutable (degisken) version char sequences, not synchronized
    //
    //		StringBuffer: mutable (degisken) version char sequences, synchronized , thread-safe, slow


           String str="Hello";
        str.concat("world");
        System.out.println("str = " + str); //hello
        //string is immutable and we didnt print str.concat(world) or we didnt reassing str=str.concat("world");
        //that is why string object wont be modifieded it will stay as hello

        String str2=str.concat("world"); //helloworld
        System.out.println("str2 = " + str2);

        StringBuilder builder=new StringBuilder("Hello"); //open to be modified

        builder.append(" world");//StringBuilder: mutable .... append method ile birlestirdik **********
        System.out.println("builder = " + builder);//Hello world

        StringBuffer buffer=new StringBuffer("Hello");
        buffer.append(" world");//		StringBuffer: mutable
        System.out.println("buffer = " + buffer);



        // *********another way of to reverse string **************************

                String word="java";

       StringBuilder builder2=new StringBuilder(word);
       System.out.println("builder2.reverse() = " + builder2.reverse());  //reverse methodla kelime ters cevrildi












     */
}




