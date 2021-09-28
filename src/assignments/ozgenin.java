package assignments;

//OZGE KARABULUT
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ozgenin {

    public static void main(String[] args) {
        //Task 1:
//    Write a Java program to display the middle character of a string in uppercase
//        --> If the length of the string is even number  String will have two middle characters.
//        --> If the length of the string is odd number String  will have one middle character.
//
//    example :
//                Input 1 :  World             Output 1:Middle character is: R
//                Input 2 :  computer          Output 2:Middle character is: PU
//                .....
        System.out.println("------------------------------TASK 1---------------------------");
        System.out.println("Enter a word");

        Scanner input=new Scanner(System.in);
        String word=input.nextLine();

        int wordLength=word.length();
        String wordNew;
        int startPoint=0;

        while (startPoint<=wordLength){
            if(wordLength%2==0){
                System.out.println("My middle character is:"+word.substring(wordLength/2-1,wordLength/2+1).toUpperCase());
            }else{
                System.out.println("My middle character is:"+word.substring(wordLength/2,wordLength/2+1).toUpperCase());
            }
            startPoint++;
            break;
        }

        // OR

        System.out.println("-Second try for 1st task with only If Condition-");
        System.out.println("Enter your second word:");
        String word2=input.nextLine();
        int lengthWord2=word2.length();
        String newWord2;

        if(lengthWord2%2==0){
            System.out.println("My middle character is:"+word2.substring(lengthWord2/2-1,lengthWord2/2+1).toUpperCase());
        }else{
            System.out.println("My middle character is:"+word2.substring(lengthWord2/2,lengthWord2/2+1).toUpperCase());
        }

        System.out.println("---------------------------TASK 3------------------------------");

//#3 - Ask user to enter two words. Then add them together and print.
// But if the last letter of the first word and the first letter of the last letter is the same, print that character once.
//                    Input:
//                        one
//                        eight
//                    Output:
//                        oneight


        System.out.println("Enter 1st word:");
        String userWord1=input.nextLine();
        System.out.println("Enter 2nd word:");
        String userWord2=input.nextLine();
        System.out.println("Your 1st and 2nd words are:"+userWord1+userWord2);

        int word1LastIndex=userWord1.length()-1;
        String word1LastIndex1=""+userWord1.charAt(word1LastIndex);
        //String endOfW1=userWord1.substring(word1LastIndex);//other way to convert string method

        int wordFirstIndex= userWord2.charAt(0);
        String wordFirstIndex2=""+userWord2.charAt(0);
        //char w1=userWord1.charAt(word1LastIndex);//you can use char for both of them to write inside of the if condition

        if (word1LastIndex1.equals(wordFirstIndex2)){
            System.out.println(userWord1.concat(userWord2.replaceFirst(wordFirstIndex2,"")));
        }else{
            System.out.println("your words are:"+userWord1+userWord2);
        }

        System.out.println("---------------------------TASK 4------------------------");

        // task 4. write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5


        for (int i=0; i<=100; i++){

            if (i%2!=0 && i%3==0 && i%5==0){
                System.out.println("All odd numbers are:"+i);
            }
        }
        System.out.println("---------------------------TASK 5------------------------");

        //task 5. write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5

        for (int i=0; i<=100; i++){

            if (i%2==0 && i%3==0 && i%5==0){
                System.out.println("All odd numbers are:"+i);
            }
        }

        System.out.println("--------------------------TASK 6------------------------");



 // task 6. write a program that can return the factorial number of any given number
        //    Ex:
           //     input: 6
             //   output: 720

          //  because:
             //   6! = 6 * 5 * 4 * 3 * 2* 1 = 120

              //  15!= 15 * 14 *.....* 1

      System.out.println("Calculate Factorial ");
        System.out.println("Enter your number:");



/*  task 6. write a program that can return the factorial number of any given number
            Ex:
                input: 6
                output: 720

            because:
                6! = 6 * 5 * 4 * 3 * 2* 1 = 120

                15!= 15 * 14 *.....* 1
*/
       System.out.println("Calculate Factorial ");
       System.out.println("Enter your number:");


       int ending=input.nextInt();
       int starting=1;
       int fact1=1;

        while(starting<=ending){
           fact1 *=ending;
            ending--;
        }System.out.println("Factorial is equal to="+fact1);

//OZGE KARABULUT

//
//        System.out.println("enter int");
//        int gb=input.nextInt();
//
//        int facnum=1;
//
//        for(int i=1; i<=gb; i++){
//            facnum*=gb;
//            System.out.println("factorial= "+ gb);
//        }


    }
}
      /* int starting=1;
       int fact1=1;

        while(starting<=ending){
           fact1 *=ending;
            ending--;
        }System.out.println("Factorial is equal to="+fact1);

//OZGE KARABULUT

//
//        System.out.println("enter int");
//        int gb=input.nextInt();
//
//        int facnum=1;
//
//        for(int i=1; i<=gb; i++){
//            facnum*=gb;
//            System.out.println("factorial= "+ gb);
//        }


    }
}
*/


//OR



//
//        if(userWord1.substring(userWord1.length()-1)==userWord2.substring(0,1)) {
//                System.out.println(userWord1.substring(userWord1.length()-1).concat(userWord2.substring(0,1)));
//                } else{
//                System.out.println("invalid");
//                }
//
//                System.out.println("***********************");