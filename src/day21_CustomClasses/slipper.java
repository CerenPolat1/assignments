package day21_CustomClasses;

public class slipper {

    //*task1
// create a class called slipper
//Attributes:
//   brand, size , color
//Actions:
//   wear(), setSlipperInfo,  toString;

    String brand;
    int size;
    String color;

    public void wear() {
        System.out.println("Person is wearing " + brand);
    }

    public void getslipperinfo (){
        System.out.println("Information about brand: "+brand+ " ,"  + size + " , " + color);
    }

    public void setSlipperInfo(String slipperBrand, int slipperSize, String slipperColor) {

        System.out.println(brand+" - "+ size+ " - "+ color);
    }

    public String toString() {
        return brand + " - " + size + " - " + color;
    }


    public static void main(String[] args) {


        slipper slipper1 = new slipper();

        slipper1.color= "blue";
        slipper1.brand= "nike";
        slipper1.size= 8;


        //System.out.println("slipper color: "+ slipper1.color+ " ,"+ " slipper brand: "+ slipper1.brand+" ,"+ " slipper color: "+ slipper1.color );


     slipper1.wear();
     slipper1.getslipperinfo();
     slipper1.setSlipperInfo("nike",8,"blue");
                            // " " acmazsan izin vermiyor yazmana



    }
}

//    Person is wearing nike
//    Information about brand: nike ,8 , blue
//
//        Process finished with exit code 0
