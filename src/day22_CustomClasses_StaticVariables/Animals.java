package day22_CustomClasses_StaticVariables;

public class Animals {

    String type;// these are instance variables bec there are in che class but outside of the method
    double age;
    String name;
    String color;

    //cretea a method that will set all information for animal objects in one line
    public void setAnimalInfo(String type,double age , String color , String name){

        this.type=type; //java got confused which type that i need to get bec. there are 2 of them one of them outside method, other one is inside method
        //thats why we used this to make sure about specific type.
  ///so this.type= bu kisim methodun disindaki type i temsil ediyor, diger type da methodun icindekini

        //if your method parameters has the same name with class variables
        //use -this-  keyword to point your instance variable

        this.age=age;
        this.color=color;
        this.name=name;
    }

    //create a function that will explain what animal eats
    public void eating(String food){
        System.out.println(name + " is eating " +food);
    }

    //print type of animal
    public void getType(){
        System.out.println(name+ " is a " + type);
    }

    //to print our objets we will need to create a toString method
    public String toString(){
        return name + " - " + type + " - "+ age +  "-" + color;
    }
}