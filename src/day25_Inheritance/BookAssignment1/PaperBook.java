package day25_Inheritance.BookAssignment1;

public class PaperBook  extends Book{



    public PaperBook (String author, String title, double price) {
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public void pages(){
        System.out.println(author+"'s "+ title+ "'s has 332 pages");
    }

    public void readBook(){
        System.out.println(author+"'s "+ title+ " is a Read Book");
    }
}
