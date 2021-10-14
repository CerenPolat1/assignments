package day25_Inheritance.BookAssignment1;

public class BookObjects {
    public static void main(String[] args) {


        AudioBook ilk = new AudioBook("Nazim Hikmet Ran", "Memleketimden Insan Manzaralari", 10.50);

        System.out.println(ilk);
        ilk.length();
        ilk.listening();

        PaperBook ikinci = new PaperBook("Cemal Sureya", "Sevda Sozleri", 22.75);

        System.out.println(ikinci);
        ikinci.pages();
        ikinci.readBook();



    }
}

//
//        Nazim Hikmet Ran / Memleketimden Insan Manzaralari / Price: 10.5
//        Nazim Hikmet Ran's Memleketimden Insan Manzaralari lasts 5 hours to listen
//        Nazim Hikmet Ran's Memleketimden Insan Manzaralari is an Audio Book
//        Cemal Sureya / Sevda Sozleri / Price: 22.75
//        Cemal Sureya's Sevda Sozleri's has 332 pages
//        Cemal Sureya's Sevda Sozleri is a Read Book
//
//        Process finished with exit code 0