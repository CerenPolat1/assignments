package day29_Polymorphism.polymorphismPractice;


import myMethods.myLibraryMethods;

public class AnimalObjects {

    public static void main(String[] args) {
        Animal animal1=new Animal();
        animal1.eat();
        animal1.growing();
        animal1.animalMethod();

        myLibraryMethods.stars();
        Fish fish1= new Fish("nemo" , 'm' , 20);
        fish1.eat();//result comes from fish
        fish1.growing();//result comes from fish
        fish1.swimming();//result comes from fish
        fish1.animalMethod();//result comes from animal

        myLibraryMethods.stars();
        Animal animal2=new Fish("fish2" , 'f' ,5);

        animal2.eat();//result comes from fish.. ama methodlar animal'dan gelir.sadece bilgiler fish'den tamamlanir
        animal2.growing();//result comes from fish
        animal2.animalMethod();//result comes from animal

        //animal2.swimming()   // this method comes from fish class but fish method  cant use animal object

        //cunku parent'dan (animal), child'i (fish) cagiramazsin
        //yani parent objectinde sadece parenttaki methodlari cagirirsin
        // ekledigin child ile de bilgiler farklilasir
        //or:Animal is eating ->> fish2 is eating olur ama bunun olmasi icin methodsun parentdan gelmesi lazim

        ///create objects for fox fish and animal

    }
}