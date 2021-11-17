package importantThings;

import java.util.Arrays;
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

        int number=10;
        //infinitive do while
//        do {
//            System.out.println("hello");
//        }while (number==10);



        int number4=0; //starting point

        do {
            if (number4%2==0){
                System.out.print(number4 + " , ");
            }
            number4++; // iteration

        }while (number4<=100);//condition end point

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


        int number1 , number2 ;
        char choice; //y or n
        Scanner input=new Scanner(System.in);

        do {
            //ask user to enter a number
            System.out.println("Enter First Number ");
            number1=input.nextInt();
            System.out.println("Enter Second Number ");
            number2=input.nextInt();

            // The numbers should be added and the sum displayed.
            int sum = number1 + number2;
            System.out.println("Sum of "+number1+ " + " +number2 + " is : "+sum );

            // The loop should ask the user whether he or she wishes to perform the operation again.
            // If so, the loop should repeat; otherwise it should terminate.
            // if user says y or Y continue
            // if user says n or N stop the loop
            System.out.println("Do you want to sum 2 new numbers y/n");
            choice=input.next().charAt(0);

        }while (choice == 'y' || choice=='Y');


////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//nested loop : loop inside another loop
        for (int y =1 ; y <=3 ;y++){
            System.out.println("* * * * *");
        }
        System.out.println("++++++++++++++++++");
        //bu sekli kisa yoldan da yapabiliriz ,asagidaki gibi uzun da.
        //* * * * *
        //* * * * *
        //* * * * *

        int totalRow=3;
        int totalColumn=5;

        for (int p=1 ;p<=totalRow ; p++){ // totalRow

            for (int j=1; j<= totalColumn ; j++){ //  totalColumn
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

        for (int a = 0 ; i < 3 ;a++){ //0 1 2
            System.out.println("Hello"); //0 1

            //i=0 , 1 ,2
            for (int j=1 ; j < 5 ; j++){ // 01 02 03 04  ,, 11 12 13 14 , 21 22 23 24
                System.out.println("Java");
            }

        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //        //create a condition that will print min and max number from given array

        int [] listOfNumbers={10,0,100,200,500,5,-5,20};

        //max == 500
        //min == - 5

        //just assume
        int max = listOfNumbers[0];//10
        int min = listOfNumbers[0];//10


        for (int p =0 ;p < listOfNumbers.length ; p++){ // 0 1 2 3 ... lastindex

            if (listOfNumbers[p]>max){ //[2]=100 > 10   // [3] 200 >100 //[4] 500 >200
                max=listOfNumbers[p];//this will reassign new max values the max variable
            }

            if (listOfNumbers[p] < min){
                min = listOfNumbers[p];
            }
        }

        System.out.println("Max number is " + max);
        System.out.println("Min number is " + min);


////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //we have a method to convert from hashcode to string and that will return you whole array !!!!!!!!!!!!!
        //Arrays is librarry inside java and it has different methods
        //tostring method will ask and array and convert whole array to string

        String []names = {"azmar","hasim" , "korkmaz" ,"shilan"};

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

            String sentnce="Java is fun ";
            //fun is java
            String [] splitedSentence=sentnce.split("  ");//[Java, is, fun]
            System.out.println (Arrays.toString(splitedSentence));

            String reverseSentence="";//store result from last index to first index

            for (int m = splitedSentence.length -1 ; m >=0 ; m--){
            reverseSentence += splitedSentence[m] + " ";
            System.out.println("in the loop " + reverseSentence);
            }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //How do you split a sentence based in specific character?
        String sntnce="Hello java is planet ,java is beautful java is best ";

        //to split from second java
        int indxOfPlanet=sntnce.indexOf("java is b");
        String splitedSentnce=sntnce.substring(indexOfPlanet);
        System.out.println(splitedSentnce);


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        //how can you reverse a string
        //input   hello
        //output  olleh

        Scanner inpt=new Scanner(System.in);

        System.out.println("Enter your word ");
        String wordd2=inpt.nextLine();
        //since we dont know the word we need get last index of word to be able to reverse string from last char
        //to get last index number length -1
        System.out.println("Lentg of your word " + wordd2.length());
        int lastIndex=wordd2.length() -1 ;

        String reverseWord2="";

        //what is starting point for loop
        //starting point last index
        //ending point will be 0
        //iteration --
        for (int a =lastIndex ; a >= 0  ; a--){ // last index lastindex-1 ......0 (11 10 9 ..0)
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

        int []numberList={33,0,2,4,6,7,5,3,100,25,30,200};

        //output will say 6 even numbers
        //4 odd numbers

        int evenCount=0;
        int oddCount=0;

        for (int numbr : numberList){
            if (number %2 ==0) {
                evenCount++;
            }else {//odd numbers
                oddCount++;
            }
        }

        System.out.println("Even count is " + evenCount);
        System.out.println("odd count is " + oddCount);

        System.out.println("///////////////////////////");


        int [][] arr2d={ {1,2,3} , {4,5} ,{6,7,8,9,10}};

        for( int [] each1D : arr2d){ //this will store each child container

            for (int eachNumber : each1D){ //this will store each number from each container
                System.out.print(eachNumber+" ");
            }
        }


        //from 2d array
        //create a java logic that will print odd and even numbers
        //count of even and odd
        //also it will print sum of oddnumbers and sum of even numbers

        int [][] nmber2D={
                {1,2,3,4},
                {5,6,7,20},
                {8,9,10,11}
        };

        int countOdd=0;
        int countEven=0;
        int sumEven=0;
        int sumOdd=0;

        for (int [] each1d : nmber2D){

            for (int eachNumber : each1d){
                if (eachNumber %2 == 0 ){
                    countEven++;
                    sumEven += eachNumber;
                    System.out.println(eachNumber + " is even number");
                }else { //odd numbers
                    countOdd++;
                    sumOdd += eachNumber;
                    System.out.println(eachNumber + " is odd number");

                }

            }
        }

        System.out.println("Count of even numbers : "+ countEven + " sum of even numbers " + sumEven);
        System.out.println("Count of odd numbers : "+ countOdd + " sum of odd numbers " + sumOdd);



        //write a program that can return the count of "java" and "javascript" anywhere in the sentence
        //String sentence = "I like java and javascript,java is best, java and javascript,java ";

        String sentence1 = "I like java and javascript,java is best, java and javascript,java ";
        String[] news= sentence1.split(" "); // put space bec i wanna divide words

        System.out.println(Arrays.toString(news));
        System.out.println("#######");
        String word1="java";
        String wrd2="javascript";
        int count=0;  // why i use int bec. i wanna see how many java included in this sentence
        int count2=0; //why i put 0, bec it start to sum with 0,0+1,0+2...

        for(String each:news){
            if(each.contains(word1)){     //if use equal, or equalignorecase they wont work properly.
                count++;
            }
            if(each.contains(wrd2)){
                count2++;
            }

        }

        System.out.println("java count "+ count + " times.");
        System.out.println("javascrip count "+ count2 + " times.");

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












}

    }