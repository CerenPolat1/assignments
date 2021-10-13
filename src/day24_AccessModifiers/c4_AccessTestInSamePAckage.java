package day24_AccessModifiers;

public class c4_AccessTestInSamePAckage {

    public static void main(String[] args) {
        c3_AccessModifiers obj1=new c3_AccessModifiers();

        System.out.println("obj1.publicVariable = " + obj1.publicVariable); // bunu diger class'dan cagirabildik
        System.out.println("obj1.publicVariable = " + obj1.defaultVrble);    // bunu diger class'dan cagirabildik
        System.out.println("obj1.publicVariable = " + obj1.protectedVariable);   // bunu diger class'dan cagirabildik
        // System.out.println("obj1.publicVariable = " + obj1.priavteVariable);    // private oldugu icin cagiramadik diger classtan
        //private will have access only from same class, IF CLASSES DON'T HAVE RELATION.
        //IF CLASSES HAS PARENT CHILD RELATION, IT WILL BE POSSIBLE TO ACCESS

    }
}



///     .....    SO, I CAN CALL PUBLIC, DEFAULT AND PROTECTED FROM OTHER CLASS IN THE SAME PACKAGE
//
//..............   I CAN ALWAYS CALL PUBLIC from EVERY PACKAGE



// ................ I CAN  CALL DEFAULT, IF I AM IN THE SAME PACKAGE

// .............. I CAN  CALL PROTECTED, IF I AM IN THE SAME PACKAGE



///...............I CAN JUST CALL PRIVATE IN THE SAME CLASS