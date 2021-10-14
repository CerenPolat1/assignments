package day25_Inheritance;

public class AnimalObject {

    public static void main(String[] args) {
        Animal animal1=new Animal();
        animal1.age=10;
        animal1.name="animal1";
        animal1.color="black";
        animal1.eat("sugar");
        animal1.grow();
        animal1.move();
        System.out.println("animal1.age = " + animal1.age);

        Bird bird1=new Bird();

        // normalde bu age, name, grow, move variable'larini kullanmak icin her hayvan icin ayri ayri olusturman gerekir neden
        //cunku animal'dakiler animal classina ait, bird'u secip animal class'ina ait variableri kullanamazsin
        //hepsinin kendi class'ina ait olmasi lazim
        //ama interid kullanabildigimizden Bird class'ina gelip yanina extends Animal yazarak inheritance yapiyoruz
        //ve bu sekilde bu variable'lari kullanabiliyoruz
        bird1.age=5;
        bird1.name="bird1";
        bird1.grow();  //bunlar neden mor degil cunku bunlari bird class'da kullanmadik o yuzden
        bird1.move();

        bird1.fly();

        //animal1.fly();
        //animal1 is object that comes from Animal class
        //does animal class has fly method? == no
        //so you cant use fly method

        bird1.eat("bread");
        //bird1 is object that comes from Bird class
        //does bird class has eat method??  == yes it has
        //it is taking from parent class (animal)
        //inheritance will help child class (bird)  to have whatever you have in the parent.


        Fox fox1=new Fox();
        fox1.name = "fox1";
        fox1.color="Brown";
        fox1.age=3;
        fox1.weight=20;

        fox1.eat("cheese");
        fox1.grow();
        fox1.move();
        fox1.smileFox();

        // bird1.smileFox();  // it is unique for fox


        //parent class'da tostring methodunu yarattigindan diger child class'lar da hascode'suz calisti
        //childclasslarda tekrardan tostring yaratmana gerek kalamdi
        System.out.println(bird1);
        System.out.println(fox1);
        System.out.println(animal1);
        //....
    }
}