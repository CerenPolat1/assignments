package assignments;

public class a_assignments {

    public static void main(String[] args) {

        //Sentence =hello my name is hello worlD.     i am 25 years old. i am living in new yorK .       i have been in the IT industry for about 6 years.    i starteD as a manUal tesTer and now doing AutOMation for about 4 years.   i have experience in different DOmains: education, Energy, finance.i have Scrum Master and Oracle Java Programmer certificates.my main lanGuage is JAVA. i designed and deveLoped many automation test scripts by using BDD framework


//first create one string and copy pass above paragraf.
//then create multiple strings to store each sentence that you see in the paragraf.
//Do below modification for your sentences :
//make sure each sentence first letter capital .
//make sure city names start with capital .
//rest needs to be small cases.
//make sure to change name,age and city information with your personal information
//make sure to trim your sentences
//after those modifications
//print each sentence length , last index number
//print first,last and fifth character from each sentence.
//


        String a = "hello my name is hello worlD";
        String b = "     i am 25 years old. ";
        String c = " i am living in new yorK .";
        String d = "       i have been in the IT industry for about 6 years.";
        String e = "    i starteD as a manUal tesTer and now doing AutOMation for about 4 years.";
        String f = "i have experience in different DOmains: education, Energy, finance.i have Scrum Master and Oracle Java Programmer certificates.";
        String g = "my main lanGuage is JAVA.";
        String h = " i designed and deveLoped many automation test scripts by using BDD framework";

        a = a.replace("hello worlD", "Ceren");


        System.out.println(a.substring(0, 1).toUpperCase().concat("" + a.substring(1, 17).toLowerCase().concat("" + a.substring(17, 18).toUpperCase().concat("" + a.substring(18).toLowerCase()))));
        System.out.println(a.length());
        System.out.println("last index=" + a.lastIndexOf("n") + " and length = " + a.length());
        System.out.println("first char is " + a.charAt(0) + " last char is " + a.charAt(21) + " fifth char is " + a.charAt(10));

        System.out.println("//////////////////");


        b = b.replace("25", "28").trim();

        System.out.println(b.length());
        System.out.println((b.substring(0, 1)).toUpperCase().concat(" " + b.substring(1).toLowerCase()));
        System.out.println("last index= " + b.lastIndexOf(".") + " the length= " + b.length());
        System.out.println("first char is " + b.charAt(0) + " last char is " + b.charAt(17) + " fifth char is " + b.charAt(10));
        System.out.println("//////////////////");

//
//
//
//        //c=c.replace("new yorK", "Vaughan");
//        //String c1=c;
//
//        //System.out.println (c1.substring(0,1).toUpperCase().concat(" "+c1.substring(1,15)).toLowerCase().concat(" "+c1.substring(15,16).toUpperCase(). concat (c1.substring(16).toLowerCase())));
//        System.out.println("last index= " + c1.lastIndexOf(".")+ " and length= "+ c1.length());
//        System.out.println("first char is "+ c1.charAt(0)+ " last char is "+ c1.charAt(21) + " fifth char is "+ c1.charAt(10));
//


        c = c.replace("new yorK", "Vaughan");
        String newSentence1 = c.trim();
        String newSentence = newSentence1;
        //c=c.replace(" .", ".");

        //System.out.println(newSentence1);
        //  System.out.println(newSentence.substring(0,1).toUpperCase().concat(newSentence.substring(1,15).
        // toLowerCase().concat(newSentence.substring(15,16).toUpperCase().concat(newSentence.substring(16).toLowerCase()))));
        System.out.println(newSentence.substring(0, 1).toUpperCase().concat(newSentence.substring(1, 15).
                toLowerCase().concat(newSentence.substring(15, 16).toUpperCase().concat(newSentence.substring(16).toLowerCase()))));
        System.out.println("last index= " + newSentence.lastIndexOf(".") + " and length= " + newSentence.length());
        System.out.println("first char is " + newSentence.charAt(0) + " last char is " + newSentence.charAt(21) + " fifth char is " + newSentence.charAt(10));

        System.out.println("///////////////// ");

        d = d.replace("       i have been in the IT industry for about 6 years.", "I graduated from uni in 2017.").trim();
        System.out.println(d.substring(0, 1).toUpperCase().concat("" + d.substring(1)).toLowerCase());
        System.out.println(" last index+ " + d.lastIndexOf(".") + " and length= " + d.length());
        System.out.println("///////////");
        System.out.println("first char is " + d.charAt(0) + " last char is " + d.charAt(28) + " fifth char is " + d.charAt(10));
        System.out.println("/////////////////////");


        System.out.println(e.substring(4, 5).toUpperCase().concat(" " + e.substring(5)).toLowerCase());
        System.out.println("last index= " + e.lastIndexOf(".") + " and lenght= " + e.length());
        System.out.println("first char is " + e.charAt(0) + " last char is " + e.charAt(75) + " fifth char is " + e.charAt(50));
        System.out.println("///////////////");


        f = f.trim();
        f = f.replace("DOmains: education, Energy, finance.i have Scrum Master and Oracle Java Programmer certificates.", "kinf of job.");
        System.out.println(f.substring(0, 1).toUpperCase().concat(" " + f.substring(2)).toLowerCase());
        System.out.println("last index= " + f.lastIndexOf(".") + " and length= " + f.length());
        System.out.println("first char is " + f.charAt(0) + " last char is " + f.charAt(42) + " fifth char is " + f.charAt(10));
        System.out.println("//////////");


        System.out.println(g.substring(0, 1).toUpperCase().concat("" + g.substring(1)).toLowerCase());
        System.out.println("last index= " + g.lastIndexOf(".") + " and length= " + g.length());
        System.out.println("first char is " + g.charAt(0) + " last char is " + g.charAt(24) + " fifth char is " + g.charAt(10));
        System.out.println("********8");


        }
    }


/*


Hello my name is Ceren
22
last index=21 and length = 22
first char is h last char is n fifth char is a
//////////////////
I  am 28 years old.
last index= 22 the length= 24
//////////////////
first char is   last char is . fifth char is 2
i  am living in  Vaughan.
last index= 22 and length= 23
first char is i last char is . fifth char is g
/////////////////
i graduated from uni in 2017.
 last index+ 28 and length= 29
///////////
first char is I last char is . fifth char is d
/////////////////////
i  started as a manual tester and now doing automation for about 4 years.
last index= 75 and lenght= 76
first char is   last char is . fifth char is O
///////////////
i have experience in different kinf of job.
last index= 42 and length= 43
first char is i last char is . fifth char is e
//////////
my main language is java.
last index= 24 and length= 25
first char is m last char is . fifth char is n

Process finished with exit code 0


 */

