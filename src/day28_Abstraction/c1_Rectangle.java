
package day28_Abstraction;

public class c1_Rectangle extends Shape {


    //yukaridakini extend yaptiginda hata verir bunu duzeltmek icin overriding kullanmak gerek
    //shape'in icindeki tum abstractlari almazsan hata vermeye devam eder.sadece abstract ister digerleri sart degil

    //since we extended abstract class that has abstract methods
    //and since abstract method doesnt have body
    //java is telling us to override abstract methods


    //below method will be inherited
    //shapeArea , shapeName

    public final String shapeName="Rectangle";     //final'i digerleri gibi isim atayip birakamzsin doldurman lazim yoksa error verir
    public double width;
    public double length;

    public c1_Rectangle(double width , double length){  //bu constructor
        this.width=width;
        this.length=length;
    }


    //abstract class needs to be inherited otherwise it doesnt work bec. it doest have body, so it need to use overriding


    @Override    //tek tek shape'dekileri override yapmamiz lazim ki exdent erroru duzelsin
    public void shapeArea(){  //bu shape classdan geldi
        //rectange area = width * length
        double area = width * length;
        System.out.println("Area of " + shapeName + " is : " + area);
    }
    @Override
    public void shapeName(){   //method sadece instance olmali public veya void'le baslamasi onemli degil
        System.out.println("shapeName = " + shapeName);
    }

}

//extra note: what is difference beetween import and extend?
//import is importing from java libraries or packages that you created before..ama bunlar farkli pacgalerdan olur aynisindan olmaz
//extend is calling parent class