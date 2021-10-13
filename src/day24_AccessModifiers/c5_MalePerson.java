package day24_AccessModifiers;

public class c5_MalePerson {

    //create variables for this class


    // UNIQUE OLUP OLMADIGINI NEREDEN ANLIYORUZ, EGER STATICSE UNIQUE OLUR NEDEN CUNKU ONDA ONE COPY OLUYOR.
    //EGER INSTANCE ISE O UNIQUE OLMAZ CUNKU INSTANCE DA MULTUPLE COPY ALIYORSUN VE HER SEFERINDE COPYLER DEGISIYOR O YUZDEN UNIQUE OLMUYOR

    //isHuman
    public static boolean isHuman=true; // public unique variable
    //access level : everywhere

    public static char gender='M'; // public unique variable
    //access level : everywhere

    public String name;  // public not unique CUNKU BU INSTANCE
    //access level : everywhere
    //public will give access to everywhere
    //instance variable that helps to creAte multiple copy of object

    int age; // default and not unique // NEDEN UNIQUE OLMADI CUNKU INSTANCE
    //access level : only in same package

    //ID
    private static long ID=2131423354;//private and unique variable
    //access level : only in same class



}