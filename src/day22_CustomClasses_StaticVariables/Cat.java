package day22_CustomClasses_StaticVariables;

public class Cat {

    //    cat class:
//    data/attributes:  instance variables
//    name, color, age
//
//    actions: instance methods
//    sleep(), eat(), drink() , move()



    String name;
    String color;
    int age;

    public void animalinfo (String name,String color,int age){

        this.name=name;
        this.color=color;
        this.age=age;

        System.out.println("cat's name: "+ name+ ", cat's color: "+ color+ ", cat's age: "+ age);
    }

    public void sleep( int time){

        System.out.println(name+" sleeps at least " + time);

    }

     public void eat( String eating) {
         System.out.println(name+" eats "+ eating);
     }


     public void drink (String drinking){

         System.out.println(name+"drinks "+ drinking);
     }

        public void move (String moving){
            System.out.println(name+" moves "+ moving);
        }


        public String tostring(){

        return name+ " ," + color+ " ,"+ age;
        }


    public static void main(String[] args) {
        Cat info= new Cat();

         info.animalinfo("TOSUN","grey", 5);
         info.sleep(15);
         info.drink("water");
         info.eat("almost everyhing");
         info.move("fast");

    }


}

//
//        cat's name: TOSUN, cat's color: grey, cat's age: 5
//        TOSUN sleeps at least 15
//        TOSUNdrinks water
//        TOSUN eats almost everyhing
//        TOSUN moves fast
//
//        Process finished with exit code 0
