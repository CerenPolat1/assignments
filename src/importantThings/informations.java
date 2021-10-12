package importantThings;

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
        int i2= 'c'; // c will have 99 from ascii table

// //////////////////////////////////////////////////////////////////////////

        // string is non primitive data type

        //if you want to copy previous line
        // use ctrl + D for windows
        //use command + D for mac

        ///////////////////////////////////////////////

        //unary (tekli) Operators: sum and cikarma islemi

        // relationalOperators:

        int k1= -15;
        int k2 = +i1; // +(-15) = -15
        int i22= i1 + -i1;// -15 + +15 ==00
        int i3 = -i1; // -(-15) = +15

///////////////////////////////////////////////////////////////////


        //       post / Pre Conditions....

        //System.out.println(++);//pre condition will increase your number by one immediately
        //System.out.println(y++);//post condition will increase the number on next step

        // pre : this will change the value of number immediately
        // post : first wont gonna change anyhthing on the variable , at the end it will change it


        int             xyz=           123;
      //data type     // variable      //value

    }
}
