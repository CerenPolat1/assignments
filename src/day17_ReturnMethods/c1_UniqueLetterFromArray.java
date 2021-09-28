package day17_ReturnMethods;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.util.Arrays;
////!!!!!!!!mulakatta buradan soru gelebiliiir!!!!!!!!
public class c1_UniqueLetterFromArray {
    //Write a program that can print out the unique values from a String Array
    //            Ex:
    //                if arr -> {"A", "A", "B", "C", "C"}
    //                output: B
    //
    //                if arr -> {"A", "B", "B", "C"}
    //                output:  A
    //                         C
    // */

    //the ones only available in array for one time will be unique
    //count of string ,letter will be only one
    //i should only print letters that has count==1
    //to check letter count you will need to compare with all letters and when it equals count will be increased
    //count 1 are unique
    //count 2,3,4,5 .... are not unique

    public static void main(String[] args) {
        String [] letters = {"A", "A", "B", "C","D","D"};

        for (String eachLetter : letters){ //"A"  ,, "B"
            int count=0; // bu loopun disinda olursa run'da sonuc cikmiyor
            for (String eachletter2:letters){//"A", "A", "B", "C","D","D"///we compare one letter againts all letter
                                                       //bu yuzden 2.for each loopu kullandik.
                if (eachletter2.equals(eachLetter)){
                    count++;//1 2 3
                }
            }

            if (count==1){
                System.out.println(eachLetter);
            }
        }

        System.out.println("*******************");
        String [] arr={"A", "B", "B", "C"};
        // String [] arr2={"A", "B", "B", "C"};

        uniquesFromArray(arr);
        // uniquesFromArray(arr2);

       uniquesFromArray2(arr); // [A, B, B, C]

        System.out.println("********************");

    }

    public static void uniquesFromArray(String [] letters){

        //String [] letters = {"A", "A", "B", "C","D","D"};
        //yukaridakine ihtiyac kalmadi cunku uniquesFromArray(String [] letters){ kullandik ve icine atadik

        for (String eachLetter : letters){ //"A"  ,, "B" ,"C", "D" // HER BIRINI BIRER DEFA SAYDI SONRA ASAGI GECECEK
            int count=0;  //bu ilk seferinde icindekileri sayacak

            for (String eachletter2:letters){//"A", "A", "B",  "C","D","D" //BURADA DA BAKIYOR AYNI HARFTEN BASKA VAR MI DIYE
                if (eachletter2.equals(eachLetter)){
                    count++;//1 2 3 // hangisinden kac tane oldugunu sayiyor
                }
            }

            if (count==1){ //halihazirda elimizde ne var biliyoruz simdi de sadece tek olani yazdirmak istiyoruz
                System.out.println(eachLetter);
            }
        }
        System.out.println("******************");
    }

    public static void uniquesFromArray2(String [] letters){

        //String [] letters = {"A", "A", "B",  "C","D","D"};
        //no need this one because we want to make sure to run this method for different String arrays

        System.out.println(Arrays.toString(letters));

        for (int i=0 ; i < letters.length ; i++){//A    //sadece A'yi sayar cunku i=0=A, ardindan ikinci for'a geciyoruz
                                                       //neden sadece A'yi aldi, cunku staeting point 0, akabine for kouyoruz ve count yapsin diye
            int count=0; /// buraya koyduk ki 2.loopu e
            for (int i1 =0 ; i1 < letters.length ; i1++){//{"A", "A", "B",  "C","D","D"};

                if (letters[i1].equals(letters[i])){
                    count++;
                }
            }


            if (count==1){
                System.out.println(letters[i]);
            }
        }

    }


}