package day16_Methods;
import myMethods.myLibraryMethods;

// import java.util.Arrays; // neden yazdi cunlu bu packaegin altinda olmadigindan

//burada neden c3 methodu import olmadi cunku c3, zaten day16_Methods; nin icinde oldugundan
public class c6_LibraryTesting {

    public static void main(String[] args) {
        myLibraryMethods.hello();
        myLibraryMethods.printJava10();
        myLibraryMethods.reverseString("Hello world");

        // c3_Methods.hello();
        //Arrays

    }
}