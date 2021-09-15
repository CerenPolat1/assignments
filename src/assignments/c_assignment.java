package assignments;
import java.util.Locale;
import java.util.Scanner;
public class c_assignment {
    public static void main(String[] args) {




        //Task 1:
//    Write a Java program to display the middle character of a string in uppercase
//        --> If the length of the string is even number  String will have two middle characters.
//        --> If the length of the string is odd number String  will have one middle character.

        Scanner abc = new Scanner(System.in);
        System.out.println("enter word:");
        String b = abc.next();

        int d = b.length() - 1;
        if(d%2==0){
            System.out.println(b.concat(b.substring(d/2+1)).toUpperCase());
        }else{
            System.out.println(b.concat(b.substring(d/2)).toLowerCase());
        }


        System.out.println("**********************");

//#3 - Ask user to enter two words. Then add them together and print.
// But if the last letter of the first word and the first letter of the last letter is the same, print that character once.
//                    Input:
//                        one
//                        eight
//                    Output:
//                       oneight

        Scanner mmm = new Scanner(System.in);
        System.out.println("enter two words");
        String a = mmm.nextLine();
        String g = mmm.nextLine();

        int lastindex = a.length() - 1;
        String oo = "" + a.charAt(lastindex);

        int firstindex = g.charAt(0);
        String mm = "" + g.charAt(0);


        if (oo.equals(mm)) {
            System.out.println("1st and 2nd word: " + a + g.substring(1));
        } else {
            System.out.println("they have different last and first letter");
        }

        System.out.println("***********************");


        //task 4. write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5


        for (int v = 0; v < 100; v++) {

            if (v % 3 == 0 && v % 5 == 0) {

                System.out.println("these are odd number " + v);


            }

        }
        System.out.println("***********************");

        //task 5. write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5


        for (int t = 0; t < 100; t++) {

            if (t % 2 == 0) {
                System.out.println("this number is even number  " + t);

            }

        }



        /*
  task 6. write a program that can return the factorial number of any given number
            Ex:
                input: 6
                output: 720

            because:
                6! = 6 * 5 * 4 * 3 * 2* 1 = 120

                15!= 15 * 14 *.....* 1
 */



        Scanner rr= new Scanner(System.in);
        System.out.println("enter factorial number");
        int fac=rr.nextInt();

        int end=1;
        int s=1;

        while(fac>=end){
            s*=end;
            fac--;
            System.out.println(s);
        }
    }
}
