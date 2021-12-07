package day28_Abstraction;

public class c2_Square extends Shape{
    //if i extend parent class that has abstract method
    //those methods need to overriden otherwise your class will give you error

    //shapeName , length
    public final String shapeName="Square";
    public double length;

    public c2_Square(double length){
        this.length=length;
    }

    @Override
    public void shapeName(){
        System.out.println("shapeName = " + shapeName);
    }
    @Override
    public void shapeArea(){
        double area = length * length;
        System.out.println("Area of "+shapeName + " is : " + area);
    }
    //as soon as i override abstract methods error will be dissapear

}


//Shape -parent
//rectangele -child
//rectype1 rectype2 -child of child


//extra note:
// static icin surekli unique diyoruz
//ama bunu unique olmaktan cikarabiliyoruz nasil?
//objectler yaratarak yapiyoruz ama uzun is oluyor

//peki final varken neden static kullaniyoruz cunku belki ilerleyen adimlarda staticgi degistirmek isteyeceksin
//or: diyelim kurum adi TD bunun hep kalacagindan eminden direkt final kullan ama
//eger ilerleyen adimlarda bunu degiatirmeyi duusnursen static yap o zaman unique olmaktan cikarbiilirsin
