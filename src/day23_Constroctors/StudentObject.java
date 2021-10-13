
package day23_Constroctors;

public class StudentObject {

    public static void main(String[] args) {
        //to be able to call instance variable or method in static main
        //i will need to create an object

        //if i am going to use static methods or variables
        //i can just call with class name

        Student.setSchoolName("Renastech");   // static classin icindesin, bu da variable da static o yuzden direkt class ismini cagirdi ve isledi.

        Student obj1=new Student();

        obj1.setStudentInfo("Mesut");//1
        obj1.getInfo();

        Student obj2=new Student();      // bu objectlerin her biri sifirdan basladigi  icin mi sayimiz ayni kalmiyor??????
        obj2.setStudentInfo("Meral");//2
        obj2.getInfo();

        Student.setSchoolName("Hello World");
        Student obj3=new Student();
        obj3.setStudentInfo("Recep");
        obj3.getInfo();




    }
}