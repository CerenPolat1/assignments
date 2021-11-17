package day14_Arrays;

public class assignment {
}
        //Q1 What is an Array?

//
//        Array is a collection of similar data types. It can have different data type. It can hold both primitive types (int, float, double) and object references.
//                It is fixed in length i.e static in nature.
//        Arrays are created on the heap memory not on the stack.
//                Accessing an invalid index of an Array will cause exception.

//Q2 How do you declare an Array in java?

//        You can declare an Array in java by the following way :
//
//        dataType[]    arrayVariableName  = new dataType[arraySize];
//
//        for example for int data type, you can declare an int array as :
//
//        int[]  temp = new int[256]


//Q3 What is the default value of Array for different data types?
//
//        Data Type                    Default value
//        byte, short, int, long             0
//        float, double                         0.0
//        boolean                                false
//        Any object                           null



//Q4 Can you change size of Array in java after creation?
//
//        You can not change the size of Array after creation.
//        Although there are other data-structures which can change size after creation.

//Q5 Can you pass the negative number in Array size?

//        No, you can not pass the negative number as Array size.
//         If you pass a negative number in Array size then you will not get the compiler error.
//        Instead, you will get the NegativeArraySizeException at run time.
//
//Q6 Can you declare an Array without Array size?

      //  No, you can not declare Array without Array size. You will get compile time error.


//Q7 Where does Array stored in JVM memory ?

       // Array is an object in java. So, Array is stored in heap memory in JVM.


//    Q8 Given a primitive Array in java, where does in JVM it is stored?
//
//        This is a follow-up question of Q7. An Array will always be an object on heap memory, even if the Array is declared to hold primitive elements.
//
//        Q9 What is ArrayStoreException ? When this exception is thrown ?
//
//        According to Oracle docs,
//        ArrayStoreException is a runtime exception. Array must contain the same data type elements.
//
//        This exception is thrown to indicate that an attempt has been made to store the wrong type of object into an array of objects.
//        In other words, if you want to store the integer Object in an Array of String you will get ArrayStoreException.
//
//        The following code throws ArrayStoreException :
//
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
//
//    Q10 What is the difference between ArrayStoreException and ArrayOutOfBoundsException ?
//
//        ArrayStoreException is thrown if you are trying to add incompatible data type. For example, if you try to add an integer object to String Array, then ArrayStoreException is thrown.
//
//        ArrayOutOfBoundsException is thrown when an attempt is made to access the Array with illegal index. For example, illegal index means if the index is either negative or greater than or equal to the size of the Array.
//
//        Q11 What are the advantages of Array ?
//
//        a. We can sort multiple elements of Array at the same time.
//
//        b. Using index, we can access the element of the Array in O(1) time.
//
//        Q12 What are the disadvantages of Array?
//
//        a. To create an Array, contiguous memory is required. It is possible in JVM that the memory is available to accommodate Array but memory available is not contiguous.
//
//        b. The Array is static data structure. It is of fixed size. We can not increase or decrease the size of the Array after creation.
//
//        Q13 Can we use Generics with an Array?
//
//        No, we can not use generics with an Array.
//
//        Q14 What is an Anonymous Array in Java ? Give example?
//
//        An array without any name (or reference) is called an Anonymous Array. They are useful for the scenarios where we need one time usage of Array. For example,
//
//        Anonymous int array :
//        new int[] {2,3,4,5,6,7};
//
//        Anonymous String array :
//        new String[]{"Java", "Hungry"};
//
//        Q15 Write a program to print elements of Array ?
//
//
//public class JavaHungry {
//
//    public static void main(String args[]) {
//
//        int[]  rollNumber = { 23, 17, 20, 29, 30 };
//        for (int temp : rollNumber)
//            System.out.print(temp+" ");
//    }
//}
//
//Output :
//        23 17 20 29 30
//
//        Q16 Write a program to sort an Array in Java ?
//        You do not need to write quick sort or merge sort algorithm in order to sort an Array. You can sort an Array by using Arrays.sort() method. Check out the program below :
//
//        import java.util.*;
//public class JavaHungry {
//
//    public static void main(String args[]) {
//
//        int[]  rollNumber = { 23, 17, 20, 29, 30 };
//        Arrays.sort(rollNumber);
//        for (int temp : rollNumber)
//            System.out.print(temp+" ");
//    }
//}
//
//Output :
//        17 20 23 29 30
//
//        Q17 Write a program to check whether two given Arrays are equal, given both contains same data type and same length ?
//
//        To check whether two given arrays are equal or not , we can use Arrays.equals() method. Check the program below :
//
//        import java.util.*;
//public class JavaHungry {
//
//    public static void main(String args[]) {
//
//        int[]  arr1 = {2, 3, 4};
//        int[]  arr2 = {1, 2, 3};
//
//        System.out.println(Arrays.equals(arr1 , arr2));
//
//        int[]  arr3 = {2, 3, 4};
//
//        System.out.println(Arrays.equals(arr1 , arr3));
//    }
//}
//
//Output :
//        false
//        true
//
//        Q18 Which is legal int[] arr or int arr[] ?
//
//        Both are legal statements. It is preferred to write int[] arr instead of int arr[].
//
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
//
//
//        Q21 What is the difference between Array and ArrayList ?
//
//        Array is static in size i.e of fixed length. Size can not be changed after declaration. ArrayList is dynamic in nature. If you add elements to an ArrayList, it will automatically increase its size.
//
//        Array can contain both primitive and Object data types. ArrayList does not contain primitive data types. It only contains object entries.
//
//        You can find the 8 difference between Array and ArrayList here.
//
//        Q22 What is the difference between Array and LinkedList in java ?
//
//        Memory required for storing the same number of elements in Array is less as compared to LinkedList. Array only stores the data of the element whereas LinkedList stores data plus the address of the next node.
//
//        Array requires contiguous memory allocation where as LinkedList elements are present all over the heap memory. Unlike Array, LinkedList does not have limitation of contiguous memory.
//
//        You can find more differences between Array and LinkedList here.
//
//        Q23 How to find the missing number in a given Array from number 1 to 100 ?
//
//        This question is a popular interview question. I have shared the code with explanation here.
//
//        Q24 What are jagged arrays in java?
//
//        Arrays containing arrays of different length is known as jagged arrays. Multidimensional arrays are also known as jagged arrays. For example,
//
//        Q25 There are two arrays object one containing 100 elements and another containing 50 elements. Both are of same data type. Can we assign one Array to another Array.
//
//        Yes,  an Array of 100 elements can be assigned to an Array of 50 elements in java. The only criteria is that both arrays of same data type. It is because at the time of assigning the values compiler looks for the data type of Array not the size of Array.
//
//        import java.util.*;
//
//public class JavaHungry {
//
//    public static void main(String args[]) {
//
//        int[]  arr1 = new int[50];
//        int[]  arr2 = new int[100];
//        arr1 = arr2;
//        System.out.println(arr1.length);
//
//    }
//}
//
//Output :
//        100
//
//        Q26 What are the different ways to copy one Array from another Array?
//
//        There are four ways by which we can copy an Array.
//
//        a. By using for loop
//        b. By using clone() method
//        c. By using Arrays.copyOf() method
//        d. By using System.arraycopy() method
//
//        Q27 Write a program to search a specific element in an Array?
//
//        You can use binarySearch(int[], int) method. This method internally uses binary search algorithm.
//        It is prerequisite for binary search algorithm to have elements sorted. In the given example I have taken an already sorted Array.
//
//        import java.util.*;
//
//public class JavaHungry {
//
//    public static void main(String args[]) {
//
//        // Sorted Array
//        int[]  arr1 = {1, 2, 3, 4};
//
//    /* if element present in Array, binarySearch()
//    method will return index */
//        System.out.println(Arrays.binarySearch(arr1, 2));
//    }
//}
//
//Output :
//        1
//
//        Q28 What will happen if you do not initialize an Array?
//
//        Array will take default value depending upon the data type.
//
//        Q29 How to find duplicate elements in a given Array?
//
//        There are many ways by which you can find the duplicates in an Array. I am sharing two ways
//        a. using for loop and compare
//        b. using HashSet
//
//        import java.util.*;
//
//public class JavaHungry {
//
//    public static void main(String args[]) {
//
//        String[]  arr1 = {"abc", "java", "javahungry", "java", "javahungry" };
//
//        for(int i=0; i < arr1.length-1; i++){
//            for(int j=i+1; j < arr1.length; j++) {
//
//                if(arr1[i].equals(arr1[j]) && i!=j ) {
//                    System.out.println("Duplicate in Array is : "+ arr1[j]);
//
//                }
//            }
//        }
//    }
//}
//
//Output:
//        Duplicate in Array is : java
//        Duplicate in Array is : javahungry
//
//        Time Complexity O(n^2) i.e quadratic.
//
//        HashSet does not allow duplicate elements. You can traverse the array and insert each element into the HashSet. Add elements using add() method. If it returns true then continue to traverse the array. Otherwise if false then print out the duplicate value.
//
//public class JavaHungry {
//
//    public static void main(String args[]) {
//
//        String[]  arr1 = {"abc", "java", "javahungry", "java", "javahungry" };
//        HashSet<String> set = new HashSet<String>();
//
//        for (String val : arr1)
//        {
//            if (set.add(val) == false){
//                System.out.print (val+" ");
//            }
//        }
//    }
//}
//
//Output :
//        java javahungry
//
//        Time Complexity O(n)
//
//        Q30 What are the different ways to traverse an Array in java?
//
//        a. Using for loop
//        b. Using for each loop
//
//        Q31 Is this a legal way to define arrays int[] arr = new int [4]{1, 2, 3, 4};
//
//        This is invalid way to initialize an Array in Java. You can not provide the size of the Array when you are declaring the elements in it.
//
//        Q32 What is two dimensional Array in java?
//
//        An Array of an Array in java is called as two dimensional Array.
//
//        Q33 How do you declare a two dimensional Array in java?
//
//        int[][] arr = new int[4][4];
//        The above statement will create a 4 x 4 matrix.
//
//        Q34 Can we make Array volatile using volatile keyword?
//
//        Yes, we can make an Array volatile. Only variable representing an Array can be made volatile.
//
//        Q35 Are Array thread-safe ?
//
//        Reading an Array is a thread-safe operation but modifications are not.
//
//        Q36 What is the time complexity O(n) of different operations of an Array?
//
//        a. Access operation : O(1) This means very fast given the index of the element.
//        b. Search operation : O(n) where n represents the number of elements in an Array.
//        c. Insertion operation : O(n) where n represents the number of elements in an Array.
//        b. Deletion operation : O(n) where n represents the number of elements in an Array.
//
//        Q37  Given two arrays, find the intersection between them? (solution)
//
//        Intersection means common elements. We need to find common elements between two given arrays.
//        For example :
//        int[]  arr1 = {1, 2, 3, 4, 5, 6};
//        int[] arr2 = {2, 3, 4, 7, 8};
//        Output : 2, 3, 4
//        You can find the code here.
//
//        Q38 Find the missing number in an Array between 1 to 100. Given only one number is missing. (solution)
//
//        This question is very popular among interviewers. It is one of the simplest question in Array topic.
//        This question is generally asked during telephonic interview or as a warm up question in face to face round of interviews.
//        One of the ways to solve this problem is to calculate sum of all numbers from 1 to 100 then subtract it from the sum of all the numbers in given array. Difference would be the missing number.
//
//        Q39 Find out smallest and largest number in a given Array?
//
//        Logic to find the smallest and largest number in a given Array is given below :
//
//        a. Create two variables for storing largest and smallest number.
//        b. Initialize smallest variable with value Integer.MAX_VALUE
//        c. Initialize largest variable with value Integer.MIN_VALUE
//        d. In each traversal of for loop, we will compare the current element with the largest and smallest number. We will update the value.
//        e. If a number is larger than largest, then it can not be smaller than the smallest. So we can skip if first condition is true.
//
//
//        import java.util.*;
//
//public class JavaHungry {
//    public static void main(String args[]) {
//
//        // Given Array
//        int[] inputArr = {10,43,27,98,75,59,191};
//
//        // Setting largest value
//        int largest = inputArr[0];
//
//        // Setting smallest value
//        int smallest = inputArr[0];
//
//        // Iterate through the Given Array
//        for( int number : inputArr ) {
//            if(number > largest) {
//                largest = number;
//            }
//            else if (smallest > number) {
//                smallest = number;
//            }
//        }
//        System.out.println("Largest and Smallest numbers are "
//                + largest +" "+smallest);
//    }
//}
//
//Output :
//        Largest and Smallest numbers are 191 10
//
//        Q40 How to reverse an Array in java ? (solution)
//
//        You will find this type of questions during telephonic round of interview or early rounds of face to face interview. Make sure you go through this question before appearing for the interview.
//
//        Q41 Write a program to sum all the values of a given Array in java?
//
//public class JavaHungry {
//
//    public static void main(String args[]) {
//
//        // Given Array
//        int[] inputArr = {10,43,27,98,75,59,191};
//
//        int sum = 0;
//
//        //Iterating through the Array
//        for(int num : inputArr) {
//            sum = sum + num;
//        }
//
//        System.out.println(sum);
//
//    }
//}
//
//Output :
//        503
//
//
//        Q42 How to convert HashSet to Array in java ? (solution)
//
//        You can convert HashSet to Array using toArray() method.
//
//        Q43 How do you separate zeros and non-zeros in a given Array in java?
//
//        Logic to separate zeros and non-zeros is given below :
//
//        a. Initialize variable counter to 0.
//        b. Iterating inputArr from left to right. If inputArr[i] is not zero then assign inputArr[i] to inputArr[counter].
//        c. Increment the counter by 1.
//        d. Assign the remaining elements with 0 value.
//
//        import java.util.*;
//
//public class JavaHungry {
//
//    public static void main(String args[]) {
//
//        // Given Array
//        int[] inputArr = {0,10,43,27,0,98,75,59,191,0};
//
//        int counter = 0;
//
//        //Iterating through the Array
//
//        for(int i=0;i < inputArr.length;i++) {
//            if(inputArr[i] != 0) {
//                inputArr[counter] = inputArr[i];
//                counter++;
//            }
//        }
//
//        while (counter < inputArr.length) {
//            inputArr[counter] = 0;
//            counter++;
//        }
//
//        System.out.println(Arrays.toString(inputArr));
//
//    }
//
//}
//
//Output:
//        [10, 43, 27, 98, 75, 59, 191, 0, 0, 0]
//
//        Q44 How to convert Array to ArrayList in java ? (solution)
//
//        The easy way to convert Array to ArrayList is using Arrays class asList() method. You need to pass the Array to the asList() method as argument. For example,
//
//        String[] cityNames ={"Boston", "Chicago", "San Francisco", "New York"};
//        /* One liner - Array to ArrayList conversion*/
//        ArrayList<String> cityList= new ArrayList<String>
//
//   (Arrays.asList(cityNames));
//
//           There is another way to convert Array to ArrayList using addAll() method. For details check here.
//
//           Q45 How to convert Array to TreeSet in java ? (solution)
//
//           To convert Array to TreeSet in java, first we need to convert Array to List using Arrays class asList() method. After converting Array to List,  pass the list object to TreeSet constructor. That's it , Array has been converted to TreeSet. You can confirm by printing out the values of TreeSet object.
//
//        Q46 How to convert ArrayList to String Array in java ? (solution)
//
//        There are two ways to convert ArrayList to String Array in java. First method is using ArrayList get() method and second is using toArray() method. You can check both of the methods here.
//
//        Q47 Write a program to find second largest element in a given Array in java?
//
//        The easiest way to solve this problem by using sorting. Sort the given Array and then iterate to the second last element.
//
//        import java.util.*;
//public class LargestSmallest
//{
//    public static void main(String[] args)
//    {
//        // Given Array
//        int inputArray[] = new int[] {10,43,27,98,75,59,191};
//
//        // Sort Array
//        Arrays.sort(inputArray);
//
//        // Iterate Array to Second last element
//
//        for(int i=0; i < inputArray.length; i++) {
//            // Print second last element
//            if(i == inputArray.length- 2)
//                System.out.println(inputArray[i]);
//        }
//    }
//}
//
//Output :
//        98
//
//        Q48 How to check if Array contains the desired value or not ?
//
//        Suppose we have a String Array temp.
//        String[] temp = new String[]{"D","H","B","R"};
//
//        If desired value exists in the temp Array then below method will return true otherwise false. The below program uses contains() method to check whether inputArray contains the desired element or not.
//
//        import java.util.*;
//
//public class JavaHungry {
//
//    public static void main(String args[]) {
//        String[] inputArray = new String[]{"D","H","B","R"};
//
//        System.out.println(isExist(inputArray,"B")); // true
//
//        System.out.println(isExist(inputArray,"G")); // false
//
//    }
//
//    public static boolean isExist(final String[] array, final String obj) {
//        return Arrays.asList(array).contains(obj);
//    }
//}
//
//    Below java program uses equals() method to check whether inputArray contains the desired element.
//
//        import java.util.*;
//
//public class JavaHungry {
//
//    public static void main(String args[]) {
//
//        String[] temp = new String[]{"D","H","B","R"};
//
//        System.out.println(isExist(temp,"B")); // true
//
//        System.out.println(isExist(temp,"G")); // false
//
//    }
//
//    public static boolean isExist(final String[] array, final String obj) {
//        for (String str : array) {
//            if(str.equals(obj))
//                return true;
//        }
//        return false;
//    }
//}
//
//
//    Q49 Write a program to find the first repeating number in an integer Array?
//
//        a. Logic is declare a variable minimum. Iterate through the Array in reverse order i.e from last element to first element. Add elements to the HashSet one by one.
//        b. If repeated value occurs then store the index of the repeated value to the minimum variable.
//
//
//        import java.util.*;
//
//public class FirstRepeating {
//
//    public static void main(String args[]) {
//
//        int[] arr = new int[]{1,2,3,4,5,7,4,9};
//        firstRepeating(arr);
//    }
//
//    public static void firstRepeating(int[] arr) {
//
//        int minimum = -1;
//        HashSet set = new HashSet();
//        for (int i = arr.length-1 ;i >=0 ;i--) {
//            if(set.contains(arr[i]))
//                minimum = i;
//            else
//                set.add(arr[i]);
//        }
//        if(minimum != -1){
//            System.out.println("first repeating element is  : "+ arr[minimum]);
//        }
//    }
//}
//
//Output :
//        first repeating element is  : 4
//
//
//        Q50 Write a program to find the first non-repeating number in an integer Array?
//
//        Compare one element with rest of the remaining elements. If value does not match then exit the iteration and print the value.
//
//public class FirstNonRepeating {
//
//    public static void main(String args[]) {
//
//        int[] arr = new int[]{1,2,3,4,5,1,2,3,5,9};
//        System.out.println(firstNonRepeating(arr,arr.length));
//    }
//
//
//
//    public static int firstNonRepeating(int[] arr, int length) {
//        int j;
//        for (int i=0; i < length ;i++) {
//            for(j=0; j < length ;j++) {
//                if (arr[i]==arr[j] && i!=j) {
//                    break;
//                }
//            }
//            if (j == length)
//                return arr[i];
//        }
//        return -1;
//    }
//}
//
//Output :
//        4

