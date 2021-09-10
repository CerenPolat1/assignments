package day01_intruduction;

public class c2_comments { // openiing bracket for class


    //comments doesnt have any funclaty
    //there is 2 type of comment first single line second multi line comment
    //it wont effect your actual code

    //single line comment  i use doule slash to create a single line comment
    //hello workmalsdma,,m.da

    //asda,smnd,ams this will give us error if we dont put them comments


    //main method : to be able to run our code we will need to have main method
    //to create a main method you will need to create as below
    public static void main( String [] args) { // openinng bracket for maiin method

        //we are telling java sytem to print the line
        System.out.println("This is comment class");
        System.out.println("Hello , this is sevgin");

        //closing bracket for main method
    }


    public static class Variable_Practise {
        public static void main(String[] args ) {
            System.out.println("Byte Numbers");
            byte number1 = 20;
            byte number2 = 19;
            byte number3 = 18;
            byte number4 = 17;
            byte number5 = 16;

            System.out.println(number1);
            System.out.println(number2);
            System.out.println(number3);
            System.out.println(number4);
            System.out.println(number5);
            System.out.println(number1-number5);
            System.out.println(number3+number2);
            System.out.println(number1/number4);
            System.out.println(number3*number5);

            System.out.println("-------------");

            System.out.println("int numbers");

            int i1 = 1000;
            int i2 = -1000;
            int i3 = 1002;
            int i4 = -100099;
            int i5 = 100001;
            System.out.println(i1);
            System.out.println(i2);
            System.out.println(i3);
            System.out.println(i4);
            System.out.println(i5);
            System.out.println(i2%i3);
            System.out.println(i1-i3);
            System.out.println(i4+i3);



            System.out.println("-----------");

            System.out.println("Short Numbers");

            short s1 = 780;
            short s2 = 6780;
            short s3 = 570;
            short s4 = -3860;
            short s5 = 9870;

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);
            System.out.println(s5);
            System.out.println(s5+s2);
            System.out.println(s2*s2);
            System.out.println(s4/s5);

            System.out.println("-----------");

            System.out.println("Long numbers");

            long l1 = 789430;
            long l2 = 32652620;
            long l3 = -6825496;
            long l4 = -1768941;
            long l5 = 657284685;

            System.out.println(l1);
            System.out.println(l2);
            System.out.println(l3);
            System.out.println(l4);
            System.out.println(l5);
            System.out.println(l1+l5);
            System.out.println(l1-l2);
            System.out.println(l2%l3);
            System.out.println(l3/l5);


            System.out.println("---------");

            System.out.println("Double Numbers");

            double d1 = 5.9;
            double d2 = 2.1;
            double d3 = -1.2;
            double d4 = 11.5;
            double d5 = 13.7;

            System.out.println(d1);
            System.out.println(d2);
            System.out.println(d3);
            System.out.println(d4);
            System.out.println(d5);
            System.out.println(d5);
            System.out.println(d5+d3);
            System.out.println(d4*d2);
            System.out.println(d1/d3);


            System.out.println("------------");

            System.out.println("Float numbers");

            float f1 = 10f;
            float f2 = -126f;
            float f3 = 41f;
            float f4 = 21f;
            float f5 = 11f;

            System.out.println(f1);
            System.out.println(f2);
            System.out.println(f3);
            System.out.println(f4);
            System.out.println(f5);
            System.out.println(f1%f4);
            System.out.println(f2+f3);
            System.out.println(f5-f2);

            System.out.println("------------");

            System.out.println("Boolean Numbers");

            boolean b1 = true;
            boolean b2 = false;
            boolean b3 = 50>45;
            boolean b4 = 230<130;
            boolean b5 = -2.3>-12.7;

            System.out.println(b3);
            System.out.println(b4);
            System.out.println(b5);

            System.out.println("------------");

            System.out.println("Checking 350's divisibility");

            int x = 350;
            int y = 2;
            int z = 3;
            int t = 5;

            System.out.println(x/y);
            System.out.println("350 is divisible by 2 true");
            System.out.println(x/z);
            System.out.println("350 is divisible by 3 false");
            System.out.println(x/t);
            System.out.println("350 is divisible by 5 true");





        }
    }
}//closing bracket for the class


//all codes needs be typed in the class (which is between opening and closing brackets)



/*
Multi line comment

hello
hello

asdsa


 */

/*
between those multi
line comments
anything you write
will be commented
and it wont effect your code.
 */