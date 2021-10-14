package day25_Inheritance.Assignment2;

import java.util.ArrayList;
import java.util.Arrays;

public class GeneralInfo {

/*
task2
create a class called Person
                attributes:  name, age, gender
                methods: eat, walk, sleep, setPersonInfo

 create a class called Student
                attributes: name, age, gender, studentID
                methods: attendClass, code, setStudentInfo, toString

 create a class called Teacher
                attributes: name, age, gender, teacherType
                methods: startClass, setTeacherInfo, toString

create a class called school:
                    create 3 objects of student and set their info
                    create an ArrayList of students to store all student objects
                    use for each loop to print out each students' name and studentID
 */

     String name;
     int age;
     char gender;

    public static void main(String[] args) {


        Person prsn=new Person();
        prsn.setinfo("John", 15, 'M',12345);
        prsn.eat();
        prsn.walk();

        System.out.println("-----------------");

        Student stndt=new Student();
        stndt.attendClass();
        stndt.setinfo("Unal",27, 'M',12345);
        System.out.println(stndt);   // for toString

        System.out.println("....................");

         Teacher tchr= new Teacher();

         tchr.startclass("Ebru");
         tchr.setinfo("Ebru",27,'F',"History");
         System.out.println(tchr);

        System.out.println(".....................");

        /*
                   create 3 objects of student and set their info
                    create an ArrayList of students to store all student objects
                    use for each loop to print out each students' name and studentID
         */


          Schoool student1=new Schoool();
          student1.setinfo("Gamze", 19, 'F', 123);
          System.out.println();

          Schoool student2=new Schoool();
          student2.setinfo("Hasan",18,'M',1234);
          System.out.println();

          Schoool student3=new Schoool();
          student3.setinfo("Cesur",20, 'M',1212);
          System.out.println();

          ArrayList<Schoool> listofstudent=new ArrayList<>();
          listofstudent.addAll(Arrays.asList(student1, student2, student3));

          for (Schoool each: listofstudent){

          }
         System.out.println("Student name: "+ student1.name+ ", Student ID: "+ student1.studentID);
         System.out.println("Student name: "+ student2.name+ ", Student ID: "+ student2.studentID);
         System.out.println("Student name: "+ student3.name+ ", Student ID: "+ student3.studentID);
    }

    public String toString(){
        return "Name: "+ name+ ", Age:  " + age+ ", Gender: "+ gender;
    }



   static  class Person {


       String name;
       int age;
       char gender;
       int studentID;

       public void setinfo (String name, int age, char gender, int studentId){
           this.name=name;
           this.age=age;
           this.gender=gender;
           System.out.println("Name: "+ name+ ", Age:  "+age+ ", Gender: "+ gender+", Srudent ID: "+studentID);
       }

        public void eat(){

            System.out.println(name+"  generally consumes vegetables");
        }

        public void walk(){
            System.out.println(name+ " went for a walk in the mornings, when "+ name+ " was 12.");
        }
    }


    static class Student{
/*
                create a class called Student
                attributes: name, age, gender, studentID
                methods: attendClass, setStudentInfo, toString
 */
        String name;
        int age;
        char gender;
        int studentID;

        public void attendClass (){

            System.out.println("Students attend class in weekdays");
        }

        public void setinfo (String name, int age, char gender, int studentID){
            this.name=name;
            this.age=age;
            this.gender=gender;
            this.studentID=studentID;
            System.out.println("Name: "+ name+ ", Age:  "+age+ ", Gender: "+ gender+", Student ID: "+studentID);
        }

        public String toString(){
            return "Name: "+ name+ ", Age:  " + age+ ", Gender: "+ gender;
        }


    }


static class Teacher{
        /*

                create a class called Teacher
                attributes: name, age, gender, teacherType
                methods: startClass, setTeacherInfo, toString

 */

    String name;
    int age;
    public char gender;
    String teacherType;

    public void startclass(String name){
        System.out.println(name+ " starts class on time.");
    }

    public void setinfo (String name, int age, char gender, String teacherType ){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.teacherType=teacherType;

        System.out.println("Name: "+ name+ ", Age:  "+age+ ", Gender: "+ gender+", teacher Type: "+teacherType);

    }

    public String toString(){
        return "Name: "+ name+ ", Age:  " + age+ ", Gender: "+ gender;
    }

}

static class Schoool{

        /*
                    create a class called school:
                    create 3 objects of student and set their info
                    create an ArrayList of students to store all student objects
                    use for each loop to print out each students' name and studentID
         */


    String name;
    int age;
    char gender;
    int studentID;

        public void setinfo (String name, int age, char gender, int studentID){

            this.name=name;
            this.age=age;
            this.gender=gender;
            this.studentID=studentID;

            System.out.println("Name: "+ name+ ", Age:  "+age+ ", Gender: "+ gender+", Student ID: "+studentID);
        }
}

}

//
//        Name: John, Age:  15, Gender: M, Srudent ID: 0
//        John  generally consumes vegetables
//        John went for a walk in the mornings, when John was 12.
//        -----------------
//        Students attend class in weekdays
//        Name: Unal, Age:  27, Gender: M, Student ID: 12345
//        Name: Unal, Age:  27, Gender: M
//        ....................
//        Ebru starts class on time.
//        Name: Ebru, Age:  27, Gender: F, teacher Type: History
//        Name: Ebru, Age:  27, Gender: F
//        .....................
//        Name: Gamze, Age:  19, Gender: F, Student ID: 123
//
//        Name: Hasan, Age:  18, Gender: M, Student ID: 1234
//
//        Name: Cesur, Age:  20, Gender: M, Student ID: 1212
//
//        Student name: Gamze, Student ID: 123
//        Student name: Hasan, Student ID: 1234
//        Student name: Cesur, Student ID: 1212
//
//        Process finished with exit code 0