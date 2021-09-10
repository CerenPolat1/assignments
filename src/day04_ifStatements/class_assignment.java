package day04_ifStatements;
public class class_assignment {
    public static void main(String[] args) {

        // 1-Write a Java program that takes 4 numbers

        int a = 20;
        int a1 = 30;
        int a2 = 40;
        double d1 = 20.5;

        System.out.println(a+a1-a2/d1);
        System.out.println("Avarege of (a+a1-a2/d1) is " + 48.048780487804876 );

        // 2- write a program that will return max number from 3 numbers

        int b=200;
        int c1=300;
        int c2= 400;
        boolean bol1= b<c1 && b<c2; //t
        boolean bol2= c1<c2 && c1<b; // f
        boolean bol3= c2<b && c2<c1; // f
        if(bol1){
            System.out.println("Min number is "+ b);
        }
        if(bol2){
            System.out.println("Min Number is" + c1);
        }
        if(bol3){
            System.out.println("Min number is"+ c2);
        }

        //3- Write a Java program to print a face

        System.out.println("  +\"\"\"\"\"+");
        System.out.println(" [| o o |]");
        System.out.println("  |  ^  |");
        System.out.println("  | '-' |");
        System.out.println("  +-----+");

        //4- Write a Java program to compare two numbers. Go to the editor
        //Input Data:
        //Input first integer: 25
        //Input second integer: 39
        //Expected Output
        ////

        int y=25;
        int z=39;

        boolean bo=  25!=39;   //t
        boolean bo2= 25<39;    //t
        boolean bo3= 25<=39;   //t
        System.out.println("25!=39 is " + bo);
        System.out.println("25<39 is " + bo2);
        System.out.println("25<=39 is "+bo3);

        //5-.create a java program to check number is positive or negative


        int k1= 15;

        if(k1<-20){
            System.out.println(k1+ " is negative."); // f
        }
        if (k1>-20){
            System.out.println(k1+ " is positive."); //t
        }

    }

}

