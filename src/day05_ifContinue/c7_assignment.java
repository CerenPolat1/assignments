package day05_ifContinue;

public class c7_assignment {

    public static void main(String[] args) {
        //task 1: create a java program that will check if number is divisible by 2 and 5 same time
        int nbr = 180;
        if ((nbr % 2 == 0) && (nbr % 5 == 0)) {
            System.out.println(nbr + " can divide both 2 and 5");
        }

        //task 2: write  java program to find the largest among three numbers. 1) Using if-else..if

        int a = 900;
        int b = 50;
        int c = 80;

        if ((a > b) && (a > c)) {
            System.out.println(a + " is largest number of them");
        } else if ((b > c) && (b > a)) {
            System.out.println(b + " is largeest number of them");
        } else {
            System.out.println("All of them are equal");
        }

        //task 3: create Program to check whether the given number is positive or negative

        int abc = 5;

        if (abc > 0) {
            System.out.println(abc + " is a positive number.");
        } else if (abc < 0) {
            System.out.println(abc + " is a negative number.");
        } else {
            System.out.println(abc + "is not positive or negative");
        }


    }


}


