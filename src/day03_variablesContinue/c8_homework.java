package day03_variablesContinue;

public class c8_homework {
public static void main(String [] args ){
System.out.println ("Hello!! \nCeren Polat");


//2. Test data--to sum
    int a2= 74;
    int a3= 36;
    System.out.println (a2+a3);

//3. Test data-- to divide
int a4= 50;
int a5= 3;
System.out.println (a4/a5);

//4. multiple data
    int a6= -5;
    int a7= 8;
    int a8= 6;
    int a9= 55;
    int a10=9;
    int a11=20;
    int a12=3;
    int a13= 15;
    int a14=2;
    int a15= -3;
    int a16= 5;
    System.out.println (a6+ a7*a8);
    System.out.println ( (a9+a10)%a10);
    System.out.println (a11+ a15*a16 /a7);
    System.out.println (a16+a13/a12*a14-a7%a12);

//5.Test Data
    int b1= 25;
    int b2= 5;
    System.out.println ("The first number is:" + b1);
    System.out.println ("The second number is:"+ b2);
    System.out.println ("As conclusion,25*5 multiplation"+ "="+ b1*b2);

    //6.addition, multiply, subtract, divide, remainder

    int first= 125;
    int second=24;
    System.out.println ("125+24=" + (first+second));
    System.out.println ("125-24=" + (first-second));
    System.out.println ("125*24=" + (first*second));
    System.out.println("125/24=" + (first/second));

 //7.test data
 int c=8;
 System.out.println (c+"*"+ "1"+ "="+c);
 System.out.println (c+"*"+"2"+ "="+"16");
 System.out.println (c+ "*" + "3"+ "="+ "24");
 System.out.println (c+ "*"+ "10"+ "="+ "80");

//8.sample pattern
System.out.println ("Sample Pattern:\n");
//   J    a   v     v  a
//   J   a a   v   v  a a
//J  J  aaaaa   V V  aaaaa
// JJ  a     a   V  a     a

    System.out.println("\tJ\ta\tv\tv\ta");
    System.out.println ("\tJ\ta a\t v\tv a  a" );
    System.out.println(" J  J aaaa   V V   aaaa");
    System.out.println("  JJ a \t a    V   a \ta");


    //9.specified expressions

   double d1=25.5;
   double d2=3.5;
   double d3=40.5;
   double d4= 4.5;
   System.out.println ((d1*d2-d2*d2) / (d3-d4) );

   //10.specified formula

    double d5=4.0;
    double d6=1.0;
    int i1=1;
    int i2=3;
    int i3=5;
    int i4=7;
    int i5=9;
    int i6=11;
    System.out.println (d5 * (i1-(d6/i2)+ (d6/i3)-(d6/i4)+ (d6/i5)- (d6/i6)));


//12. average of numbers

    int c1= 20;
    int c2=30;
    double e1=3.1;
    double e2=4.2;
    System.out.println ((c1*e1)+ e1-e2+c2);

}

}
