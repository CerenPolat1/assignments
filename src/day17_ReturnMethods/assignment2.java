package day17_ReturnMethods;

public class assignment2 {
    public static void main(String[] args) {
        sleepIn(true, true); // it is not working on console without s.println
        System.out.println(sleepIn(true, true));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, false));
        System.out.println("+++++++++++2++++++++++");
        System.out.println(smiling(true, true));
        System.out.println(smiling(false, false));
        System.out.println(smiling(true, false));
        System.out.println("++++++++++3++++++++++++");
        System.out.println(sum(10, 5));
        System.out.println(sum(4, 4));
        System.out.println("++++++++++4+++++++++++");
        System.out.println(diff21(10));
        System.out.println(diff21(25));
        System.out.println("++++++++++5+++++++++++");
        System.out.println(parrot(true,21));
        System.out.println(parrot(false, 6));
        System.out.println(parrot(true, 6));
        System.out.println("++++++++6+++++++++++");
        System.out.println(makes(5,4));
        System.out.println(makes(10, 10));
        System.out.println(makes(7,3));
        System.out.println("++++++++++7++++++++++");
        System.out.println(notstring("not"));
        System.out.println("+++++++++8+++++++++++");
        System.out.println(frontback("code"));

    }

    public static boolean sleepIn(boolean weekdays, boolean vacation) {

        //task1
//The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
//
//sleepIn(false, false) → true
//sleepIn(true, false) → false
//sleepIn(false, true) → true


        if (!weekdays && vacation) {
            return true;
        } else if (weekdays && vacation) {
            return false;
        } else if (!weekdays || vacation) {
            return true;
        } else {
            return false;
        }

    }


    public static boolean smiling(boolean aSmile, boolean bSmile) {
//task2
//We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
// We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
        //monkeyTrouble(true, true) → true
//monkeyTrouble(false, false) → true
//monkeyTrouble(true, false) → false

        if ((aSmile && bSmile) || bSmile) {
            return true;
        } else if (!aSmile && !bSmile) {
            return true;
        } else {
            return false;
        }
    }

    public static int sum(int one, int two) {

//task3
//Given two int values, return their sum. Unless the two values are the same, then return double their sum.
//sumDouble(1, 2) → 3
//sumDouble(3, 2) → 5
//sumDouble(2, 2) → 8

        if (one != two) {
            return one + two;
        } else {
            return (one + two) * 2;
        }


    }

    public static int diff21(int n) {     //
//task4
//Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
//diff21(19) → 2
//diff21(10) → 11
//diff21(21) → 0
//diff21(24) ->6
        //i mentions subtraction
        int diff = 21;

        if (n <= 21) {
            return diff - n;

        } else {
            return (n - diff) * 2;
        }
    }

    public static boolean parrot( boolean talking, int hour) {
//task5
//We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
// We are in trouble if the parrot is talking and the hour is before 7 am or after 20 pm. Return true if we are in trouble.
//parrotTrouble(true, 6) → true
//parrotTrouble(true, 7) → false
//parrotTrouble(false, 6) → false

        if (talking && (hour < 7 || hour > 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean makes ( int a, int b){
        //task6
//Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.
//
//makes10(9, 10) → true
//makes10(9, 9) → false
//makes10(1, 9) → true


        if ((a == 10) || (b == 10) || (a + b == 10)) {
            return true;
        } else {
            return false;
        }
    }



    public static String notstring (String not) {
//task7
//Given a string, return a new string where "not " has been added to the front.
// However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings
//notString("candy") → "not candy"
//notString("x") → "not x"
//notString("not bad") → "not bad"

    String neww = "nut";

    if (not.startsWith(not)) {
        return not;
    } else {
        return not + "nott";
    }
 }

public static String frontback (String word2) {
//task8
//Given a string, return a new string where the first and last chars have been exchanged.
//
//frontBack("code") → "eodc"
//frontBack("a") → "a"
//frontBack("ab") → "ba"


    //!!!!!loop kullanmadik cunku biz hepsinin tamamen sirayla degismesini degil basinin ve sonunun degismesini istiyoruz!!!!!!!!

        if (word2.length()<=1) {
            return word2;
        }
        String mid=word2.substring(1,word2.length()-1);  //boylelikle kelimenin basi ve sonu haric olan kismini buluyoruz
        return word2.charAt(word2.length()-1)+mid+word2.charAt(0);


}

}

//        false
//        false
//        true
//        +++++++++++2++++++++++
//        true
//        true
//        false
//        ++++++++++3++++++++++++
//        15
//        16
//        ++++++++++4+++++++++++
//        11
//        8
//        ++++++++++5+++++++++++
//        true
//        false
//        true
//        ++++++++6+++++++++++
//        false
//        true
//        true
//        ++++++++++7++++++++++
//        not
//        +++++++++8+++++++++++
//        eodc